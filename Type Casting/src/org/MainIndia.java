package org;

public class MainIndia {
	
	static void display(India obj) {
		if(obj instanceof Karnataka) {
			Karnataka k = (Karnataka) obj;
			System.out.println("India PM: "+k.pm+"  "+"Karnataka CM:"+k.cm);
		}
		else if(obj instanceof TamilNadu) {
			TamilNadu t = (TamilNadu) obj;
			System.out.println("India PM: "+t.pm+"  "+"Tamilnadu CM:"+t.cm);
		}
		
		else if(obj instanceof Goa) {
			Goa g = (Goa) obj;
			System.out.println("India PM: "+g.pm+"  "+"Goa CM:"+g.cm);
		}
	}

	public static void main(String[] args) {
		display(new Karnataka());
		System.out.println("-------------------");
		display(new TamilNadu());
		System.out.println("-------------------");
		display(new Goa());
		
	}
}
