class PatternDemo{
	public static void main(String[] args){
		char ch = 'A';
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5-i+1; j++){
				if(i%2!=0){
					System.out.print(ch);
					if(ch>=65 && ch<=90){
						ch=(char)(ch+32+1);
					}
					else{
						ch=(char)(ch-32+1);
					}
				}
				else{
					System.out.print(ch);
					if(ch>=65 && ch<=90){
						ch=(char)(ch+32-1);
					}
					else{
						ch=(char)(ch-32-1);
					}
				}
			}
			System.out.println();
			if(i%2==0){
				if(ch>=65 && ch<=90){
					ch=(char)(ch+32+1);
				}
				else{
					ch=(char)(ch-32+1);
				}
			}
			else{
				ch--;
			}
		}
	}
}
