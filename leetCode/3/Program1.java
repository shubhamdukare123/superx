import java.util.*;
class LowerCaseDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char cStr[] = str.toCharArray();
		for(int i=0; i<cStr.length; i++){
			if(cStr[i]>65 && cStr[i]<90){
				cStr[i]=(char)(cStr[i]+32);
			}
		}
		for(int i=0; i<cStr.length; i++){
			System.out.println(cStr[i]);
		}
		str = str.valueOf(cStr);
		System.out.println(str);
	}

}
