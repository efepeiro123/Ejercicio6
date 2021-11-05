import java.util.ArrayList;

public class Driver {

    private static ArrayList<Dispositivo> carrito_compras = new ArrayList<>();
    private static Vista modulo_vista = new Vista();
    public static void main(String[] args) {
        
        while(modulo_vista.programa_terminado){

            String respuesta = modulo_vista.presentar_menu_principal();
            switch(respuesta){

                case "1":
                // Mostrar los dispositivos:
                elegir_dispositivo(modulo_vista.presentar_menu_dispositivos(), modulo_vista);
                break;

                case "2":
                // Hacer checkout del carrito:
                modulo_vista.programa_terminado = false;
                break;

            }

        }
    }

    public static void elegir_accion_realizar_smartphone(Smartphone dispositivoSmartphone, String numero_respuesta){

        switch(numero_respuesta){
            case "1":
            dispositivoSmartphone.realizar_llamada(modulo_vista.retraer_numero_telefonico());
            break;
            case "2":
            dispositivoSmartphone.tomar_fotografia();
            break;
            case "3":
            dispositivoSmartphone.navegar_por_web(modulo_vista.retraer_pagina_web());
            break;
            case "4":
            dispositivoSmartphone.reproducir_multimedia();
            break;
            case "5":
            dispositivoSmartphone.protabilidad();
            break;
        }
        switch(modulo_vista.agregar_smartphone_a_carrito()){
            case "1":
            carrito_compras.add(dispositivoSmartphone);
            System.out.println("Su dispositivo ha sido agregado al carrito con exito!");
            break;
            case "2":
            System.out.println("Su dispositivo no ha sido agregado al carrito!");
            break;
        }

    }
    public static void elegir_accion_realizar_telefono_celular(TelefonoCelular dispositivo_telefono, String numero_respuesta){
        switch(numero_respuesta){
            case "1":
            dispositivo_telefono.realizar_llamada(modulo_vista.retraer_numero_telefonico());
            break;
            case "2":
            dispositivo_telefono.protabilidad();
            break;
        }
        switch(modulo_vista.agregar_telefono_celular_a_carrito())
        {
            case "1":
            carrito_compras.add(dispositivo_telefono);
            System.out.println("Su dispositivo ha sido agregado al carrito con exito!");
            break;
            case "2":
            System.out.println("Su dispositivo no ha sido agregado al carrito!");
            break;
        }
    }

    public static void elegir_dispositivo_smartphone(String numero_dispositivo_smartphone){

        switch(numero_dispositivo_smartphone){

            case "1":
            // Iphone
            // double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,String tipo_dispositivo
            Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            break;

            case "2":
            // Samsung
            break;
            case "3":
            // Huawei
            break;
            case "4":
            // Xiomi
            break;

        }

    }

    public static void elegir_dispositivo_telefono_celular(String numero_dispositivo_celular){
        switch(numero_dispositivo_celular){

            case "1":
            // Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            TelefonoCelular blackberry = new TelefonoCelular(3000.00f, "54FK", "BlackBerry", "13/05/2010", "FSDKaksksL1", "BlackBerry");
            elegir_accion_realizar_telefono_celular(blackberry, modulo_vista.presentar_menu_probar_telefono_celular());
            break;

            case "2":
            break;

        }
    }

    public static void elegir_dispositivo(String numero_dispositivo, Vista modulo_vista){

        switch(numero_dispositivo){

            case "1":
            elegir_dispositivo_smartphone(modulo_vista.presentar_menu_smartphone());
            break;
            case "2":
            elegir_dispositivo_telefono_celular(modulo_vista.presentar_menu_telefonos_celulares());
            break;
            case "3":

            // Creaar un metodo para la seleccion de todas las marcas del dispositivos que acabas de elegir:
            // Lo que se le pasa como parametro es un menu donde el pueda ver cuales disp estan disponibles:
            // System.out.println("[ 1 ] (Apple) Iphone 11");
            // System.out.println("[ 2 ] (Samsung) Galaxy S10");
            // System.out.println("[ 3 ] (Huawei) P40");
            // System.out.println("[ 4 ] (Xiaomi) Redmi Note 10");
            // elegir_dispositivo_telefono_celular(   modulo_vista.presentar_menu_telefonos_celulares() );


            // En el metodo revisas que dispositivo elegiste hacia hayan 3 dispositivos tenes que hacer 3 cases:
            // case "1":
            // // Iphone
            // // double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,String tipo_dispositivo
            // Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            // break;

            // case "2":
            // // Samsung
            // break;



            // TelefonoFijo nombre_modelo_eligio = new TelefonoFijo(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // Crear un metodo para poder probar el dispositivo: 
            // elegir_accion_realizar_telefono_fijo -> Parametros el telefono que acabas de crear y un menu en el que se presenten las opciones que puede hacer dicho dispositivo:
            // System.out.println("=========== Probar Telefono Fijo ===========");
            // System.out.println("[ 1 ] Hacer llamada");

            // Ahora analisas que opcion eligio previamente en el metodo elegir_accion_realizar_telefono_fijo:

            // Una vez que lo hay probado reescribiendo los metodos en la clase dispsitivo le preguntamos is lo quiere agregar agregar al carrito:

            // @Override
            // public void realizar_llamada(String numero_telefonico) {
            //     // TODO Auto-generated method stub
                
            // }

            // -----------> 

            // @Override
            // public void realizar_llamada(String numero_telefonico) {
            //     sysout("La accion que correesponde al metodo")      
            // }

            // Despues en el mismo metodo le preguntas si lo quiere agregar al carrito:
            // switch(modulo_vista.agregar_telefono_celular_a_carrito()) <--- Crear un metodo en vista para preguntarle si quiere agregar el dispositivo actual: 
            // {
            //     case "1":
            //     carrito_compras.add(dispositivo_telefono);
            //     System.out.println("Su dispositivo ha sido agregado al carrito con exito!");
            //     break;
            //     case "2":
            //     System.out.println("Su dispositivo no ha sido agregado al carrito!");
            //     break;
            // }


            // Para guardad y retraer archivos csv:
            // https://www.geeksforgeeks.org/reading-csv-file-java-using-opencsv/


            break;
            case "4":
            break;
            case "5":
            break;
            case "6":
            break;
            case "7":
            break;
            case "8":
            break;
            case "9":
            break;

        }

    }
}

