package myproducts;

public class BreadCopy extends Product {

	private float volume;
	
	public BreadCopy(String name, int price, int taxPercent, float volume) {
		super(name, price, taxPercent);
		this.volume=volume;
	}

}
