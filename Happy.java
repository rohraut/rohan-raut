
import java.util.Scanner;

public class Happy{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>0 && age<18){
			System.out.println("u r child");
		}else if(age>=18 && age<=60){
			System.out.println(" u r an Adult");
			
		}else{
			System.out.println("invalid age");
		}
	}
}