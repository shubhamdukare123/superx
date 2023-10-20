import java.util.Scanner;

class ReverseArray{
	static void revArr(char ch[]){
		for(int i=0, j=ch.length-1; i<j; i++,j--){
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		for(int i=0; i<ch.length; i++){
			System.out.print(ch[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		char ch[] = str.toCharArray();
		revArr(ch);
		
	}

}
