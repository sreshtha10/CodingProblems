// "static void main" must be defined in a public class.
public class Main {
    public final static HashMap<Integer,ArrayList<Integer>> map = new HashMap();
    public static void main(String[] args) {
        System.out.println(bestSum(75,new int[]{2,3,4}));
    }
    
    
    public static ArrayList<Integer> bestSum(int targetSum,int nums[]){
        if(targetSum == 0){
            return new ArrayList<Integer>();
        }
        
        if(targetSum < 0){
            return null;
        }
        
        if(map.containsKey(targetSum)){
            return map.get(targetSum);
        }
        
        
        int minCount = Integer.MAX_VALUE;
        ArrayList ans = null;
        for(int element :nums){
            int rem = targetSum - element;
            ArrayList res = bestSum(rem,nums);
            if(res != null){
                res.add(element);
            }
            if(res!=null && res.size() < minCount){
                minCount = res.size();
                ans = res;
            }
        }
        
        map.put(targetSum,ans);
        return ans;
    }
    
    
}
