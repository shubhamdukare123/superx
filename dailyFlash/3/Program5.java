class StringDemo{
	public static void main(String[] args){
		String str = "Shubh@m";
		char cStr[] = str.toCharArray();
		boolean flag = false;
		for(int i=0; i<cStr.length; i++){
			if((cStr[i]>65 && cStr[i]<90) || (cStr[i]>97 && cStr[i]<122)){
				
			}
			else{
				flag = true;
			//	System.out.println(str+ " contains special characters");
				break;
			}	
		}
		if(flag==true){
			System.out.println(str +" contains speical characters ");

		}
		else{
			System.out.println(str + "does not contain special characters");
		}

	}
}
