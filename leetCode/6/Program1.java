class Solution {
    public String capitalizeTitle(String title) {
        char[] chStr = title.toCharArray();
        for(int i=0; i<chStr.length; i++){
            int count = 0;
            for(int j=i; j<chStr.length; j++){
                count++;
                if(chStr[j] == ' '){
                    if(count<=3){
                        for(int k=i+1; k<=j; k++){
                             if(chStr[i]>=65 && chStr[i]<=90){
                                chStr[i] = (char)(chStr[i] + 32);
                             }
                             if(chStr[k]>=65 && chStr[k]<=90){
                                 chStr[k] = (char)(chStr[k]+32);
                             }
                        }
                    }else{
                        for(int k=i+1; k<j; k++){
                            if(chStr[i]>=97 && chStr[i]<=122){
                                chStr[i] = (char)(chStr[i] - 32);
                            }
                            if(chStr[k]>=65 && chStr[k]<=90){
                                chStr[k] = (char)(chStr[k]+32);
                            }
                        }
                    }
                
                    i=j;
                    break;  
                }
                else if(j == chStr.length-1){
                    if(count<=2){
                            for(int k=i; k<=j; k++){
                                if(chStr[k] >=65 && chStr[k] <= 90){
                                    chStr[k] = (char)(chStr[k]+32);
                                }
                            }

                    }else{
                        for(int k=i+1; k<=j; k++){
                            if(chStr[i]>=97 && chStr[i]<=122){
                                chStr[i] = (char)(chStr[i] - 32);
                            }
                            if(chStr[k]>=65 && chStr[k]<=90){
                                chStr[k] = (char)(chStr[k]+32);
                            }
                        }    
                    }
                 i=j+1;   
                }                     
                
            }
        }
        title = String.valueOf(chStr);
        return title;
    }
}