package ctp;

public class AmazonMainClass {

	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.buy("Laptop");
		a.buy(50000);
		a.buy("Mobile",25000);
		a.buy(2000,"Watch");
	}
}
