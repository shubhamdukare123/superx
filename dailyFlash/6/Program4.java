import java.util.*;
class StrongNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++){
			int sum=0;

			for(int j=i; j>0; j=j/10){
				int digit=j%10;	
				int fact=1;
				for(int k=digit; k>0; k--){
					fact = fact*k;
				}
				sum = sum + fact;
			//	System.out.println(sum);
			}
			if(sum == i)
				System.out.println(i);
		}
	}
}
