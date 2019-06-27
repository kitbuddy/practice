package characterHoles;

public class CharacterHoles {

	public static void main(String[] args) {
		CharacterHoles cH = new CharacterHoles();
		
		System.out.println(cH.countHoles("8194"));
	}

	private int countHoles(String i) {
		int count_holes = 0;
		
		for(int k = 0; k < i.length(); k++) {
			char c = i.charAt(k); 

			if (c == '0' || c == '4'|| c == '6'|| c == '9' ) {
				count_holes = count_holes+ 1;
			}else if (c == '8') {
				count_holes = count_holes+2;
			}else {
				count_holes = count_holes + 0;
			}

		}
		
		
		return count_holes;
	}
}
