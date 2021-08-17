class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.length() == needle.length()){
            if(haystack.equals(needle)){
                return 0;
            }
            else{
                return -1;
            }
            
        }
        
        if(needle.isEmpty() && !haystack.isEmpty()){
            return 0;
        }
        
        if(needle.length() > haystack.length()){
            return -1;
        }
        
        
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int j=i+1;
                int k=1;
                while(k<needle.length() && j<haystack.length()){
                    if(haystack.charAt(j) == needle.charAt(k)){
                        k++;
                        j++;
                    }
                    else{
                        break;
                    }
                }
                
                if(k == needle.length()){
                    return i;
                }
            }
        }
        
        return -1;
    }
}
