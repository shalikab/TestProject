package InterviewCodes;

public class HighestDuplicate {

	public static void main(String[] args) {
		char[] ch = {68,34,45,23,45,34,34,46,57,68,68,68,79,56,34,68};
		char[] ch2 = {};
		int swap = 0;
		int finalv = 0;
		boolean check = true;
		for(int i=0;i<ch.length;i++) {
			int count = 0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count=count+1;
				}
			for(int k =i-1;k>=0;k--) {
				if(ch[i] == ch[k]) {
					check = false;
					break;
				}
			}
			}
			if(check = true && swap<count) {
			    swap = count;
			    finalv = ch[i];
			}
		}
		System.out.println(finalv);
		System.out.print(swap);

	}

}
