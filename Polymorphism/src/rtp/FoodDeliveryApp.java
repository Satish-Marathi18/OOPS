package rtp;

public class FoodDeliveryApp {

	void orderFood(){
		System.out.println("Ordering Food");
	}
}

class Swiggy extends FoodDeliveryApp{
	@Override
	void orderFood() {
		System.out.println("Oredering Pizza from swiggy");
	}
}

class Zomato extends FoodDeliveryApp {
	@Override
	void orderFood() {
		System.out.println("Oredering Burger from Zomato");
	}
}
