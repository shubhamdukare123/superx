import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i=1; i<=row; i++){
			char ch = 'A';
			for(int j=1; j<=col; j++){
				if(i%2==1)
					System.out.print(ch++ + " ");
				else
					System.out.print("#"+ " ");
			}
			System.out.println();
		}
	}
}
