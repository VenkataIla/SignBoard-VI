package simple;

public class FibonacciExample {

	public static void main(String[] args) {
		
		findListOfFibanacci(10);

	}

	private static void findListOfFibanacci(int n) {
		
		int a = 0, b = 1, c = 0;
		
		for (int i = 2; i < n; i++) {
			
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
						
		}
	}

}
