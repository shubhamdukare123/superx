import java.util.*;
class UpLowCase{
	//i love core2web

	static String capitalizeStr(String str){
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++){
			int count=0;
			for(int j=i+1; j<ch.length ;j++){
				count++;
				if(ch[j] == ' '){
					for(int k=i+1; k<=j; k++){
						if(count <=2){
							if(ch[i] >=65 && ch[i] <= 90){
								ch[i] = (char)(ch[i] + 32);
							}
							if(ch[k] >=65 && ch[k] <= 90)
								ch[k] = (char)(ch[k]+32);	
						}
						else{
							if(ch[i] >=97 && ch[i] <=122){
								System.out.println("cap");
								ch[i] = (char)(ch[i]-32);
							}
							if(ch[k] >=65 && ch[k] <= 90){
								ch[k] = (char)(ch[k] + 32);
							}
						}
					}
					i = j+1;
					break;
				}
			}
		}
		str = str.valueOf(ch);
		return str;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(capitalizeStr(str));
	
	}
}
