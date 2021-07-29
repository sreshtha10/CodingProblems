import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Codechef{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String arr[] = br.readLine().split(" ");
			long x = Long.parseLong(arr[0]);
			long y = Long.parseLong(arr[1]);
			
			if(x%2==0 && y%2==0) {  //both even gcd>=2
				System.out.println(0);
				continue;
			}
			
			long gcd = gcd(x,y);
			if(gcd>1) {
				System.out.println(0);
				continue;
			}
			else if((x%2==0 && y%2!=0) || (x%2!=0 && y%2==0)) {  //one is odd and one is even -> increment to make both even.
				System.out.println(1);
				continue;
			}
			else {
				if(gcd(x+1,y)>1 || gcd(x,y+1)>1) {
					System.out.println(1);
					continue;
				}
				else {
					System.out.println(2);
				}
			}	
		}
	}
	
	
	public static long gcd(long x,long y) {
		if(y==0) {
			return x;
		}
		
		return gcd(y,x%y);
	}
}
