import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*  // don't place package name! */



/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws IOException
	{
	    try{
	    	InputStreamReader r = new InputStreamReader(System.in);
	    	BufferedReader reader = new BufferedReader(r);
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int N = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            if(x >H) {
            	System.out.println("YES");
            	return;
            }
            st = new StringTokenizer(reader.readLine());
            for(int i=0;i<N;i++) {
            	if(Integer.parseInt(st.nextToken())+x >= H) {
            		System.out.println("YES");
            		return;
            	}
            }
            System.out.println("NO");
            
	    	
            
	    }
	    catch(Exception e){
	        return;
	    }
	}
}
