import java.util.*;
class PrimeNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++){
			int count=0;
			for(int j=2; j<i; j++){
				if(i%j==0){
					count++;	
				}
			}
			if(count==0 && i!=1)
				System.out.println("Prime No :" + i);
		}
	}
}
