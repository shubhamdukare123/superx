import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int num = 1;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num++ + " ");
			}
			num--;
			System.out.println();
		}
	}
}
