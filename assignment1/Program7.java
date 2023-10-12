import java.util.*;
class ArrayDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=10;
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		for(int i=0; i<arr1.length; i++){
			arr1[i] = sc.nextInt();
		}
		for(int i=0; i<arr1.length; i++){
			if(arr1[i]%2 == 0){
				arr2[i] = 1;
			}
			else
				arr2[i]=0;
		}
		for(int i = 0; i<arr2.length; i++)
			System.out.println(arr2[i]);
	}
}
