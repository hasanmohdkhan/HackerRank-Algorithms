import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {
     
    static int findPair(int m,int[] arr){
         int count=0;
         for(int i=0;i<arr.length;i++){
             if(m==arr[i]){
                
                
                count++;
                
                System.out.println("match: "+m + " Array: "+arr[i] +" m: " +count); 
                }
            
            }
         return (count/2);
        
        }
    
        
       
        
      
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter: ");
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        // finding uniques values
        Set<Integer> set=new LinkedHashSet<Integer>();
        for(int i=0; i < c.length ;i++){
         set.add(c[i]);
        }
        Object[] d=set.toArray();
        
        int count=0;
        int m;
        
        for(int i=0; i < d.length ;i++){
         System.out.println("Array " +d[i]);
         
        }
        
        
        
        for(int i=0;i<d.length;i++){
         m = (Integer)d[i];
         count=findPair(m , c)+ count;
          
         }
        
        System.out.println("count "+count);    
        }
}
