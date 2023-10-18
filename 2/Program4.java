import java.util.*;
class RangeComposite{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i=start; i<=end; i++){
			if(i==1)
				System.out.println(i); 
			for(int j=2; j<i; j++){

				if(i%j == 0){
					System.out.println(i);
					break;
				}
			}
		}
	}
}
