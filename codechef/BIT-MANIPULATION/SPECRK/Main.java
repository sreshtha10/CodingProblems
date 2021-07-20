import java.util.Scanner;
public class Main {
	public static void main(String args[]) throws java.lang.Exception{
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			int n = sc.nextInt();
			int res = 0;
			while(n-->0) {
				res ^= sc.nextInt();
			}
			System.out.println(res);
		}
		
		sc.close();
	}
}
