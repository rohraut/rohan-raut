public class Array0{
	public static void main(String args[]){
		int[] x={13,9,11,18,21,7,25};
		int temp=0;
		for(int i=0;i<x.length;i++){
		if(x[i]>x[i+1]){
			temp=x[i+1];
		x[i+1]=x[i];
        x[i]=temp;		
			}
		}
	}
}