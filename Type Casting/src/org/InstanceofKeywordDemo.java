package org;

public class InstanceofKeywordDemo {

	public static void main(String[] args) {
		Father f = new Father();
		Son s = new Son();
		Daughter d = new Daughter();
		
		System.out.println(f instanceof Father);  //true
		System.out.println(s instanceof Son);  //true
		System.out.println(d instanceof Daughter);  //true
		
		System.out.println(s instanceof Father);  //true
		System.out.println(d instanceof Father);  //true
		
		System.out.println(new Father() instanceof Son);  //false
		System.out.println(f instanceof Daughter);  //false
		System.out.println(new Father() instanceof Daughter);
		
	}
}
