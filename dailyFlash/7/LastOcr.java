import java.util.*;
class LastOcr{
	int lastOcr(String str, char ch){
		char chArr[] = str.toCharArray();
		System.out.println(chArr);
		int ocr = 0;
		for(int i=0; i<chArr.length; i++){
			if(chArr[i] == ch)
				ocr = i;
		}
		return ocr;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LastOcr obj = new LastOcr();
		String str = sc.next();
		char ch = sc.next().charAt(0);
		System.out.println("Last occurance of " + ch + "is at " + obj.lastOcr(str, ch));
	}
}
