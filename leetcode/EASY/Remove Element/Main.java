class Solution {
    public int removeElement(int[] arr, int val) {
        int count=0;
        for(int i=0;i<arr.length;i++){
           
            if(arr[i]!=val){
                arr[count++] = arr[i];
            }
            
        }
        
        return count;
    }
}
