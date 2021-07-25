import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Codechef{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String arr[] = br.readLine().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			
			if(a+b<3) {
				System.out.println(1);
			}
			else if(a+b<=10) {
				System.out.println(2);
			}
			else if(a+b<=60) {
				System.out.println(3);
			}
			else {
				System.out.println(4);
			}
		}
	}
}
