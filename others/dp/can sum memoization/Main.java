// "static void main" must be defined in a public class.
public class Main {
    public final static HashMap<Integer,Boolean> map = new HashMap();
    public static void main(String[] args) {
        System.out.println(canSum(300,new int[]{2,4,4}));
    }
    
    
    public static boolean canSum(int targetSum,int nums[]){
        if(targetSum == 0){
            return true;
        }
        
        if(targetSum < 0){
            return false;
        }
        
        if(map.containsKey(targetSum)){
            return map.get(targetSum);
        }
        
        
        for(int element :nums){
            int rem = targetSum - element;
            boolean res = canSum(rem,nums);
            map.put(targetSum,res);
            if(res){
                return true;
            }
        }
        
        return false;
    }
}
