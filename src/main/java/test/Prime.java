package test;

public class Prime {

	public static void main(String[] args) {
		
		getPrimes(29);
	}

	private static void getPrimes(int number) {
		
		for (int i=2; i<=number; i++) {
			int count = 0;
			for (int j=2; j<=i; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count<=1) {
				System.out.print(i +" ");
			}
		}
	}

}
