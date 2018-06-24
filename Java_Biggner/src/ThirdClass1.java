import java.util.Scanner;

public class ThirdClass1 {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your Marks:");
		
		int marks=sc.nextInt();
		
		
		
		if (marks>=0 && marks<=39) {
			System.out.println("You Got F ");
		}else if (marks>=40 && marks<=49) {
			System.out.println("You Got D");
		}else if (marks>=50 && marks<=59) {
			System.out.println("You Got B");
		}else if (marks>=60 && marks<=79) {
			System.out.println("You Got A");
		}else if (marks>=80 && marks<=100) {
			System.out.println("You Got A+");
		}else {
			System.out.println("You Enter The Invalid Number");
		}
	}

}
