package compareClass;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ComparaterArrays {

	public boolean compare(int a, int b) {				
		return a == b ? true: false;
	}
	
	public boolean compareToString(String a, String b) {
		return a == b ? true: false;
	}
	
	public boolean compareTo(int[] a, int[] b) {
		if(Arrays.equals(a, b)) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if(a[i] == b[i]) {
						return true;
					}else {
						return false;
					}
				}
			}
		}else {
			return false;			
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int[] b = {4,3,2,1};

		int x = 3;
		int y = 3;
		
		String aa = "ankit";
		String bb = "bob";
		
		
		
		ComparaterArrays cc = new ComparaterArrays();
		
		//comparing int
		System.out.println(cc.compare(x, y));
		
		//Comparing string
		System.out.println(cc.compareToString(aa, bb));
		
		//Comparing arrays
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(cc.compareTo(a, b));
	}		
}
