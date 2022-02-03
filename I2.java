public interface I2{
	abstract void Show();
}
public class I2 implements I2{
	public void Show(){
		System.out.println("1");
	}
	public static void main(String [] args){
		Test t = new Test();
		t.Show();
	}
	
}