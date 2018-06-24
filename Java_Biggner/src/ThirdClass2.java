import java.util.Scanner;

public class ThirdClass2 {

	public static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter Your val:");
		
		int val=scanner.nextInt();
		
		if (val==10 || val==15) {
			System.out.println("Login successfull");
		}else {
			System.out.println("Login faild");
		}
		
		

	}

}
