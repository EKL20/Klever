package ekl.taller2.klever;

import org.springframework.stereotype.Component;

@Component
public class InformeVendedorTrimestral implements InformeEmpleado {

	@Override
	public String getInformeVendedor() {
		// TODO Auto-generated method stub
		return "Infome financiero de ventas";
	}

}
