package ekl.Taller.Klever;

public class DirectorEmpleado implements Empleados {

	
	//inyeccion de dependencias Spring
	
	//1. metodo por medio de un constructor
	/*
	private CreacionInformes nuevoInforme;
	
	//Este es el constructor 
	public DirectorEmpleado(CreacionInformes nuevoInforme) {
		this.nuevoInforme= nuevoInforme ;
	}
	
	*/
	
	//2. metodo por medio de Setter
	private CreacionInformes nuevoInforme;
	//inyeccion de campos
	
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	private String telefono;

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	//////////////////////////////////////////////////////////////
	public void setNuevoInforme(CreacionInformes nuevoInforme) {
		this.nuevoInforme= nuevoInforme ;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Direccionar el rumbo de la compania, desde lo macro";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe director: "+nuevoInforme.getInforme();
	}

}
