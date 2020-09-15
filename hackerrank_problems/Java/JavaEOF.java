import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int count = 1;
        while(sc.hasNext()){
            a = sc.nextLine();
            System.out.println(count+" "+a);
            count ++;  
        }
        sc.close();
           
    }
}
