class PalindromeDemo{
	public static void main(String[] args){
		int num = 121;
		int rev = 0;
		for(int i=num; i>0; i=i/10){
			rev = rev*10 + i%10;
		}
		if(rev==num)
			System.out.println(num+" is palindrome");
		else
			System.out.println(num + "is not palindrome");
	}
}
