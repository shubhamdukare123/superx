import java.util.*;
class VowelDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char vArr[] = new char[]{'a', 'e', 'i', 'o', 'u'};
		char sArr[] = str.toCharArray();
		int count = 0;
		for(int i=0; i<sArr.length; i++){
			for(int j=0; j<vArr.length; j++){
				if(sArr[i] == vArr[j]){
					count++;
					break;
				}	
			}
		}
		System.out.println(count);

	}
}
