package application;

import java.util.ArrayList;
import java.util.List;

import entities.Billing;
import entities.Chef;
import entities.Customer;
import entities.Employee;
import entities.Menu;
import entities.MenuType;
import entities.Order;
import entities.Person;
import entities.Rating;
import entities.Reservation;
import entities.Stock;
import entities.Table;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Inicizalização das Classes e preenchimento para demonstração, pois não estamos utlizando um banco de dados.
		 * 
		 */
		
		// Employee/Chef registration:
		Chef chef = new Chef(new Person("Joacquin", 60, 'M'), "French food", 200.0);
		Employee employee = new Employee(1, new Person("Alled", 29, 'M'), "Waiter");
		
		// List of available tables in the restaurant:
		List<Table> table = new ArrayList<>();
		table.add(new Table(1, "Outside", 6, true));
		table.add(new Table(2, "Upstairs", 4, true));
		table.add(new Table(3, "Downstairs", 2, true));
		
		// Menu registration:
		List<Menu> menu = new ArrayList<>();
		menu.add(new Menu(MenuType.STARTIER, "Soupe a l'oignon", 20.0));
		menu.add(new Menu(MenuType.MAIN_COURSE, "Ratatouille", 70.0));
		menu.add(new Menu(MenuType.DESSERT, "Petit Gateau", 30.0));
		
		// Ingredients registration:
		Stock stock = new Stock("Soupe", "Salt", 5);
		
		// Register the offer of the day
		for(Menu x : menu) {
			x.sale(10.0);
		}
		
		System.out.println("**** MENU ****");
		for(Menu x : menu) {
			System.out.println(x);
		}
		
		System.out.println("\n**** TABLES ****");
		for(Table x : table) {
			System.out.println(x.checkTables());
		}
		
		// Customer registration:
		Customer customer = new Customer(101, new Person("Ana Paula", 27, 'F'), "ana@gmail.com");
		
		// Table reservation for the customer:
		Reservation reservation = new Reservation(customer, table.get(0), "05/06/2023");
		reservation.selectTable();
		
		System.out.println("\n**** TABLES ****");
		for(Table x : table) {
			System.out.println(x.checkTables());
		}
		
		// Customer order:
		Order order = new Order(customer, reservation.getTable(), menu.get(0), 2);
		
		System.out.println("\nOpen Tab:");
		System.out.println(employee.openTab(order));
		
		System.out.println("\n" + chef.processOrder(order, stock));
		System.out.println("\nStock Quantity remainning: " + stock.getQuantity());
		
		System.out.println("\nCustomer finished ");
		System.out.println(employee.closeTab());
		System.out.println(customer.payTab(order.totalValue()));

		Rating rating = new Rating(5, customer, "Excellent");
		System.out.println("\n" + rating.publishReview());
		
		
		System.out.println();
		
		// Billing:
		Billing billing = new Billing(2000 , 600 , 60);
		System.out.println("\nToday's profit: "  + billing.calculateProfit());
		
		
	}

}
