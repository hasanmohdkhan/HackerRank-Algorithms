import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Test{
public static void main(String[] args) {              
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n k q: ");
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            
            int m = in.nextInt();  
            System.out.println("k :"+k);
            k = k%n;
            System.out.println("k "+k+" n "+n);
            int z = m-k;    
            System.out.println("k "+k+" z "+z+ " m "+ m);
           
            if(m-k < 0){
                z = m-k+n;
            }
            System.out.println(a[z]);  
        }
    }



}