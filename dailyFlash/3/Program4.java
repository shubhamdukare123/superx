import java.util.*;
class ReverseDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++){
			int rev = 0;//25440
			for(int j = i ; j>0; j=j/10 ){
				rev = rev*10 + j%10;
			}
			System.out.println(rev);
		}
	}
}
