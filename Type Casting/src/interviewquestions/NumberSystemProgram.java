package interviewquestions;

public class NumberSystemProgram {

	public static void main(String[] args) {
		int [] a = {10,15,20,23,30};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum+=a[i];
			}
			
		}
		System.out.println("Sum: "+sum);
		
	}
}
