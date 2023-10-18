import java.util.*;
class PalindromeDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		if(num<0)
			System.out.println(rev + "is negative & not palindrome");
		for(int i = num; i>0; i=i/10){
			rev = rev*10 + i%10;
		}
		if(rev==num){
			System.out.println(rev + "is palindrome");
		}
		else{
			System.out.println(num + "is not palindrome");
		}
	}
}
