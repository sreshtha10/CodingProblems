public class Main{
	public static void main(String args[]) {
		int x = 10;
		display1(x);
		System.out.println();
		display2(x);
	}
	public static void display1(int x) {
		if(x == 0) {
			return;
		}
		//Number will be printed during winding phase.
		System.out.print(x+" ");
		display1(x-1);
	}
	public static void display2(int x) {
		if(x == 0) {
			return;
		}
		display2(x-1);
		// Number will be printed during unwinding phase.
		System.out.print(x+" ");
	}
}
