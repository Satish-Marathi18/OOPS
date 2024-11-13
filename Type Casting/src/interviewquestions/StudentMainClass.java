package interviewquestions;

public class StudentMainClass {

	static void findHighestMarks(Student s1,Student s2) {
		if(s1.marks>s2.marks) {
			System.out.println(s1.name+"\n"+s1.marks);
		}
		else {
			System.out.println(s2.name+"\n"+s2.marks);
		}
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Satish",85);
		Student s2 = new Student("Vikas",80);
		findHighestMarks(s1,s2);
		
		
		
	}
}
