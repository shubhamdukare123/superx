class PatternDemo{
	public static void main(String[] args){
		int num=5;
		for(int i=1;i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num);
				num=num+i;
			}
			System.out.println();
			num=num-(i*i)+1;
		}
	}
}
