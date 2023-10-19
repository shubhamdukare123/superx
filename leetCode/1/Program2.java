import java.util.*;
class TargetDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[]{1,2,3,5,6,7,8,9};
		int target = sc.nextInt();
		int start = 0;
		int end = nums.length-1;
		int itr = 0;
		while(start<=end){
			int mid=(start+end)/2;
			if(target == nums[mid]){
				System.out.println(mid);
				break;
			}
			else if(target>nums[mid]){
				start=mid+1;
			}
			else
				end = mid-1;
				
			itr++;
			if(target>start && target<<mid)
			
		}

		System.out.println(itr);
	}
}
