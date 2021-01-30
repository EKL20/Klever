package ekl.taller2.klever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VendedorEmpleado implements Empleados {

	
	//inyeccion con constructor
	/*
	@Autowired
	public VendedorEmpleado(InformeEmpleado informeVentas) {
		this.informeVentas = informeVentas;
	}
	*/
	//inyeccion con metodo setter
	/*@Autowired
	public void setInformeVentas(InformeEmpleado informeVentas) {
		this.informeVentas = informeVentas;
	}
    */
	//inyeccion con objeto encapsulado
	@Autowired
	@Qualifier("informeVendedorTrimestral2")//Se usa para identificar la clase a la que se le va a inyectar la dependencia
	private InformeEmpleado informeVentas;
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe vendedor";
		return informeVentas.getInformeVendedor();
	}
}
