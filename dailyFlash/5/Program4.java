import java.util.*;
class PatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int num1 = 1;
		int num2 = 2;
		for(int i=1; i<=row; i++){
			for(int j=1; j<=col; j++){
				if(i%2 == 1){
					System.out.print(num1 + " ");
					num1 = num1+2;
				}
				else{
					System.out.print(num2 + " ");	
					num2 = num2+2;			
				}	
			}
			System.out.println();
		}

	}
}
