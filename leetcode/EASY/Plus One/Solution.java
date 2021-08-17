class Solution {
    public int[] plusOne(int[] digits) {        
        return increment(digits,digits.length-1);
    }
    
    
    public static int[] increment(int[] arr,int index){
        
        if(index==0 && arr[index]==9){
            int newArr[] = new int[arr.length+1];
            newArr[0] = 1;
            return newArr;
        }
        
        
        if(arr[index] != 9){
            arr[index] = arr[index]+1;
            return arr;
        }
        arr[index]=0;
        return increment(arr,index-1);
    }
}
