class Solution {
    public int reverse(int x) {
       long a = 0,b;
        while(x!=0){
            b = x%10;
            a = a*10+b;
            x = x/(int)10;
        }
        
        if(a<Math.pow(-2, 31)||a>(Math.pow(2, 31))-1) {
				a = 0;
		}
        
        return (int)a; 
    }
}
