public class Main{
	public static void main(String args[]) {
		baseConversion(16, 122);
	}
	public static void baseConversion(int base,int number) {
		int rem = number%base;
		if(number == 0) {
			return;
		}
		baseConversion(base, (int)number/base);
		if(rem < 10) {
			System.out.print(rem+ " ");
		}
		else {
			System.out.print((char)(rem-10+'A')+" ");
		}
	}
}
