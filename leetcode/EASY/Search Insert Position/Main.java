class Solution {
    public int searchInsert(int[] arr, int target) {
        
        int len = arr.length;
        int mid;
        int start = 0;
        int end = len-1;
        int supposedIndex = 0;
        
        while(start <= end){
            
            mid = start +(end-start)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            
            if(target > arr[mid]){
                start = mid+1;
                supposedIndex= mid+1;
                continue;
            }
            
            if(target < arr[mid]){
                end = mid-1;
                supposedIndex  =mid;
            }
            
        }
        
        return supposedIndex;
    }
}
