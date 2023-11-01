import java.util.*;
class FiboSeries{
	static void printFiboSeries(int num){
		int a=0;
		int b=1;
		int sum=0;
		
		while(a<=num){
			sum = a+b;
			System.out.println(a);
			a=b;
			b=sum;
		}
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printFiboSeries(num);
	}
}
