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
			long b = Long.parseLong(arr[1]);
		
			if(a==b) {
				System.out.println(0);
			}
			else if(a>b && (a-b)%2!=0) {
				System.out.println((b-a)/2);
			}
			else {
				System.out.println((((b-a)/2)+1));
			}
		}
	}
}
