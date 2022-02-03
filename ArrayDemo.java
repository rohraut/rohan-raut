public class ArrayDemo{
	public static void main(String args[]){
		int[] x= {1,2,3,4,5};
		
		int result=0;
		for(int value:x){
			result = result+value;
		}
		System.out.println("Addition of array is: "+result);
	}
}