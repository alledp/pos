package entities;

public class Chef {
	
	private Person person;
	private String expertise;
	private double costPerHour;
	
	public Chef(Person person, String expertise, double costPerHour) {
		this.person = person;
		this.expertise = expertise;
		this.costPerHour = costPerHour;
		
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	
	//Metodo exclusivo da classe

	public String processOrder(Order order, Stock stock) {
		stock.getItem(order.getMenuItem());
		return "Order delivered to Chef, Starting the preparation";
	}

}
