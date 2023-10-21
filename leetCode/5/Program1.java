import java.util.*;
class MissNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int countRange = end-start+1;
		int arr[] = new int[countRange];
		for(int i=0; i<arr.length-1; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=start; i<=end; i++){
			boolean flag = false;
			for(int j=0; j<arr.length; j++){
				if(i == arr[j]){
					flag = true;
					break;
				}
			}
			if(flag == false){
				System.out.println(i);
				break;
			}
		}
	}
}
