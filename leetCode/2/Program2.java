import java.util.*;

class OccuranceDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String haystack = sc.next();
		String needle = sc.next();
		int count = 0;
		char chn[] = needle.toCharArray(); //sad
		char chh[] = haystack.toCharArray(); //badnotsad
		for(int i=0,j=0; i<chh.length; i++){
			if(chn[j]==chh[i]){
				j++;
				count++;
				if(count == chn.length){
					System.out.println(i-count+1);
					break;
				}
			}
			if(i==chh.length-1)
				System.out.println("-1");
		}
		
	}
}
