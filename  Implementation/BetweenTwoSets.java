import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {
    
    public static int gcd(int a, int b){
        while(b>0)
        {
        int r=a%b;
        a=b;
        b=r;
        }
         return a; 
        }
    public static int lcm(int a,int b){
         int x =(a > b) ? a : b;
         while(true){
         if(x % b == 0 && x % b == 0)
          //System.out.print(x);
         return x;
         
         ++x;}
         
        // return x;
         }
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int r;
        int r1;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        
        for(int b_i=0; b_i < m; b_i++){
          b[b_i] = in.nextInt();
        }
        // lcm 
        r=b[0];
        for(int i=0;i<b.length;i++){
        r=gcd(r,b[i]);
       }
        System.out.println("gcd: "+r);
        //lcm -> give Highest value of array i.e 4 out of 2,4
         r1=a[0];
        for(int i=0;i<a.length;i++){
        r1=lcm(r1,a[i]);
       }
        System.out.println("lcm: "+r1);
       int count=0; 
        //counting diviser
        for(int i=r1;i<=r;i+=r1){
        if(r%i==0){
         count++;
        }
        
        }
        System.out.println("Count: "+count);
        
        
        
        
    }
}
