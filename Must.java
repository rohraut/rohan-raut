interface I1{
	abstract void Large();
	
}
public class Must implements I1{
	public void Large(){
		System.out.println("Pushpa");
	}
	public static void main(String args[]){
		Must m = new Must();
		m.Large();
	}
}