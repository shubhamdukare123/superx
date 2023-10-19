import java.util.*;
class IncrDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[]{1,2,3};
		int numTemp = 0;
		for(int i=0; i<num.length; i++){
			numTemp = numTemp * 10 + num[i];
		}
		numTemp = numTemp+1;//124
		
		for(int i=num.length-1; i>=0; i--){
			num[i] = numTemp%10;
			numTemp = numTemp/10;
		}
		for(int i=0; i<num.length; i++){
			System.out.println(num[i]);
		}

	        	
	}
}
