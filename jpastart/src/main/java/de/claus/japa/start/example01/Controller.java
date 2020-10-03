package de.claus.japa.start.example01;

import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import de.claus.japa.start.example01.entities.Employee;

public class Controller {
	public static void main(String[] args) {
		//z.B. aus persistence.xml
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyEmployeeService");
		EntityManager em = factory.createEntityManager();
		
		//Employee erstellen
		Employee employee = new Employee(1);
		em.persist(employee);
		
		//Finden
		Employee emp = em.find(Employee.class, 1);
		//Update --> Geht nur wenn Objekt eine managedPersistence
		emp.setName("Claus");
		//Löschen
		em.remove(emp);
		
		//Transaction
		em.getTransaction().begin();
		//Employee erstellen
		Employee employee2 = new Employee(2);
		employee2.setName("Claus1");
		employee2.setSalary(10000);
		em.persist(employee2);
		em.getTransaction().commit();
		
		//Abfragen auf die DB erstellen
		TypedQuery<Employee> query = em.createQuery("Select e From Employee e",Employee.class);
		Stream<Employee> employees = query.getResultStream();
	}
}
