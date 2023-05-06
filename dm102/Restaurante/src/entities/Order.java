package entities;

public class Order {
	
	private Customer customer;
	private Table table;
	private Employee employee;
	private Menu menuItem;
	private int quantity;
	
	public Order(Customer customer, Table table, Menu menuItem, int quantity) {
		this.customer = customer;
		this.table = table;
		this.menuItem = menuItem;
		this.quantity = quantity;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Menu getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(Menu item) {
		this.menuItem = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//Metodo exclusivo da classe
	
	public double totalValue() {
		return quantity * menuItem.getPrice();
	}

}
