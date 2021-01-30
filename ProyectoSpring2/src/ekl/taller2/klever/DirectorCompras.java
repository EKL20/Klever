package ekl.taller2.klever;

import org.springframework.beans.factory.annotation.Value;

public class DirectorCompras implements Empleados {

	public DirectorCompras(InformeEmpleado informeCompras) {
		this.informeCompras = informeCompras;
	}
	
	public String getNit() {
		return nit;
	}
	
	
	public String getNombreComercial() {
		return nombreComercial;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Informe director compras";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeCompras.getInformeVendedor();
	}
	private InformeEmpleado informeCompras;
	//inyeccion de campos con anotaciones
	@Value("${nit}")
	private String nit;
	@Value("${nombreComercial}")
	private String nombreComercial;
	@Value("${telefono}")
	private String telefono;
	
}
