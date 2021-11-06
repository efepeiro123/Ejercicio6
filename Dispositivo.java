/**
 * <h1>Ejercicio 6</h1>
 * <h2> Dispositivo </h2>
 * 
 * <p>
 * Programación Orientada a Objetos - Universidad del Valle de Guatemala
 * </p>
 * 
 * Creado por:
 * 
 * @author [Evelyn Fernanda López Peiro, 21126]
 * @author [Pedro Camposeco, 21360]
 * @version 1.0
 * @since 2021-Noviembre-6
 * 
 * 
 **/ 


public abstract class Dispositivo {

	double price;
	String serialNumber;
	String manufacturer;
	String productionDate;
	String markerAR;
	String deviceType;

    //Constructor
	public Dispositivo(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR, String tipo_dispositivo){
		this.price = precio;
		this.serialNumber = numero_serie;
		this.manufacturer = empresa;
		this.productionDate = fecha_produccion;
		this.markerAR = codigoAR;
		this.deviceType = tipo_dispositivo;
	}
	//***************************************************************************** */
	//Getters y setters
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getProductionDate() {
		return productionDate;
	}
	
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	
	public String getMarkerAR() {
		return markerAR;
	}
	
	public void setMarkerAR(String markerAR) {
		this.markerAR = markerAR;
	}
	
	
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return this.serialNumber;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
}

//************************************** */


//Clase smartphone
class Smartphone extends Dispositivo implements I_hacer_llamadas,I_tomar_fotografias,I_navegar_por_internet,I_reporducir_multimedia,I_portabilidad{

    //Construcor 
	public Smartphone(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
	}

	@Override
	public void realizar_llamada(String numero_telefonico) {
		System.out.println("Realizando una llamada desde mi smartphone " + this.deviceType +  " hacia: " + numero_telefonico);
	}

	@Override
	public void protabilidad() {
		System.out.println("Guardando en mi bolsillo mi smartphone " + this.deviceType + "!");
	}

	@Override
	public void reproducir_multimedia() {
		System.out.println("Reproduciendo multimedia desde mi smartphone " + this.deviceType + "!");
	}

	@Override
	public void navegar_por_web(String pagina_web) {
		System.out.println("Navegando desde mi smartphone " + this.deviceType + " a: " + pagina_web);
		
	}

	@Override
	public void tomar_fotografia() {
		System.out.println("Tomando una fotografia desde mi smartphone " + this.deviceType + "! CLICK!");
	}

}

//Clase TelefonoCelular
class TelefonoCelular extends Dispositivo implements I_hacer_llamadas,I_portabilidad{

    //Constructor
	public TelefonoCelular(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
	}

	@Override
	public void protabilidad() {
		System.out.println("Guardando en mi bolsillo mi telefono celular " + this.deviceType + "!");
	}

	@Override
	public void realizar_llamada(String numero_telefonico) {
		System.out.println("Realizando una llamada desde mi telefono celular " + this.deviceType +  " hacia: " + numero_telefonico);
	}
	
}

//Clase TelefonoFijo
class TelefonoFijo extends Dispositivo implements I_hacer_llamadas{

    //Constructor
	public TelefonoFijo(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void realizar_llamada(String numero_telefonico) {
		System.out.println("Realizando una llamada desde mi telefono fijo " + this.deviceType +  " hacia: " + numero_telefonico);
		// TODO Auto-generated method stub
		
	}
	
}

//Clase CamaraFotografica
class CamaraFotografica extends Dispositivo implements I_tomar_fotografias, I_reporducir_multimedia, I_portabilidad{

    //Constructor
	public CamaraFotografica(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void protabilidad() {
		System.out.println("Guardando en mi bolsa la camara fotografica " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir_multimedia() {
		System.out.println("Reproduciendo multimedia desde mi camara fotografica " + this.deviceType + "!");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomar_fotografia() {
		System.out.println("Tomando una fotografia desde mi camara fotografica " + this.deviceType + "! CLICK!");
		// TODO Auto-generated method stub
		
	}

	
}

//Clase ComputadoraPersonalDesktop
class ComputadoraPersonalDesktop extends Dispositivo implements I_navegar_por_internet, I_reporducir_multimedia, I_videojuegos{

    //ComputadoraPersonalDesktop
	public ComputadoraPersonalDesktop(double precio, String numero_serie, String empresa, String fecha_produccion,
			String codigoAR, String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void jugar_videojuego() {
		System.out.println("Jugando DOOM desde mi computadora desktop " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir_multimedia() {
		System.out.println("Reproduciendo multimedia desde mi computadora desktop " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navegar_por_web(String pagina_web) {
		System.out.println("Navegando desde mi computadora desktop " + this.deviceType + " a: " + pagina_web);
		// TODO Auto-generated method stub
		
	}

}

//Clase ComputaodraPersonalLaptop
class ComputadoraPersonalLaptop extends Dispositivo implements I_navegar_por_internet, I_videojuegos, I_reporducir_multimedia, I_portabilidad{

    //Constructor
	public ComputadoraPersonalLaptop(double precio, String numero_serie, String empresa, String fecha_produccion,
			String codigoAR, String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void protabilidad() {
		System.out.println("Guardando en mi bolsa la computadora laptop " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir_multimedia() {
		System.out.println("Reproduciendo multimedia desde mi computadora laptop " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar_videojuego() {
		System.out.println("Jugando Mario 64 desde mi computadora laptop " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navegar_por_web(String pagina_web) {
		System.out.println("Navegando desde mi computadora laptop " + this.deviceType + " a: " + pagina_web);
		// TODO Auto-generated method stub
		
	}

	
}

//Clase SmartTV
class SmartTV extends Dispositivo implements I_navegar_por_internet, I_reporducir_multimedia{

    //Constructor
	public SmartTV(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void reproducir_multimedia() {
		System.out.println("Reproduciendo multimedia desde mi smart tv " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navegar_por_web(String pagina_web) {
		System.out.println("Navegando desde mi smart tv " + this.deviceType + " a: " + pagina_web);
		// TODO Auto-generated method stub
		
	}
	
}

//Clase Tableta
class Tableta extends Dispositivo implements I_tomar_fotografias, I_navegar_por_internet, I_reporducir_multimedia, I_portabilidad{

    //Constructor
	public Tableta(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void protabilidad() {
		System.out.println("Guardando en mi bolsa la tableta " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir_multimedia() {
		System.out.println("Reproduciendo multimedia desde mi tableta " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navegar_por_web(String pagina_web) {
		System.out.println("Navegando desde mi tableta " + this.deviceType + " a: " + pagina_web);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomar_fotografia() {
		System.out.println("Tomando una fotografia desde mi tableta" + this.deviceType + "! CLICK!");
		// TODO Auto-generated method stub
		
	}

	

}


//Clase SmartWatch
class SmartWatch extends Dispositivo implements I_tomar_fotografias, I_portabilidad, I_hacer_llamadas{

    //Constructor
	public SmartWatch(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void realizar_llamada(String numero_telefonico) {
		System.out.println("Realizando una llamada desde mi smartwatch " + this.deviceType +  " hacia: " + numero_telefonico);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void protabilidad() {
		System.out.println("Poniendo en mi muñeca mi smartwatch " + this.deviceType + "!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomar_fotografia() {
		System.out.println("Tomando una fotografia desde mi smartwatch " + this.deviceType + "! CLICK!");
		// TODO Auto-generated method stub
		
	}
	
}



//************INTERFACES******************************* */

interface I_hacer_llamadas{
	// Interfaz que hacer capaz de realizar llamadas a los objetos que o implementen:
	void realizar_llamada(String numero_telefonico);
}

interface I_tomar_fotografias{
	// Interfaz que hacer capaz de tomar fotografias a los objetos que o implementen:
	void tomar_fotografia();
}

interface I_navegar_por_internet{
	// Interfaz que hacer capaz de navegar por internet a los objetos que o implementen:
	void navegar_por_web(String pagina_web);
}

interface I_reporducir_multimedia{
	// Interfaz que hacer capaz de reproducir multimedia a los objetos que o implementen:
	void reproducir_multimedia();
}

interface I_portabilidad{
	// Interfaz que hacer capaz de ser portables a los objetos que o implementen:
	void protabilidad();
}

interface I_videojuegos{
	// Interfaz que hacer capaz de jugar videojuegos a los objetos que o implementen:
	void jugar_videojuego();
}

