package nonprimitivetypecasting;

public class MainClass {

	 public static void main(String[] args) {
		//Upcasting
		 Father f = new Son();
		 System.out.println(f.name);
		 System.out.println("--------------------");
		 
		 //DownCasting
		 Son s = (Son) f;
		 System.out.println(s.name);
		 System.out.println(s.age);
	}
}
