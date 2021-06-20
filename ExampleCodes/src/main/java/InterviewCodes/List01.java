package InterviewCodes;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove dplicates
		
		List<Integer> dup = new ArrayList();
		dup.add(23);
		dup.add(33);
		dup.add(48);
		dup.add(23);
		dup.add(53);
		dup.add(23);
		dup.add(53);
		dup.add(23);
		dup.add(48);
		
		Set<Integer> am = new LinkedHashSet(dup);
		dup.clear();
		dup.addAll(am);
		
		System.out.println(dup);
		
		

	}

}
