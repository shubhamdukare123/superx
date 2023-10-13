import java.util.*;
class PrimeNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		boolean flag = true;
		for(int i=start; i<=end; i++){
			for(int j=2; j<i; j++){
				if(i%j==0){
					System.out.println(i);
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println("Prime No :" + i);
		}
	}
}
