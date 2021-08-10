class Solution {
    public boolean isPalindrome(int x) {
        if(x >= 0){
            long y = 0;
            int tmp = x,b;
            while(tmp !=0){
                b = tmp%10;
                y =y*10 +b;
                tmp = tmp/(int)10;
            }
            return (int)y == x;
            
        }
        else{
            return false;
        }
        
    }
}
