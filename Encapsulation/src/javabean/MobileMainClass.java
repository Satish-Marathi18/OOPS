package javabean;

public class MobileMainClass {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		
		m.setBrand("MI");
		System.out.println("Brand:"+m.getBrand());
		
		m.setCost(15000);
		System.out.println("Cost:"+m.getCost());
	}
}
