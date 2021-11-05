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



}
