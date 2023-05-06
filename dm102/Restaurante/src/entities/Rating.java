package entities;

public class Rating {
	
	private int rate;
	private Customer customer;
	private String comments;
	
	public Rating(int rate, Customer customer, String comments) {
		this.rate = rate;
		this.customer = customer;
		this.comments = comments;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	//Metodo exclusivo da classe
	
	public String publishReview() {
		return "Review Published! \nRate:" + rate + "\nCustomer: " + customer.getPerson().getName() + "\nComments: " + comments;
	}

}
