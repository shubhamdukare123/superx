class PalindromeDemo{
	public static void main(String[] args){
		String str = "malyalam";
		String temp;
		char chArr[] = str.toCharArray();
		for(int i=chArr.length-1; i>=0; i--){
			temp = temp + chArr[i];
		}
		if(temp==str){
			System.out.println("Given String is palindrome");
		}
		else{
			System.out.println("Given String is not palindrome");
		}

		System.out.println(temp);
	}
}
