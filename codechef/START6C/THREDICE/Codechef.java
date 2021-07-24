import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Codechef {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String arr[] = br.readLine().split(" ");
			int x = Integer.parseInt(arr[0]);
			int y= Integer.parseInt(arr[1]);
			
			if(x+y>=6) {
				System.out.println(0);
			}
			else {
				System.out.println((6-(x+y))/(double)6);
			}
			
		}
	
	}
}
