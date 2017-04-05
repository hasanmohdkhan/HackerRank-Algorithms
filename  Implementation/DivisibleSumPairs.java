import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int count=0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
          
        for(int i=0;i<a.length;i++){
        
        for(int j=0;j<a.length;j++){
            
        if(i < j && ((a[i]+a[j])%k)==0){
        count++;
        
        }
        
        
        
        
        
        }
        
        
        
        
        }
    
    
       System.out.println(count);
    
    
    }
    
}
