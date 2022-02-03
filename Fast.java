interface I1{
 public abstract void Show();
}
interface I2{
public abstract void Display();
}
public class Fast implements I1,I2{
	public  void Show(){
		System.out.println("1");
	}
	public void Display(){
		System.out.println('2');
	}
	public static void main(String [] args){
		Fast t = new Fast();
		t.Show();
		t.Display();
	}
	
}