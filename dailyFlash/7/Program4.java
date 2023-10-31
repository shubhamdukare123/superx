import java.util.*;
class PerfectNo{
	static void rangePerfectNo(int start, int end){
		for(int i = start; i<=end; i++){
			int sum = 0;
			for(int j=1; j<start; j++){
				if(i%j==0){
					sum=sum+j;
				}
			}
			if(sum == i )
				System.out.println(i);
			return ;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		rangePerfectNo(start,end);
		
	}
}
