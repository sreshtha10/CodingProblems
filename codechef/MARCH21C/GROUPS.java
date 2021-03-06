import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* package codechef; // don't place package name! */



/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
	    try{
	    	InputStreamReader r = new InputStreamReader(System.in);
	    	BufferedReader reader = new BufferedReader(r);
	    	int testCases = Integer.parseInt(reader.readLine());
	    	String seats;
	    	while(testCases != 0) {
	    		
	    		seats = reader.readLine();
	    		char[] c = seats.toCharArray();
	    		char prev;
	    		int nGroups = 0;
	    		if(c[0] == '1') {
	    			nGroups =1;
	    		}
	    		for(int i=1;i<c.length;i++) {
	    			prev = c[i-1];
	    			if(prev == '0' && c[i] == '1') {
	    				nGroups += 1;
	    			}
	    		}
	    		
	    		System.out.println(nGroups);
	    		testCases -=1;
	    	}
	    }
	    catch(Exception e){
	        return;
	    }
	}
}
