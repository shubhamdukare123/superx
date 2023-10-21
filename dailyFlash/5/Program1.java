import java.util.*;
class RangeFact{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++){
			int fact = 1;
			for(int j=i; j>=1; j--){
				fact = fact*j;
			}
			System.out.println(fact);
		}

	}
}
