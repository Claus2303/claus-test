package de.claus.japa.start.example01;
/**
 * So k�nnte ein einfacher Service ausschauen
 * @author claus
 *
 */

import java.util.List;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import de.claus.japa.start.example01.entities.Employee;

public class EmployeeService {
	protected EntityManager em;
	
	public EmployeeService(EntityManager em) {
		this.em = em;
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
	 * Employee l�schen
	 * @param id
	 */
	public void removeEmployee(int id) {
		Employee emp = findEmployee(id);
		if(emp != null) {
			em.remove(emp);
		}
	}
	/**
	 * Erh�he Einkommen
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
	 * Gibt alle Employee zur�ck
	 * @return
	 */
	public List<Employee> findAllEmployees(){
		TypedQuery<Employee> query = em.createQuery("Select e From Employee e",Employee.class);
		return query.getResultList();
	}
}
