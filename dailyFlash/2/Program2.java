import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num=1;
		int row = sc.nextInt();
		for(int i=1; i<=row; i++){
			num = i;
			for(int j=1; j<=i; j++){
				System.out.print(num + " ");
				num = num + i;
			}
			System.out.println();
		}
	}
}
