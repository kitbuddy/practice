package palindromeInString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeInString {

	
	public static void main(String[] args) {
		
		String str = "tacocat";
		
		findAllPalindromicString(str);
	
//		PalindromeInString pp = new PalindromeInString();
//		
//		System.out.println(pp.testString(str));
	}

	private static void findAllPalindromicString(String str) {
		

			List<String> ss = new ArrayList<String>();
			
			for(int i=0; i<str.length(); i++) {
				for(int j=i+1; j<=str.length(); j++) {
					if(isPalindromicString(str.substring(i,j))) {
						ss.add(str.substring(i,j));
					}
				}
			}
			Collections.sort(ss);
			System.out.println(ss);
	}
	
	

	private static boolean isPalindromicString(String str) {

		StringBuilder front = new StringBuilder(str);
		
		StringBuilder back = front.reverse();
		
		if((back.toString()).equals(str)) {
			return true;
		}else {
			return false;
		}
	}
	

//	public int testString(String inputString) {
//		
//		  char[] characterList = inputString.toCharArray();
//	        int returnCount=characterList.length;
//	        for(int i=0;i<returnCount;i++)
//	        {
//	            for(int j=i+1;j<returnCount;j++)
//	            {
//	                boolean manual = true;
//	                String newString = Character.toString(characterList[i]) +  Character.toString(characterList[j]);
//	                char[] newCharacterList = newString.toCharArray();
//	                for(int k=0 ; k< newCharacterList.length ; k++){
//	                    int indexFromLast = newCharacterList.length -1 - k ;
//	                    if(newCharacterList[k] !=  newCharacterList[indexFromLast]){
//	                        manual  = false;
//	                        break;
//	                    }
//	                }
//	                returnCount = manual ? returnCount + 1 : returnCount;
//	            }
//	        }
//	        return returnCount;
//	}
}
