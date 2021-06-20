package InterviewCodes;


class ReverseString {
	public static void main(String[] args) {  
	String str =  "Shalika Buddhini Rathnayaka";
	
	//method1
    char[] chr = str.toCharArray();
    for(int i =chr.length-1;i>=0;i--) {
    	System.out.print(chr[i]);
    }
    System.out.println();
    
    //method2
    char[] chr2 = new char[chr.length];
    for(int i =chr.length-1;i>=0;i--) {
    	chr2[(chr.length-1)-i]= chr[i];
    }
    System.out.println(chr2);
    
    //method3
    StringBuilder sb = new StringBuilder();
    sb.append(str);
    sb=sb.reverse();
    System.out.print(sb);
    
}
}


