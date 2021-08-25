import java.util.*;
public class Main {
    
    public static HashMap<String,Boolean> map = new HashMap();
    public static void main(String[] args) {
        
        String target = "enterapotentpot";
        String arr[]  = new String[]{"a","p","ent","enter","ot","o","t"};
        
        System.out.println(canConstruct(target,arr));
    }
    
    
    public static boolean canConstruct(String target,String arr[]){
    
        if(target.isEmpty()) return true;
        
        if(map.containsKey(target)) return map.get(target);
        
        for(String s : arr){
            if(target.indexOf(s) == 0){
                // s is a prefix. 
                String newTarget = target.substring(s.length());
                if(canConstruct(newTarget,arr)){
                    map.put(target,true);
                    return true;
                }
            }
        }
        
        
        map.put(target,false);
        return false;
    }
}
