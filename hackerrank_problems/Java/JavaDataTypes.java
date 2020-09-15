import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i = 0;i<test;i++){
            try{
                long t=sc.nextLong();
                System.out.println(t+" can be fitted in:");
                if(t <=127 && t>=-128){
                    System.out.println("* byte");
                }
                if(t>= -32768 && t<=32767){
                    System.out.println("* short");
                }
                if(t <= (Math.pow(2,31) -1 ) && t>= -1 * Math.pow(2,31) ){
                    System.out.println("* int");
                }
                if( t <= (Math.pow(2,63) -1 ) && t>= -1 * Math.pow(2,63) ){
                    System.out.println("* long");
                }
            }
            catch(Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();
    }
}



