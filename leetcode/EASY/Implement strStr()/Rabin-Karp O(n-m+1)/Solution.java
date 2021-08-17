class Solution {
    public static final int d = 26;
    public int strStr(String haystack, String needle) {
        
        
        
        
        int p = 100007;  //prime number 
        int n = haystack.length();
        int m = needle.length();
        
        if(needle.isEmpty()){
            return 0;
        }
        
        if(m>n){
            return -1;
        }
        
        
        int h=1;
        int patternHash = 0;
        int windowHash = 0;
        
        for(int i=0;i<m-1;i++){
            h = (h*d)%p;
        }
        
        // h = pow(d,m-1)%q
        int tmp = m-1;
        for(int i=0;i<m;i++){
            patternHash = ((d*patternHash) + ASCII(needle.charAt(i)))%p;
            windowHash = ((d*windowHash)+ASCII(haystack.charAt(i)))%p;
        }
        
        
        
        
        for(int i=0;i<=n-m;i++){
            if(windowHash == patternHash){
                //match 
                int j=0;
                for(;j<m;j++){
                    if(needle.charAt(j) != haystack.charAt(i+j)){
                        break;
                    }
                }
                if(j == m){
                    return i;
                }
            }
            else if(i<n-m){
                windowHash = (d*(windowHash-ASCII(haystack.charAt(i))*h) + ASCII(haystack.charAt(i+m)))%p;
                
                if(windowHash<0){
                    windowHash += p;
                }
            }
        }
        
        
        System.out.println(windowHash+" "+patternHash);
        return -1;
        
        
        
        
    }
    
    public static int ASCII(char x){
        return ((int)x)%96;       
    }
    
}
