class Solution {
    public int mySqrt(int x) {
        
        int start = 0;
        int end = x;
        int prevMid = 0;
        int mid;
        while(start <= end){
            mid = end + (start-end)/2;
            
            if(x/(double)mid == mid){
                return mid;
            }
            
            else if(x/(double)mid > mid){
                prevMid = mid;
                start = mid+1;
                continue;
            }
            else{
                end = mid-1;
                continue;
            }    
        }
        
        
        return prevMid;
        
    }
}
