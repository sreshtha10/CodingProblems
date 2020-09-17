public class Main{
    public static int count(int[] a){
        int N = a.length;
        int count = 0;
        for(int i = 0;i<N;i++){
            for(int j = i+1;j<N;j++){
                for(int k=j+1;k<N;k++){
                    if(a[i]+a[j]+a[k] == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int a[] = {30,-40,-20 ,-10 ,40 ,0 ,10, 5};
        System.out.println(count(a));
        
    }
}
