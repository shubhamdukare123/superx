import java.util.*;
class PrimeComposite{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean bool = false;
		if(num ==1){
			System.out.println("1 is composite number");
		}
		for(int i=2; i<num; i++){
			if(num%i == 0){
				System.out.println(num+" is composite");
				break;
			}
			if(i==num-1){
				System.out.println(num+ " is prime");
			}
		}
	}
}
