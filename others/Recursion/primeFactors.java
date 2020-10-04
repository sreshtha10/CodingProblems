public class Main{
	public static void main(String args[]) {
		factors(1024);
	}
	public static void factors(int x) {
		if(x == 1) {
			return;
		}
		int y = 2;
		while(x%y != 0) {
			y++;
		}
		System.out.print(y+" ");
		factors(x/y);
	}
}
