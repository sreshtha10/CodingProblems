public class Main{
	public static void main(String args[]) {
		System.out.println("Sum "+sumdigits(4563));
	}
	public static int sumdigits(int x) {
		if(x <=9) {
			System.out.println(x);
			return x;
		}
		System.out.println(x%10);
		return x%10 +sumdigits((int) x/10);
	}
	
}
