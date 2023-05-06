package entities;

public class Customer {
	
	private int id;
	private Person person;
	private String email;
	
	public Customer(int id, Person person, String email) {
		this.id = id;
		this.person = person;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//Metodo exclusivo da classe
	
	public String payTab (double totalValue) {
		return "Customer Paid: " + totalValue + " $$" +  " and now he is Poor";
	}

}
