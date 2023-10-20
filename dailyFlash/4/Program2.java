import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i=1; i<=row; i++){
			char ch = 'A';
			ch = (char)(ch+i-1);
			for(int j=1; j<=i; j++){
				System.out.print(ch-- + " ");
			}
			System.out.println();
			
		}
	}
}
