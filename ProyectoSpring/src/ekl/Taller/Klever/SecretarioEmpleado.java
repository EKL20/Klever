package ekl.Taller.Klever;

public class SecretarioEmpleado implements Empleados {
	
	public CreacionInformes nuevoInforme;
	
	public SecretarioEmpleado(CreacionInformes nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Funciones realizadas, a partir de las funciones de Jefe de area";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de secretario";
	}

}
