import java.util.*;
class ReplaceVowels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		char vArr[] = new char[]{'a','e','i','o','u'};
		for(int i=0; i<ch.length; i++){
			for(int j=0; j<vArr.length; j++){
				if(ch[i]==vArr[j]){
					ch[i] = '#';
				}
			}
		}
		str = String.valueOf(ch);
	       System.out.println(str);	
	}
}
