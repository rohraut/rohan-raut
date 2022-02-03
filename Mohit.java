import java.util.Scanner;
public class Mohit{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your age: \n");
		int age = sc.nextInt();
		
		if(age>0 && age<18){
			System.out.println("You are a kid");
		}else if(age>=18 && age<60){
			System.out.println("You are an Adult");
			}else if (age>=60 && age<=109){
				System.out.println("You are a Senior Citizen");
			}else{
				System.out.println("Invalid Age");
			}
		
		
	}
}