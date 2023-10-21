import java.util.*;
class OcrStr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		int count = 0;
		System.out.print("Enter character : ");
		char lt = sc.next().charAt(0);
		for(int i=0 ; i<ch.length; i++){
			if(lt == ch[i]){
				count++;
			}
		}
		System.out.println(count);
	}
}
