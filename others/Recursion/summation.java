public class Main{
	public static void main(String args[]) {
		int x = 10;
		System.out.println(summation(20));
	}
	public static int summation(int n) {
		if(n == 1) {
			return 1; 
		}
		return n+summation(n-1);
	}
}
