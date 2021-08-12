// "static void main" must be defined in a public class.
public class Main {
    public final static HashMap<Integer,ArrayList<Integer>> map = new HashMap();
    public static void main(String[] args) {
        System.out.println(howSum(7,new int[]{3,4}));
    }
    
    
    public static ArrayList<Integer> howSum(int targetSum,int nums[]){
        if(targetSum == 0){
            return new ArrayList<Integer>();
        }
        
        if(targetSum < 0){
            return null;
        }
        
        if(map.containsKey(targetSum)){
            return map.get(targetSum);
        }
        
        
        for(int element :nums){
            int rem = targetSum - element;
            ArrayList res = howSum(rem,nums);
            if(res != null){
                res.add(element);
                return res;
            }
            map.put(targetSum,res);
        }
        
        return null;
    }
    
    
}
