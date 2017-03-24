import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArrayRotation{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter :");
        int n = in.nextInt();// no. of element in arry
        int k = in.nextInt();// no. of rotation to be perform
        int q = in.nextInt();//new arry print index
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        // index for rotated array less than q
      
       
         int i;
         int last;
         int[] a2=new int[a.length+1];
         while(k>0){
         last=a[a.length-1];
         //System.out.println("last: "+last);
        
        for(i=0;i<a.length;i++){
           a2[i+1]=a[i];
             }
        
        // printing shifted array
        a2[0]=last;
        for(i=0;i<a2.length-1;i++){
            a[i]=a2[i];
         // System.out.print(a2[i]);
        
        
          }
         k--; 
       }
      
       int[] m=new int[q];
     for(int a0 = 0; a0 < q; a0++){
             m[a0] = in.nextInt();
            System.out.println(a2[m[a0]]);
        } 
        
        
        
      
      
      
                
    }
}
