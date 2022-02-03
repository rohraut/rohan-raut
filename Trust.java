public class Trust{
     static int x=20;//Instance Variable
	 
	 
	 
	 
	public static void main(String args[]){
		Trust t = new Trust();//Object
		Trust s = new Trust();//Object
		Trust y = new Trust();
		x=x+5;
		t.x=s.x+5;
		
		System.out.println(t.x);
		
	}
}