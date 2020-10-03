package de.claus.japa.start.example01;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import de.claus.japa.start.example01.entities.Employee;
//@Stateful in JEE
public class EmployeeServiceJEE {
	@PersistenceUnit(unitName="EmployeeService")
	private EntityManagerFactory emf;
	private EntityManager em;
		
	public EmployeeServiceJEE() {
		
	}
	//@PostConstruct
	public void init() {
		em = emf.createEntityManager();
	}
	/**
	 * Employee erzeigen
	 * @param id
	 * @param name
	 * @param salary
	 * @return
	 */
	public Employee createEmployee(int id, String name, long salary) {
		Employee employee = new Employee(id);
		employee.setName(name);
		employee.setSalary(salary);
		em.persist(employee);
		return employee;
	}
	/**
	 * Employee löschen
	 * @param id
	 */
	public void removeEmployee(int id) {
		Employee emp = findEmployee(id);
		if(emp != null) {
			em.remove(emp);
		}
	}
	/**
	 * Erhöhe Einkommen
	 * @param id
	 * @param raise
	 * @return
	 */
	public Employee raiseEmployeeSalary(int id, long raise) {
		Employee emp = findEmployee(id);
		if(emp != null) {
			emp.setSalary(emp.getSalary()+raise);
		}
		return emp;
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Employee findEmployee(int id) {
		return em.find(Employee.class, id);
	}
	/**
	 * Gibt alle Employee zurück
	 * @return
	 */
	public List<Employee> findAllEmployees(){
		TypedQuery<Employee> query = em.createQuery("Select e From Employee e",Employee.class);
		return query.getResultList();
	}
}
