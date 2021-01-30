package ekl.Taller.Klever;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//paso manual de instanciacion de objetos
		//Creacion de objetos por abstraccion 
		
		Empleados JefeArea= new JefeEmpleado();
		Empleados Secretario1= new SecretarioEmpleado();
		Empleados Presidente= new DirectorEmpleado();
		
		//Uso de objetos creados
		
		System.out.println(JefeArea.getTareas());
		System.out.println(Secretario1.getTareas());
		System.out.println(Presidente.getTareas());
		
		*/
		
		
		//Instanciacion de clases usando el archivo de configuracion  XML de spring
		
		//Lo primero es crear un contexto, que lo que hace es cargar el archivo XML
		
		// de esta manera se carga el archivo XML
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		//Se instancia el objeto, y en los parametros se pasan el id del bean del XML y el nombre de la interface
		
		Empleados Elkin=context.getBean("myEmpleado", Empleados.class);
		
		
		System.out.println(Elkin.getTareas());
		System.out.println(Elkin.getInforme());
		
		//por ultimo cerramos el contexto
		context.close();
		
	*/
		// esta seria la forma de mostrar su ejecucion con el setter
		//se cambia el nombre del id del bena al que contiene la config del setter
		
		//para obtener los nuevos campos inyectados debemos modificar los parametros
		//en el objeto Elkin y marcar la clase con la que se esta trabajando
		DirectorEmpleado Elkin=context.getBean("setEmpleado", DirectorEmpleado.class);
		
		System.out.println(Elkin.getTareas());
		System.out.println(Elkin.getInforme());
		System.out.println("E-mail: "+Elkin.getEmail());
		System.out.println("Telefono: "+Elkin.getTelefono());
		
		
		
		context.close();

	}

}
