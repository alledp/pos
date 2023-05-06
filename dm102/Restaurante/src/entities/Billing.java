package entities;

public class Billing {
	
	private double in;
	private double out;
	private double taxes;
	
	public Billing(double in, double out, double taxes) {
		this.in = in;
		this.out = out;
		this.taxes = taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double getIn() {
		return in;
	}

	public void setIn(double in) {
		this.in = in;
	}

	public double getOut() {
		return out;
	}

	public void setOut(double out) {
		this.out = out;
	}

	public double getTaxes() {
		return taxes;
	}
	
	//Metodo exclusivo da classe
	
	public double calculateProfit() {
		return in - out - taxes;
	}


}
