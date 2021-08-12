// "static void main" must be defined in a public class.
public class Main {
    
    public final static Map<Map.Entry<Integer,Integer>,Integer> map = new HashMap();
    public static void main(String[] args) {
        System.out.println(gridTraveler(1,1));
        System.out.println(gridTraveler(3,1));
        System.out.println(gridTraveler(3,3));
        System.out.println(gridTraveler(2,2));
        System.out.println(gridTraveler(5,5));
        
    }
    
    public static int gridTraveler(int x,int y){
        if(x == 0 || y == 0){
            return 0;
        }
        
        if(x == 1 && y == 1){
            return 1;
        }
        
        if(map.containsKey(Map.entry(x,y))){
            return map.get(Map.entry(x,y));
        }
        
        int ans = gridTraveler(x-1,y)+gridTraveler(x,y-1);
        map.put(Map.entry(x,y),ans);
        return ans;
    }
}
