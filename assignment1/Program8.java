class VowelDemo{
	public static void main(String[] args){
		String str = "adgtioseobi";
		char arr[] = str.toCharArray();
		int count = 0;
		int  oArr[] ={0,0,0,0,0};
		for(int i=0; i<arr.length; i++){
			if(arr[i] == 'a')
				oArr[0] = oArr[0] + 1;
			
			else if(arr[i] == 'e')
				oArr[1] = oArr[1] + 1;
			else if(arr[i] == 'i')
				oArr[2] = oArr[2] + 1;
			else if(arr[i] == 'o')
				oArr[3] = oArr[3] + 1;
			else if(arr[i] == 'u')
				oArr[4] = oArr[4] + 1;
		}
		System.out.println("a = " + oArr[0]);
		System.out.println("b = " + oArr[1]);
		System.out.println("c = " + oArr[2]);
		System.out.println("d = " + oArr[3]);
		System.out.println("e = " + oArr[4]);
	}
}
