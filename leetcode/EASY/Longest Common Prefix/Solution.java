class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String res = "";
        
        int minLength = Integer.MAX_VALUE;
        for(String s : strs){
            int len = s.length();
            if(len < minLength){
                minLength = len;
            }
        }
        
        for(int i=0;i<minLength;i++){
            boolean isSame =true;
            for(int j=0;j<strs.length-1;j++){
                if(!(strs[j].charAt(i) == strs[j+1].charAt(i))){
                    return res;
                }
            }
            if(isSame){
                res += Character.toString(strs[0].charAt(i));
            }
        }
        
        return res;
        
    }
}
