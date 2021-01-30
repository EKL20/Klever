package ekl.taller2.klever;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//abrrir el archivo XML
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Leer la class configuration
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataEmpleados.class);
		
		
		//pedir bean al contenedor 
		
		VendedorEmpleado Juan=context.getBean("vendedorEmpleado", VendedorEmpleado.class);
		System.out.println("Encabezado Informe");
		System.out.println("");
		//System.out.println("Nombre Empresa: "+Juan.getNombreComercial());
		//System.out.println("Nit: "+Juan.getNit());
		//System.out.println("Telefono: "+Juan.getTelefono());
		System.out.println("");
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		/*Empleados Cristian=context.getBean("vendedorEmpleado", Empleados.class);
		
		
		System.out.println(Cristian.getInforme());
		System.out.println(Cristian.getTareas());
		*/
		
		
		context.close();
	}

}
