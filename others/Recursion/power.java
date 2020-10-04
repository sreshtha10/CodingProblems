public class Main{
	public static void main(String args[]) {
		System.out.println(power(1.2, 3));
	}
	public static double power(double a,int b) {
		if(b == 0) {
			return 1;
		}
		return a*power(a, b-1);
	}
}
