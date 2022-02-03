
import java.util.Scanner;
public class Raman{
	public static void main(String args[]){
	System.out.println("Enter a number: "); 
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int r = num;
	int fact = 1;
	
	
	do{
		
		fact = fact*num;
		num--;
		
		}while(num>=1);
		System.out.println("Factorial of "+num+" is: "+fact);
		
	
	
	
	
	}
}