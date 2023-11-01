import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		char ch = 'D';
		int num =  5;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				if(i%2 == 1)
					System.out.print(ch-- + " " );
				else
					System.out.print(num-- + " ");
						
			}
			System.out.println();

			if(i%2 == 1)
				ch = (char)(ch + 6);
			else
				num = num + 6;
		
		}
	}
}
