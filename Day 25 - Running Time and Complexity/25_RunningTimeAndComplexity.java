import java.io.*;
import java.util.*;

public class Solution {
    
    public static void isPrime(int n){
        
        if(n==0 || n== 1){
            System.out.println("Not prime");
        }
        else if(n==2){
            System.out.println("Prime");            
        }
        else{
            boolean result = true;
            for(int i= 2; i<= n/2; i++){
                if(n%i == 0){
                    result = false;
                    break;
                }
            }
            
            if(result == true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-- >0){
            
            int n = sc.nextInt();
            isPrime(n);
        }
        
        sc.close();
    }
}