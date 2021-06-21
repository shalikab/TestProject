package InterviewCodes;

public class ReverseInt {

	public static void main(String[] args) {
		int exm = 2567;
		int value = 0 ;
	    int reminder;
	    while(exm > 0) {
	    	reminder = exm % 10;
	        value = value*10+reminder;
	        exm = exm /10;
	        
	    }
	    System.out.print(value);

	}

}
