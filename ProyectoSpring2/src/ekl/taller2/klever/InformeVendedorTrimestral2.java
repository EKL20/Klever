package ekl.taller2.klever;

import org.springframework.stereotype.Component;

@Component
public class InformeVendedorTrimestral2 implements InformeEmpleado {

	@Override
	public String getInformeVendedor() {
		// TODO Auto-generated method stub
		return "Informe de segundo trimestre";
	}

}
