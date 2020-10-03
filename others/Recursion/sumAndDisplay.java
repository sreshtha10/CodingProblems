public class Main{
	public static void main(String args[]) {
		int x = 10;
		System.out.println("\n"+sumNdisplay(x));
	}
	public static int sumNdisplay(int x) {
		int sum;
		if(x == 0) {
			return 0;
		}
		sum = x + sumNdisplay(x-1);
		System.out.print(x+" ");
		return sum;
		
	}
}
