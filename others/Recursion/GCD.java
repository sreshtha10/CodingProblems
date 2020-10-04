public class Main{
	public static void main(String args[]) {
		System.out.println(GCD(35,21));
	}
	public static int GCD(int a,int b) {
		if(b == 0) {
			return a;
		}
		return GCD(b, a%b);
		
	}
}
