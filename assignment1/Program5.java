import java.util.*;
class ReverseDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit1 = 0;
		int digit2 = 0;
		int  rev = 0;
		int count = 0;
		for(int i=num; i>0; i /= 10){
			digit1 = i%10;
			rev = rev * 10 + digit1;
		}
		System.out.println(rev);
		for(int i=num; i>0; i /= 10){
			count++;
		}
		int arr[] = new int[count];
		for(int i=0; num>0; num = num/10){
			digit1 = num%10; //98654
			System.out.println(digit1);
			digit2 = (num%100)/10;
			System.out.println(digit2);
			arr[i] = digit1 + digit2;
			i++;
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}
}
