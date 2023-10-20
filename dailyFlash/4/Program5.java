import java.util.*;
class ToggleString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char chArr[] = str.toCharArray();
		for(int i=0; i<chArr.length; i++){
			if(chArr[i] >= 65 && chArr[i]<=90){
				chArr[i] = (char)(chArr[i]+32);
			}
			
			else if(chArr[i]>=97 && chArr[i]<=122){
				chArr[i] = (char)(chArr[i]-32);
			}
		}
		str = str.valueOf(chArr);
		System.out.println(str);
	}
}
