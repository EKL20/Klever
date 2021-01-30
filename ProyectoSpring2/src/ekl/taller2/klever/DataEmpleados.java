package ekl.taller2.klever;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ekl.taller2.klever")
@PropertySource("classpath:DataGlobal.taller")
public class DataEmpleados {
	
	//Definir el bean para el informe de compras
	@Bean 
	public InformeEmpleado informeCompras() {//este es el id del bean inyectado
		return new InformeFinancieroCompras();
	}
	
	//Definir el bean para el director de compras e inyeccion de dependencias
	@Bean 
	public Empleados directorCompras() {
		return new DirectorCompras(informeCompras());
	}

}
