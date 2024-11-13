package interviewquestions;

public class Tom extends Student1 implements Hotel,Threatre {
	
	@Override
	void study() {
		System.out.println("Studying java...");
	}
	
	@Override
	public void eat() {
		System.out.println("Eating Biryani...");
	}
	
	@Override
	public void watchMovie() {
		System.out.println("Watching Movie...");
	}

	public static void main(String[] args) {
		Tom t = new Tom();
		t.study();
		t.eat();
		t.watchMovie();
	}
}
