package myproducts;

public class Bread extends Product {

	double size;
	
	public Bread(String name, int price, int taxPercent, double size) {
		super(name, price, taxPercent);
		this.size=size;
	}

	@Override
	public String toString() {
		return "Bread [toString()=" + super.toString() + ", size=" + size;
	}
	
	public int getWeightedPrice() {
		return (int) (getPriceWithTax()/size);
	}

	public double getSize() {
		return size;
	}
	
	public static boolean compareBreads(Bread bread1, Bread bread2) {
		if (bread1.getWeightedPrice()>bread2.getWeightedPrice()) {
			return true;
		}
		else return false;
	}

	
}
