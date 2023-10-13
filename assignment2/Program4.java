class PatternDemo{
	public static void main(String[] args){
		int num=1;
		for(int i=1; i<=4; i++){
			for(int j=4; j>0; j--){
				if(j<=i){
					System.out.print(num);
					num=num+i;
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			num = i+1;
		}
	}
}
