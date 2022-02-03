//Pyramid program

public class Lux{
	
public static void main(String args[]){
for(int line=1;line<=5;line++){
	for(int space =5;space>line;space--){
		System.out.print("  ");
	}
	int digit = line;
	while(digit>1){
		System.out.print(digit+" ");
		digit--;
	}
	 while(digit<=line){
		 System.out.print(digit+" ");
		 digit++;
		 
	 }
	 System.out.println();
	}	
	
}


}