class LeftDemo{
	public static void main(String[] args){
		int num = 456975962;
		int digit1=0;
		int digit2=0;
		int count=0;
		while(num>0){
			digit1 = num%10;
			digit2 = (num%100)/10;
			if(digit2==0){
				break;
			}
			if(digit2<=digit1){
				System.out.println(digit1 + " " + digit2);
				count++;
			}
			num = num/10;
		}
		System.out.println(count);
	}
}
