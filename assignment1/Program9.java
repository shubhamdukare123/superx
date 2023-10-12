class StringDemo{
	public static void main(String[] args){
		String str = "dfTbnSrOvryt";
		char arr[] = str.toCharArray();
		for(int i=0; i<arr.length; i++){
			if(i % 2 ==0){
				if(arr[i]>97 && arr[i]<122)
					arr[i] =(char)(arr[i]-32);
			}
			else{
				if(arr[i]>65 && arr[i]<90)
					arr[i] = (char)(arr[i]+32);
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
	}
}
