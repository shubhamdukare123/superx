import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i=num; i>0; i=i/10){
			int digit = i%10;
			int fact = 1;
			for(int j=digit; j>=1; j--){
				fact = fact * j;
			}
			sum = sum+fact;
		}
		if(sum==num)
			System.out.println(num + " is strong number");
		else
			System.out.println(num + " is not strong number");
	}
}
