 package myproducts;

public class Product {

	private String name;
	private int price;
	private int taxPercent;
	
	public int getPriceWithTax() {

		return price+(price*taxPercent/100);
		
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", getPriceWithTax()=" + getPriceWithTax() + "]";
	}

	public Product(String name, int price, int taxPercent) {
		super();
		this.name = name;
		this.price = price;
		this.taxPercent = taxPercent;
	}
	
	public void increasePrice(int percentage) {
		this.price= price+(price*percentage/100);
	}
	
	public int isMoreExpensiveThan(Product product) {
		if (this.getPriceWithTax()>product.getPriceWithTax()) {
			return 1;
		}
		else if (this.getPriceWithTax()==product.getPriceWithTax()) {
			return 0;
		}
		else return -1;
	}
}
