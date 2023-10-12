class PatternDemo{
	public static void main(String[] args){
		char ch = 'D';
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++){
				if(i%2 !=0){
					System.out.print(ch-- + " ");
				}
				else{
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
			if(i%2!=0){
				ch = (char)(ch+5+32);
			}
			else{
				ch = (char)(ch-3-32);
			}
		}
	}
}
