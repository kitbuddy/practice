package fizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		 FizzBuzz ff = new FizzBuzz();
		 
		 ff.printMultiple(20);
	}

	private void printMultiple(int range) {

//		for(int i=1; i<=range ; i++) {
//			
//			if(multipleofBoth3And5(i)) {
//					System.out.println("FIZZBUZZ");
//			}else if(multipleof3(i)) {
//					System.out.println("FIZZ");
//			}else if(multipleof5(i)) {
//					System.out.println("BUZZ");
//			}else {
//				System.out.println(i);
//			}
//
//		}
		
	for(int i=1; i<=range ; i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
					System.out.println("FIZZBUZZ");
			}else if(i % 3 == 0) {
					System.out.println("FIZZ");
			}else if(i % 5 == 0) {
					System.out.println("BUZZ");
			}else {
				System.out.println(i);
			}

		}
	}

	private boolean multipleofBoth3And5(int i) {
		if(i % 3 == 0 && i % 5 == 0) {
				return true;
			}
			return false;
		}

	private boolean multipleof3(int i) {
//		if(i % 3 == 0) {
//			return true;
//		}
		return i%3 == 0 ? true : false;
	}
	

	private boolean multipleof5(int i) {
//		if(i % 5 == 0) {
//			return true;
//		}
//		return false;
		return i%5 == 0 ? true : false;
	}
}
