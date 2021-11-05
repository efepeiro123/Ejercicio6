public abstract class Dispositivo {

	double price;
	String serialNumber;
	String manufacturer;
	String productionDate;
	String markerAR;
	String deviceType;

	public Dispositivo(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR, String tipo_dispositivo){
		this.price = precio;
		this.serialNumber = numero_serie;
		this.manufacturer = empresa;
		this.productionDate = fecha_produccion;
		this.markerAR = codigoAR;
		this.deviceType = tipo_dispositivo;
	}
	
	
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


class Smartphone extends Dispositivo implements I_hacer_llamadas,I_tomar_fotografias,I_navegar_por_internet,I_reporducir_multimedia,I_portabilidad{

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

class TelefonoCelular extends Dispositivo implements I_hacer_llamadas,I_portabilidad{

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

class TelefonoFijo extends Dispositivo implements I_hacer_llamadas{

	public TelefonoFijo(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void realizar_llamada(String numero_telefonico) {
		// TODO Auto-generated method stub
		
	}
	
}

class CamaraFotografica extends Dispositivo implements I_tomar_fotografias, I_reporducir_multimedia, I_portabilidad{

	public CamaraFotografica(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void protabilidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir_multimedia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomar_fotografia() {
		// TODO Auto-generated method stub
		
	}

	
}

class ComputadoraPersonalDesktop extends Dispositivo implements I_navegar_por_internet, I_reporducir_multimedia, I_videojuegos{

	public ComputadoraPersonalDesktop(double precio, String numero_serie, String empresa, String fecha_produccion,
			String codigoAR, String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void jugar_videojuego() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir_multimedia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navegar_por_web(String pagina_web) {
		// TODO Auto-generated method stub
		
	}

}

class ComputadoraPersonalLaptop extends Dispositivo implements I_navegar_por_internet, I_videojuegos, I_reporducir_multimedia, I_portabilidad{

	public ComputadoraPersonalLaptop(double precio, String numero_serie, String empresa, String fecha_produccion,
			String codigoAR, String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void protabilidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir_multimedia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugar_videojuego() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navegar_por_web(String pagina_web) {
		// TODO Auto-generated method stub
		
	}

	
}

class SmartTV extends Dispositivo implements I_navegar_por_internet, I_reporducir_multimedia{

	public SmartTV(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void reproducir_multimedia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navegar_por_web(String pagina_web) {
		// TODO Auto-generated method stub
		
	}
	
}

class Tableta extends Dispositivo implements I_tomar_fotografias, I_navegar_por_internet, I_reporducir_multimedia, I_portabilidad{

	public Tableta(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void protabilidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir_multimedia() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navegar_por_web(String pagina_web) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomar_fotografia() {
		// TODO Auto-generated method stub
		
	}

	

}

class SmartWatch extends Dispositivo implements I_tomar_fotografias, I_portabilidad, I_hacer_llamadas{

	public SmartWatch(double precio, String numero_serie, String empresa, String fecha_produccion, String codigoAR,
			String tipo_dispositivo) {
		super(precio, numero_serie, empresa, fecha_produccion, codigoAR, tipo_dispositivo);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void realizar_llamada(String numero_telefonico) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void protabilidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tomar_fotografia() {
		// TODO Auto-generated method stub
		
	}
	
}



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