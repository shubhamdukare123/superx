import java.util.*;
class DuckNoDemo{
	static boolean duckNo(int num){
		if(num == 0)
			return false;
		if(num%10 == 0)
			return true;
		duckNo(num/10);
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = duckNo(num);
		if(num == 0)	
			System.out.println(num + "is Duck number");
		else if(flag == true )
			System.out.println(num + "is Duck number");
		else
			System.out.println(num + "is not Duck number");
	}
}
