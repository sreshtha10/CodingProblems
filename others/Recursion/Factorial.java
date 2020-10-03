public class Main{
	public static void main(String args[]) {
		int x = 10;
		System.out.println(factorial(x));
		
	}
	public static int factorial(int x) {
		if(x == 0) {
			return 1;
		}
		return x*factorial(x-1);
	}
}
