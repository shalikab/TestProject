package InterviewCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "shalikabuddhinirathnayaka";
		char[] ch = str.toCharArray();
		
		List<Character> ch2 = new ArrayList<Character>();
//		for(int i=0;i<ch.length;i++) {
//			ch2.add(ch[i]);
//		}
			for(char c : ch) {
			    ch2.add(c);
			}
		System.out.println(ch2);
		
		Set<Character> ch3 = new LinkedHashSet(ch2);
		System.out.println(ch3);
		ch2.clear();
		ch2.addAll(ch3);
		System.out.println(ch3);
		String dup = ""; 
		String dup2 = ""; 
			for(char c : ch3) {
			    System.out.print(c);
			}
		System.out.println();
			for(char c : ch3) {
			   dup=dup + c ;
			}
		System.out.print(dup);
		System.out.println();
			for(char c : ch2) {
			   dup2=dup2 + c ;
			}
		System.out.print(dup2);
		System.out.println();
	System.out.println("using for loop");
	//System.out.print(ch[0]);
	for(int i=0;i<ch.length;i++) {
		boolean d = true;
		for(int j=i-1;j>=0;j--){
			if(ch[i]==ch[j]) {
				d = false;
				break;
			}

		}
		if(d==true) {
			System.out.print(ch[i]);
		}
	}

	}

}
