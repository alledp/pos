package entities;

public class Employee {
	
	private int id;
	private Person person;
	private String role;
	
	public Employee(int id, Person person, String role) {
		this.id = id;
		this.person = person;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	//Metodos exclusivo da classe
	
	public String openTab(Order order) {
		return "Order received by " + person.getName() +". Customer = " + order.getCustomer().getPerson().getName() + ", Order: " + order.getQuantity() + " " + order.getMenuItem();
	}
	
	public String closeTab() {
		return "The Tab was closed";
	}
	

}
