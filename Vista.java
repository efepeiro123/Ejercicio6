import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Vista {

    public boolean programa_terminado = true;

    private Scanner sc = new Scanner(System.in);
    
    public String presentar_menu_principal(){

        System.out.println("============ Menu principal ============");
        
        System.out.println("[ 1 ] Ver dispositivos de la tienda");
        System.out.println("[ 2 ] Hacer checkout de carrito ");
        String respuesta = "";
        while(true){
            System.out.print("Respuesta No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }

    }

    public String[] leer_y_analizar_zona(int numero_zona){

        try {
            File myObj = new File("establecimientos.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String[] datos_temporales = data.split(",");
              if(Integer.parseInt(datos_temporales[0]) == numero_zona){
                  return datos_temporales;
              }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
        System.out.println("Existe un error con el csv, intenta de nuevo...");
        e.printStackTrace();
        }
        return new String[0];

    }

    public void realizar_checkout(ArrayList<Dispositivo> carrito_compras){

        System.out.println(carrito_compras.get(0).deviceType);

        System.out.println("============== Checkout ==============");
        System.out.println("");

        System.out.print("Porfavor ingrese su nombre: ");
        String nombre_cliente = sc.nextLine();

        System.out.print("Porfavor ingrese su nit (Consumidor final = cf): ");
        String nit_cliente = sc.nextLine();

        LocalDate myObj = LocalDate.now(); 
        String fecha_emision = myObj.toString();

        Random rand = new Random();
        int numero_factura = rand.nextInt(5000);

        double total_a_pagar = 0;

        for(int i =0; i < carrito_compras.size(); i++){

            total_a_pagar += carrito_compras.get(i).price;

        }

        int zona = 0;
        while(true){
            System.out.print("Porfavor ingrese su zona [ zona 1 a zona 25 ]: ");
            try {

                zona = Integer.parseInt(sc.nextLine());

                for(int i = 1; i < 26; i++){
                    if(zona == i){
                        // La zona si cumple con el rango, nos salimos
                        
                        System.out.println("");

                        System.out.println("========== Imprimiendo Factura ==========");
                        System.out.println("Nit       : " + nit_cliente);
                        System.out.println("Nombre    : " + nombre_cliente);
                        System.out.println("Fecha     : " + fecha_emision);
                        System.out.println("Factura No: " + numero_factura);
                        System.out.println("");
                        for(int j =0; j < carrito_compras.size(); j++){
                            System.out.println((j + 1) + " Dispositivo: " + carrito_compras.get(j).getDeviceType() + " = Q" + carrito_compras.get(j).getPrice());
                            // System.out.println((j + 1) + " Dispositivo: " + carrito_compras.get(j).deviceType + " = Q" + carrito_compras.get(j).price);
                        }
                        System.out.println("");
                        System.out.println("Total a pagar: Q" + total_a_pagar);

                        String[] datos_zona = leer_y_analizar_zona(zona);

                        System.out.println("");
                        // 15,01015,Guatemala,Guatemala
                        System.out.println("Compra realizada en " + datos_zona[3] + "," + datos_zona[2] + " zona " + datos_zona[0] + " con el codigo postal " + datos_zona[1] + ".\n");

                        return;
                    }
                }

                System.out.println("\n! La zona esta fuera del rango disponible, intenta de nuevo...\n");

            } catch (Exception e) {
                System.out.println("\n! Su opcion tiene que ser un numero entero, intenta de nuevo...\n");
            }

        }
        

    }

    public String presentar_menu_dispositivos(){

        System.out.println("========== Menu Dispositivos ===========");
        System.out.println("[ 1 ] Smartphones");
        System.out.println("[ 2 ] Telefonos Celulares");
        System.out.println("[ 3 ] Telefonos Fijos");
        System.out.println("[ 4 ] Camaras Fotograficas");
        System.out.println("[ 5 ] Computadora Desktop");
        System.out.println("[ 6 ] Computadora Laptop");
        System.out.println("[ 7 ] SmartTV");
        System.out.println("[ 8 ] Tablet");
        System.out.println("[ 9 ] Smartwatch");
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3") || respuesta.equals("4") || respuesta.equals("5") || respuesta.equals("6") || respuesta.equals("7") || respuesta.equals("8") || respuesta.equals("9")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String presentar_menu_smartwatch(){

        System.out.println("======= Menu Smartwatch =======");
        System.out.println("[ 1 ] (Apple) Apple Watch");
        System.out.println("[ 2 ] (Huawei) GT e2");
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String presentar_menu_probar_smartwatch(){
        System.out.println("=========== Probar SmartWatch ===========");
        System.out.println("[ 1 ] Hacer llamada");
        System.out.println("[ 2 ] Ponerlo en la muñeca");
        System.out.println("[ 3 ] Tomar fotografai");
       

        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1")|| respuesta.equals("2")|| respuesta.equals("3")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }

    public String presentar_menu_tabletas(){

        System.out.println("======= Menu Tabletas =======");
        System.out.println("[ 1 ] (Apple) Ipad");
        System.out.println("[ 2 ] (Huawei) MediaPad");
        System.out.println("[ 3 ] (Samsung) Galaxy Tab");
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")|| respuesta.equals("3")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String presentar_menu_probar_tableta(){
        System.out.println("=========== Probar Tableta ===========");
        System.out.println("[ 1 ] Guardar en la bolsa");
        System.out.println("[ 2 ] Reproducir multimedia");
        System.out.println("[ 3 ] Navegar por internet");
        System.out.println("[ 4 ] Tomar fotografia");

        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1")|| respuesta.equals("2")|| respuesta.equals("3")|| respuesta.equals("4")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }

    public String presentar_menu_smarttv(){

        System.out.println("======= Menu Smart TV =======");
        System.out.println("[ 1 ] (LG) QNED");
        System.out.println("[ 2 ] (Samsung) TV Samsung");
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String presentar_menu_probar_smarttv(){
        System.out.println("=========== Probar Smart TV ===========");
        System.out.println("[ 1 ] Reproducir multimedia");
        System.out.println("[ 2 ] Navegar por internet");

        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1")|| respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }

    public String presentar_menu_computadoras_laptops(){

        System.out.println("======= Menu Computadoras Laptops =======");
        System.out.println("[ 1 ] (Alienware) x17");
        System.out.println("[ 2 ] (MSI) GE66");
        System.out.println("[ 3 ] (Omen) Omen 10");
        System.out.println("[ 4 ] (ASUS) Asus 15");
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")|| respuesta.equals("3")|| respuesta.equals("4")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String presentar_menu_probar_computadora_laptop(){
        System.out.println("=========== Probar Computadora laptop ===========");
        System.out.println("[ 1 ] Guardar en la bolsa");
        System.out.println("[ 2 ] Reproducir multimedia");
        System.out.println("[ 3 ] Jugar videojuegos");
        System.out.println("[ 4 ] Navegar por internet");

        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1")|| respuesta.equals("2")|| respuesta.equals("3")|| respuesta.equals("4")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }

    public String presentar_menu_computadoras_desktops(){

        System.out.println("======= Menu Computadoras Desktops =======");
        System.out.println("[ 1 ] (Alienware) Aurora");
        System.out.println("[ 2 ] (MSI) Triedent");
        System.out.println("[ 3 ] (Omen) Omen 30L");
        System.out.println("[ 4 ] (ASUS) Zenfone 2");
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")|| respuesta.equals("3")|| respuesta.equals("4")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String presentar_menu_probar_computadora_desktop(){
        System.out.println("=========== Probar Computadora Desktop ===========");
        System.out.println("[ 1 ] Jugar videojuegos");
        System.out.println("[ 2 ] Reproducir multimedia");
        System.out.println("[ 3 ] Navegar por internet");

        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1")|| respuesta.equals("2")|| respuesta.equals("3")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }

    public String presentar_menu_camaras_fotograficas(){

        System.out.println("======= Menu Camaras Fotograficas =======");
        System.out.println("[ 1 ] (Canon) EOS Rebel");
        System.out.println("[ 2 ] (Nikon) Nikon");
        System.out.println("[ 3 ] (Sony) ILCE");
        System.out.println("[ 4 ] (GoPro) Hero 6");
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")|| respuesta.equals("3")|| respuesta.equals("4")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String presentar_menu_probar_camara_fotografica(){
        System.out.println("=========== Probar Camara Fotografica ===========");
        System.out.println("[ 1 ] Guardar en la bolsa");
        System.out.println("[ 2 ] Reproducir multimedia");
        System.out.println("[ 3 ] Tomar fotgrafia");

        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1")|| respuesta.equals("2")|| respuesta.equals("3")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }



    public String presentar_menu_telefonos_fijos(){

        System.out.println("======= Menu Telefonos Fijos =======");
        System.out.println("[ 1 ] (Panasonic) Lcd");
        System.out.println("[ 2 ] (V-tech) Vtc100");
        System.out.println("[ 3 ] (Motorola) Motorola");
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")|| respuesta.equals("3")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }

    public String presentar_menu_probar_telefono_fijo(){
        System.out.println("=========== Probar Telefono Fijo ===========");
        System.out.println("[ 1 ] Hacer llamada");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }









    public String presentar_menu_telefonos_celulares(){

        System.out.println("======= Menu Telefonos Celulares =======");
        System.out.println("[ 1 ] (BlackBerry) BlackBerry");
        System.out.println("[ 2 ] (Movistar) Ult 10");
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }


    public String presentar_menu_smartphone(){

        System.out.println("=========== Menu Smartphones ===========");
        System.out.println("[ 1 ] (Apple) Iphone 11");
        System.out.println("[ 2 ] (Samsung) Galaxy S10");
        System.out.println("[ 3 ] (Huawei) P40");
        System.out.println("[ 4 ] (Xiaomi) Redmi Note 10");
        
        String respuesta = "";
        while(true){
            System.out.print("Dispositivo No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3") || respuesta.equals("4")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }

    }
    public String presentar_menu_probar_telefono_celular(){
        System.out.println("=========== Probar Telefono ===========");
        System.out.println("[ 1 ] Hacer llamada");
        System.out.println("[ 2 ] Guardar en bolsillo");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String presentar_menu_probar_smartphone(){
        System.out.println("========== Probar Smartphone ==========");
        System.out.println("[ 1 ] Hacer llamada");
        System.out.println("[ 2 ] Tomar fotografia");
        System.out.println("[ 3 ] Navegar por internet");
        System.out.println("[ 4 ] Reproducir multimedia");
        System.out.println("[ 5 ] Guardar en bolsillo");
        
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3") || respuesta.equals("4") || respuesta.equals("5")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String retraer_numero_telefonico(){
        System.out.print("\nIngrese el numero telefonico a llamar: ");
        return sc.nextLine();
    }
    public String retraer_pagina_web(){
        System.out.print("\nIngrese el sitio web a visitar: ");
        return sc.nextLine();
    }
    public String agregar_smartphone_a_carrito(){
        System.out.println("==== Agregar Smartphone a carrito? =====");
        System.out.println("[ 1 ] Si");
        System.out.println("[ 2 ] No");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String agregar_telefono_celular_a_carrito(){
        System.out.println("==== Agregar Telefono a carrito? =====");
        System.out.println("[ 1 ] Si");
        System.out.println("[ 2 ] No");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }

    public String agregar_telefono_fijo_a_carrito(){
        System.out.println("==== Agregar Telfono fijo a carrito? =====");
        System.out.println("[ 1 ] Si");
        System.out.println("[ 2 ] No");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String agregar_camara_a_carrito(){
        System.out.println("==== Agregar Camara fotografica a carrito? =====");
        System.out.println("[ 1 ] Si");
        System.out.println("[ 2 ] No");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String agregar_computadora_desktop_a_carrito(){
        System.out.println("==== Agregar Computadora Desktop a carrito? =====");
        System.out.println("[ 1 ] Si");
        System.out.println("[ 2 ] No");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String agregar_computadora_laptop_a_carrito(){
        System.out.println("==== Agregar Computadora Laptop a carrito? =====");
        System.out.println("[ 1 ] Si");
        System.out.println("[ 2 ] No");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String agregar_smarttv_a_carrito(){
        System.out.println("==== Agregar Smart TV a carrito? =====");
        System.out.println("[ 1 ] Si");
        System.out.println("[ 2 ] No");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }
    public String agregar_tableta_a_carrito(){
        System.out.println("==== Agregar Tableta a carrito? =====");
        System.out.println("[ 1 ] Si");
        System.out.println("[ 2 ] No");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }  
    public String agregar_smartwatch_a_carrito(){
        System.out.println("==== Agregar Smartwatch a carrito? =====");
        System.out.println("[ 1 ] Si");
        System.out.println("[ 2 ] No");
        String respuesta = "";
        while(true){
            System.out.print("Opcion No. ");
            respuesta = sc.nextLine();
            if(respuesta.equals("1") || respuesta.equals("2")){
                return respuesta;
            }
            else{
                System.out.println("\n! Opcion no reconocida, intenta de nuevo...\n");
            }
        }
    }  

}
