package semana_03;

public class Factura {
	private  String ruc, empresa;
	private  int uni;
	private  double pre;
	
	private static int cantidad;
	private static double importeFacturado;
	
	public static final String ENTIDAD;
	
	static{
		cantidad = 0;
		importeFacturado = 0;
		ENTIDAD = "Sunat";
		
	}

	public Factura(String ruc, String empresa, int uni, double pre) {
		super();
		this.ruc = ruc;
		this.empresa = empresa;
		this.uni = uni;
		this.pre = pre;
		
		cantidad++;
		 importeFacturado += calcularImporteFacturado();
	}
	
	
	
	public Factura(String ruc, String empresa){
		this(ruc, empresa, 10, 50.0);
	}
	
	
	public Factura(){
		this("11111111111", "MN-Global SRL");
	}



	
	
	public String getRuc() {
		return ruc;
	}



	public void setRuc(String ruc) {
		this.ruc = ruc;
	}



	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}



	public int getUni() {
		return uni;
	}



	public void setUni(int uni) {
		this.uni = uni;
	}



	public double getPre() {
		return pre;
	}



	public void setPre(double pre) {
		this.pre = pre;
	}



	public static int getCantidad() {
		return cantidad;
	}



	public static void setCantidad(int cantidad) {
		Factura.cantidad = cantidad;
	}



	public static double getImporteFacturado() {
		return importeFacturado;
	}



	public static void setImporteFacturado(double importeFacturado) {
		Factura.importeFacturado = importeFacturado;
	}
	
	//Con el metodo void no se retorna
	
	public double calcularImporteFacturado(){
		return uni * pre;
	}
}
