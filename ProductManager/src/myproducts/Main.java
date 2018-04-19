package myproducts;

public class Main {

	public static void main(String[] args) {
		Product product= new Product("Kakao", 200, 27);
		Bread bread= new Bread("Rozs", 250, 14, 0.75);
		System.out.println(product+ " "+ bread);
		
		Product prod2= new Bread("feher", 200, 14, 1);
		System.out.println(prod2);

		Bread bread2= new Bread("Fini", 400, 14, 1);
		if(Bread.compareBreads((Bread) prod2, bread2)) {
			System.out.println(prod2);
		}
		else System.out.println(bread2);
		
		
		

}
}
