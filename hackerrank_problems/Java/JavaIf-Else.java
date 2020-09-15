import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(x%2 != 0){
            System.out.println("Weird");
        }
        else if(x>=2 && x<=5){
            System.out.println("Not Weird");
        }
        else if(x>=6 && x<=20 ){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
