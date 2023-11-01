import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int num = row;
		char ch =(char)(65 + row);
		for(int i=1; i<=row; i++){
			for(int j=row; j>i; j--){
				if(i%2 == 1){
					System.out.print(num-- + " ");
				}
				else{
					System.out.print(ch-- + " ");
				}
			}
			System.out.println();
			if(i%2 == 0){
				ch = (char)(ch+row+1);
			}
			else{
				num = num + row + 1;
			}
		}
	}
}
