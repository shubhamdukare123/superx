import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch = 'A';
		int row = sc.nextInt();
		int col = sc.nextInt();
		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				if(i%2 != 0){
					System.out.print(ch++ + " ");
				}
				else{
					System.out.print(ch-- + " ");
				}
			}
			System.out.println();
			if(i%2 != 0){
				ch--;
			}
			else{
				ch++;
			}
		}

	}
}
