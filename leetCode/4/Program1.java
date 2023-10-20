import java.util.*;
class MultStr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int num1 = 0;
		int num2 = 0;
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		for(int i=0; i<ch1.length; i++){
			num1 = num1*10 + ch1[i]-48;
		}
		for(int i=0; i<ch2.length; i++){
			num2 = num2*10 + ch2[i]-48;
		}
		System.out.println(num1*num2);

	}
}
