import java.util.*;
class FindSingle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{4,1,2,1,2};
		for(int i=0; i<arr.length; i++){
			int count=0;
			for(int j=0; j<arr.length; j++){
				if(arr[i]==arr[j])
					count++;
			}
			if(count==1)
				System.out.println(arr[i]);
				
		}
	}
}
