package InterviewCodes;

public class WhiteSpaces {

	public static void main(String[] args) {
		String str= "Shalika Buddhini    Rathnayaka";
		String str1= str.replaceAll(" ", "");
        System.out.print(str1);
        System.out.println();
        
        //Method 2
        
        char[] strArray = str.toCharArray();
	        
        StringBuffer sb = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                sb.append(strArray[i]);  
            }
        }  
        String noSpaceStr2 = sb.toString();  
        System.out.println(noSpaceStr2);  
    
        	
        
	}
}


