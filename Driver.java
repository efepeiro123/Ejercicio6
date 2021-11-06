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
                modulo_vista.realizar_checkout(carrito_compras);
                modulo_vista.programa_terminado = false;
                break;

            }

        }
    }

    public static void elegir_accion_realizar_smarttv(SmartTV dispositivoSmartTV, String numero_respuesta){

        switch(numero_respuesta){
            case "1":
            dispositivoSmartTV.reproducir_multimedia();
            break;
            case "2":
            dispositivoSmartTV.navegar_por_web(modulo_vista.retraer_pagina_web());
            break;
        }
        switch(modulo_vista.agregar_smarttv_a_carrito()){
            case "1":
            carrito_compras.add(dispositivoSmartTV);
            System.out.println("Su dispositivo ha sido agregado al carrito con exito!");
            break;
            case "2":
            System.out.println("Su dispositivo no ha sido agregado al carrito!");
            break;
        }

    }
    public static void elegir_accion_realizar_tableta(Tableta dispositivoTableta, String numero_respuesta){

        switch(numero_respuesta){
            case "1":
            dispositivoTableta.protabilidad();
            break;
            case "2":
            dispositivoTableta.reproducir_multimedia();
            break;
            case "3":
            dispositivoTableta.navegar_por_web(modulo_vista.retraer_pagina_web());
            break;
            case "4":
            dispositivoTableta.tomar_fotografia();
            break;
        }
        switch(modulo_vista.agregar_tableta_a_carrito()){
            case "1":
            carrito_compras.add(dispositivoTableta);
            System.out.println("Su dispositivo ha sido agregado al carrito con exito!");
            break;
            case "2":
            System.out.println("Su dispositivo no ha sido agregado al carrito!");
            break;
        }

    }
    public static void elegir_accion_realizar_smartwatch(SmartWatch dispositivoSmartWatch, String numero_respuesta){

        switch(numero_respuesta){
            case "1":
            dispositivoSmartWatch.realizar_llamada(modulo_vista.retraer_numero_telefonico());
            break;
            case "2":
            dispositivoSmartWatch.protabilidad();
            break;
            case "3":
            dispositivoSmartWatch.tomar_fotografia();
            break;
        }
        switch(modulo_vista.agregar_smartwatch_a_carrito()){
            case "1":
            carrito_compras.add(dispositivoSmartWatch);
            System.out.println("Su dispositivo ha sido agregado al carrito con exito!");
            break;
            case "2":
            System.out.println("Su dispositivo no ha sido agregado al carrito!");
            break;
        }

    }
    public static void elegir_accion_realizar_computadora_laptop(ComputadoraPersonalLaptop dispositivoComputadaoraLaptop, String numero_respuesta){

        switch(numero_respuesta){
            case "1":
            dispositivoComputadaoraLaptop.protabilidad();
            break;
            case "2":
            dispositivoComputadaoraLaptop.reproducir_multimedia();
            break;
            case "3":
            dispositivoComputadaoraLaptop.jugar_videojuego();
            break;
            case "4":
            dispositivoComputadaoraLaptop.navegar_por_web(modulo_vista.retraer_pagina_web());
            break;
        }
        switch(modulo_vista.agregar_computadora_laptop_a_carrito()){
            case "1":
            carrito_compras.add(dispositivoComputadaoraLaptop);
            System.out.println("Su dispositivo ha sido agregado al carrito con exito!");
            break;
            case "2":
            System.out.println("Su dispositivo no ha sido agregado al carrito!");
            break;
        }

    }

public static void elegir_accion_realizar_computadora_desktop(ComputadoraPersonalDesktop dispositivoComputadaoraDesktop, String numero_respuesta){

        switch(numero_respuesta){
            case "1":
            dispositivoComputadaoraDesktop.jugar_videojuego();
            break;
            case "2":
            dispositivoComputadaoraDesktop.reproducir_multimedia();
            break;
            case "3":
            dispositivoComputadaoraDesktop.navegar_por_web(modulo_vista.retraer_pagina_web());
            break;
        }
        switch(modulo_vista.agregar_computadora_desktop_a_carrito()){
            case "1":
            carrito_compras.add(dispositivoComputadaoraDesktop);
            System.out.println("Su dispositivo ha sido agregado al carrito con exito!");
            break;
            case "2":
            System.out.println("Su dispositivo no ha sido agregado al carrito!");
            break;
        }

    }

    public static void elegir_accion_realizar_camara_fotgrafica(CamaraFotografica dispositivoCamaraFotografica, String numero_respuesta){

        switch(numero_respuesta){
            case "1":
            dispositivoCamaraFotografica.protabilidad();
            break;
            case "2":
            dispositivoCamaraFotografica.reproducir_multimedia();
            break;
            case "3":
            dispositivoCamaraFotografica.tomar_fotografia();
            break;
            
        }
        switch(modulo_vista.agregar_camara_a_carrito()){
            case "1":
            carrito_compras.add(dispositivoCamaraFotografica);
            System.out.println("Su dispositivo ha sido agregado al carrito con exito!");
            break;
            case "2":
            System.out.println("Su dispositivo no ha sido agregado al carrito!");
            break;
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
    public static void elegir_accion_realizar_telefono_fijo(TelefonoFijo dispositivo_telefono, String numero_respuesta){
        switch(numero_respuesta){
            case "1":
            dispositivo_telefono.realizar_llamada(modulo_vista.retraer_numero_telefonico());
            break;
        }
        switch(modulo_vista.agregar_telefono_fijo_a_carrito())
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
            Smartphone galaxy = new Smartphone(10000.00f, "B304", "Samsung", "10/06/2020", "KLFAJ9I22", "Galaxy S10");
            elegir_accion_realizar_smartphone(galaxy, modulo_vista.presentar_menu_probar_smartphone());
            break;
            case "3":
            Smartphone p40 = new Smartphone(9000.00f, "RT50", "Huawei", "01/28/2020", "JADSJF203", "P40");
            elegir_accion_realizar_smartphone(p40, modulo_vista.presentar_menu_probar_smartphone());
            // Huawei
            break;
            case "4":
            Smartphone redmi = new Smartphone(8500.00f, "RWL6", "Xiomi", "08/04/2021", "KJFSKDLGJ034", " Redmi Note 10");
            elegir_accion_realizar_smartphone(redmi, modulo_vista.presentar_menu_probar_smartphone());
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
            TelefonoCelular ult = new TelefonoCelular(900.00f, "FT43", "Movistar", "20/08/2010", "ÑFJDApoa34", "Ult 10");
            elegir_accion_realizar_telefono_celular(ult, modulo_vista.presentar_menu_probar_telefono_celular());
            break;

        }

    }

    public static void elegir_dispositivo_telefono_fijo(String numero_dispositivo_fijo){
        switch(numero_dispositivo_fijo){

            case "1":
            // Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            TelefonoFijo lcd = new TelefonoFijo(950.00f, "23JK", "Panasonic", "13/05/2012", "LKSJD12321", "Lcd");
            elegir_accion_realizar_telefono_fijo(lcd, modulo_vista.presentar_menu_probar_telefono_fijo());
            break;

            case "2":
            TelefonoFijo vtc100 = new TelefonoFijo(700.00f, "WERT", "V-tech", "20/01/2010", "FKLAruiew2", "Vtc100");
            elegir_accion_realizar_telefono_fijo(vtc100, modulo_vista.presentar_menu_probar_telefono_fijo());
            break;

            case "3":
            TelefonoFijo motorola = new TelefonoFijo(500.00f, "BUTU", "Motorola", "30/07/2010", "KJLFDAewrio3", "Motorola");
            elegir_accion_realizar_telefono_fijo(motorola, modulo_vista.presentar_menu_probar_telefono_fijo());
            break;
        }

    }

    public static void elegir_dispositivo_camara_fotografica(String numero_dispositivo_camara){
        switch(numero_dispositivo_camara){

            case "1":
            // Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            CamaraFotografica eos = new CamaraFotografica(5000.00f, "KJDS", "Canon", "13/05/2015", "LKSJD12321", "EOS Rebel");
            elegir_accion_realizar_camara_fotgrafica(eos, modulo_vista.presentar_menu_probar_camara_fotografica());
            break;

            case "2":
            CamaraFotografica nicon = new CamaraFotografica(7000.00f, "ERTO", "Nicon", "20/01/2016", "FKLAruiew2", "Nikon");
            elegir_accion_realizar_camara_fotgrafica(nicon, modulo_vista.presentar_menu_probar_camara_fotografica());
            break;

            case "3":
            CamaraFotografica ilce = new CamaraFotografica(3500.00f, "PO23", "Sony", "30/07/2020", "KJLFDAewrio3", "ILCE");
            elegir_accion_realizar_camara_fotgrafica(ilce, modulo_vista.presentar_menu_probar_camara_fotografica());
            break;

            case "4":
            CamaraFotografica heroe = new CamaraFotografica(10000.00f, "POI5", "GoPro", "30/07/2018", "KJLFDAewrio3", "Heroe 6");
            elegir_accion_realizar_camara_fotgrafica(heroe, modulo_vista.presentar_menu_probar_camara_fotografica());
            break;
        }

    }

    public static void elegir_dispositivo_computadora_desktop(String numero_dispositivo_computadora_desktop){
        switch(numero_dispositivo_computadora_desktop){

            case "1":
            // Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            ComputadoraPersonalDesktop aurora = new ComputadoraPersonalDesktop(50000.00f, "DSKJ", "Alienware", "13/10/2015", "JKSHADHA8W83", "Aurora");
            elegir_accion_realizar_computadora_desktop(aurora, modulo_vista.presentar_menu_probar_computadora_desktop());
            break;

            case "2":
            ComputadoraPersonalDesktop trident = new ComputadoraPersonalDesktop(70000.00f, "EWPO", "MSI", "20/02/2016", "CNLKS4249", "Trident");
            elegir_accion_realizar_computadora_desktop(trident, modulo_vista.presentar_menu_probar_computadora_desktop());
            break;

            case "3":
            ComputadoraPersonalDesktop omen = new ComputadoraPersonalDesktop(35000.00f, "NY73", "Omen", "30/09/2020", "NVLKSAJHA098432", "Omen 30L");
            elegir_accion_realizar_computadora_desktop(omen, modulo_vista.presentar_menu_probar_computadora_desktop());
            break;

            case "4":
            ComputadoraPersonalDesktop zenfone = new ComputadoraPersonalDesktop(80000.00f, "XC9O", "Asus", "30/01/2018", "LKDAKSQOI920", "Zenfone 2L");
            elegir_accion_realizar_computadora_desktop(zenfone, modulo_vista.presentar_menu_probar_computadora_desktop());
            break;
        }

    }
    public static void elegir_dispositivo_computadora_laptop(String numero_dispositivo_computadora_laptop){
        switch(numero_dispositivo_computadora_laptop){

            case "1":
            // Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            ComputadoraPersonalLaptop x17 = new ComputadoraPersonalLaptop(25000.00f, "DSKJ", "Alienware", "13/10/2015", "JKSHADHA8W83", "x17");
            elegir_accion_realizar_computadora_laptop(x17, modulo_vista.presentar_menu_probar_computadora_laptop());
            break;

            case "2":
            ComputadoraPersonalLaptop ge66 = new ComputadoraPersonalLaptop(35000.00f, "EWPO", "MSI", "20/02/2016", "CNLKS4249", "GE66");
            elegir_accion_realizar_computadora_laptop(ge66, modulo_vista.presentar_menu_probar_computadora_laptop());
            break;

            case "3":
            ComputadoraPersonalLaptop omen10 = new ComputadoraPersonalLaptop(15000.00f, "NY73", "Omen", "30/09/2020", "NVLKSAJHA098432", "Omen 10");
            elegir_accion_realizar_computadora_laptop(omen10, modulo_vista.presentar_menu_probar_computadora_laptop());
            break;

            case "4":
            ComputadoraPersonalLaptop asus = new ComputadoraPersonalLaptop(40000.00f, "XC9O", "Asus", "30/01/2018", "LKDAKSQOI920", "Asus 15");
            elegir_accion_realizar_computadora_laptop(asus, modulo_vista.presentar_menu_probar_computadora_laptop());
            break;
        }

    }
    public static void elegir_dispositivo_tableta(String numero_dispositivo_tableta){
        switch(numero_dispositivo_tableta){

            case "1":
            // Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            Tableta ipad = new Tableta(5000.00f, "GHT6", "Apple", "23/09/2019", "JDSHA3204", "Ipad");
            elegir_accion_realizar_tableta(ipad, modulo_vista.presentar_menu_probar_tableta());
            break;

            case "2":
            Tableta mediapad = new Tableta(3000.00f, "323O", "Huawei", "02/02/2020", "CBALJDjhajda03", "Mediapad");
            elegir_accion_realizar_tableta(mediapad, modulo_vista.presentar_menu_probar_tableta());
            break;

            case "3":
            Tableta galaxypad = new Tableta(1000.00f, "DSKJ", "Samsung", "31/12/2018", "JHDSAHhdsah89", "GALAXY Pad");
            elegir_accion_realizar_tableta(galaxypad, modulo_vista.presentar_menu_probar_tableta());
            break;

        }

    }
    public static void elegir_dispositivo_smarttv(String numero_dispositivo_smarttv){
        switch(numero_dispositivo_smarttv){

            case "1":
            // Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            SmartTV qned = new SmartTV(10000.00f, "SD90", "LG", "13/10/2017", "CAKJCKSAAJSHD", "QNED");
            elegir_accion_realizar_smarttv(qned, modulo_vista.presentar_menu_probar_smarttv());
            break;

            case "2":
            SmartTV samsung = new SmartTV(15000.00f, "RE46", "Samsung", "15/09/2018", "KJSDFHDSÑKjskjsk", "TV Samsung");
            elegir_accion_realizar_smarttv(samsung, modulo_vista.presentar_menu_probar_smarttv());
            break;

        }

    }
    public static void elegir_dispositivo_smartwatch(String numero_dispositivo_smartwatch){
        switch(numero_dispositivo_smartwatch){

            case "1":
            // Smartphone iphone = new Smartphone(13000.00f, "AF04", "Apple", "12/04/2019", "AfSKllliO", "Iphone");
            // elegir_accion_realizar_smartphone(iphone, modulo_vista.presentar_menu_probar_smartphone());
            SmartWatch apple = new SmartWatch(5000.00f, "LKSA", "Apple", "13/10/2021", "JDSKJSALKiquqi9098", "Apple Watch");
            elegir_accion_realizar_smartwatch(apple, modulo_vista.presentar_menu_probar_smartwatch());
            break;

            case "2":
            SmartWatch gt = new SmartWatch(5000.00f, "OI09", "Huawei", "20/02/2020", "CNLKS424uouñ9", "GT e2");
            elegir_accion_realizar_smartwatch(gt, modulo_vista.presentar_menu_probar_smartwatch());
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
            elegir_dispositivo_telefono_fijo(modulo_vista.presentar_menu_telefonos_fijos());
            break;
            case "4":
            elegir_dispositivo_camara_fotografica(modulo_vista.presentar_menu_camaras_fotograficas());
            break;
            case "5":
            elegir_dispositivo_computadora_desktop(modulo_vista.presentar_menu_computadoras_desktops());
            break;
            case "6":
            elegir_dispositivo_computadora_laptop(modulo_vista.presentar_menu_computadoras_laptops());
            break;
            case "7":
            elegir_dispositivo_smarttv(modulo_vista.presentar_menu_smarttv());
            break;
            case "8":
            elegir_dispositivo_tableta(modulo_vista.presentar_menu_tabletas());
            break;
            case "9":
            elegir_dispositivo_smartwatch(modulo_vista.presentar_menu_smartwatch());
            break;

        }

    }
}

