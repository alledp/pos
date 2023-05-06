package entities;

public class Reservation {
	
	private Customer customer;
	private Table table;
	private String date;
	
	public Reservation(Customer customer, Table table, String date) {
		this.customer = customer;
		this.table = table;
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	//Metodo exclusivo da classe
	
	public void selectTable() {
		table.setAvailable(false);
	}


}
