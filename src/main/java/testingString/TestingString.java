package testingString;

public class TestingString {

	String A = "Greek";
	String B = "Grek";
	
	String C = "Greek";
	String D = "Greke";
	

	public void testFirst() {
		
	for (int i = 0; i < A.length(); i++) {
		
		for (int j = 0; j < B.length(); j++) {

			char firstString_char = A.charAt(i);
			char secondString_char = B.charAt(j);
			
			if(firstString_char == 'k' && secondString_char == 'k' ) {
				
				char check_first = A.charAt(i-1); 
				char check_second = A.charAt(j-1); 

				if(check_first == check_second) {
					System.out.println("same");
				}else {
					System.out.println(" not same");				}		
			}
			}
	}
		
	}

}
