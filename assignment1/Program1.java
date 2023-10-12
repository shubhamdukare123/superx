class FactDemo{
	public static void main(String[] args){
		int num = 256946;
		int rev = 0;
		int digit = 0;
		for(int i=num; i>0; i=i/10){
			digit = i%10;
			rev = rev*10 + digit;
		}
		fact(rev);

	}
	static void fact(int num){
		int digit = 0;
		int fact = 1;
		if(num==0)
			return;
		digit = num%10;
		if(digit%2==0){
			for(int i=digit; i>0; i--){
				fact = fact*i;
			}
			System.out.print(fact + " ");
		}
		num = num/10;
		fact(num);
	}
}
