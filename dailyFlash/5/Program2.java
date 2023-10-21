import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i=1; i<=row; i++){
			char ch = 'A';
			if(i%2 == 1){
				ch =(char)(ch+32);
			}
			for(int j=1; j<=i; j++){
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
