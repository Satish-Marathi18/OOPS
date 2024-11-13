package primitivecasting;

public class PrimitiveTypeCastingExample {

	public static void main(String[] args) {
		//widening small to big -> implicitly
		int x = 10;
		double y = x;
		double a = 25;
		System.out.println(x+" "+y+" "+a);
		char b = 'A';
		int c = b;
		System.out.println(b+" "+c);
		char d = ' ';
		int e = d;
		System.out.println(d+" "+e);
		System.out.println("----------------------");

		//Narrowing big to small -> explicitly
		int z = (int) y;
		System.out.println(z);
		int f = (int) 15.38;
		System.out.println(f);
		int g = 68;
		char h = (char) g;
		System.out.println(g+" "+h);
		
		System.out.println("---------------");
		
		System.out.println((int)89.99);//89
		System.out.println((double)89);//89.0
		System.out.println("A"+"B");//AB
		System.out.println("A"+10);//A10
		System.out.println("A"+10+20);//A1020
		System.out.println('A'+"B");//AB
		System.out.println(10+20+"A");//30A
		System.out.println('A'+'B');//131
		System.out.println('a'+20);//117
		
	}
}
