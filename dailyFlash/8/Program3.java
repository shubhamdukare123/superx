import java.util.*;
class AutomorphicDemo{
	static boolean checkAutomorphic(int num){
		if(num == 0)
			return true;
		int sqr = num*num;
		int digCount = 0;
		int temp = 0;
		int rev = 0;
		for(int i=num; i>0; i=i/10){
			digCount++;
		}

		for(int i=sqr; digCount !=0; digCount--,i = i/10){
			rev = rev*10 + i%10;
		}
		for(int i=rev; i>0; i=i/10){
			temp = temp*10 + i%10;
		}
		if(temp == num){
			return true;
		}
		return false;

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean bool = checkAutomorphic(num);
		if(bool)
			System.out.println(num+" is automorphic ");
		else
			System.out.println(num+" is not automorphic");

	}
}
