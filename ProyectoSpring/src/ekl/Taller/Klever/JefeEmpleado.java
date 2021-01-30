package ekl.Taller.Klever;

public class JefeEmpleado implements Empleados{
	
	
	public CreacionInformes nuevoInforme;
	
	public JefeEmpleado(CreacionInformes nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	//Sobre-escritura de metodo 
	public String getTareas() {
		
		return "Gestion recursos y manejo de empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe de Jefe";
	}

}
