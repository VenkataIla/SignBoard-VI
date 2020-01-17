package simple;

public class ReversNumber {
	
	public static void main(String args[])
	{
		int[] numbers = {1, 20, 22, 102, 101, 1221, 13321, 13331, 0, 11};
        for (int number: numbers) {
        if(number == reverstheNumber(number))
        {
        	System.out.println(number +" it is a Palandrom");
        }
		}
		
	}

	private static int reverstheNumber(int n) {
		
		int revers = 0;
		while(n != 0)
		{
			revers = revers*10 + n%10;
			n = n/10;
		}
		System.out.println(n);
		return n;
	}

}
