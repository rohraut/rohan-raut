public class Array4{
public static void main(String args[]){
	int[] x={13,9,11,18,21,7,25,11,13,11,18,13,21};
	
	for(int i=0;i<x.length;i++){
		int katora=1;
	for(int j=i+1;j<x.length;j++){
		if(x[i]==x[j]){
			katora++;
		}
	      }	
	if(katora>1){
		System.out.print(x[i]+" ");
	}
	}
}
}