package test;

import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import testAppAdminEmpre.model.Empleado;

public class TestEmpleado {
	
	
	private static EntityManager manager;
	private static EntityManagerFactory emf;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creamos un gestor de persistencia
		emf = Persistence.createEntityManagerFactory("Persistencia");
		manager = emf.createEntityManager();
		
		//List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		//System.out.println("En esta base de datos hay "+ empleados.size() +" empleados");
	
		imprimirTodo();
		
		Empleado e = new Empleado(13L, "Jampool", "garcia", new GregorianCalendar(1993, 31, 12).getTime());
	
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		
		
		imprimirTodo();
	}
	
	private static void imprimirTodo() {
		List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		System.out.println("En esta base de datos hay "+ empleados.size() +" empleados");
		
		for (Empleado emp: empleados) System.out.println(emp.toString());
	}

}
