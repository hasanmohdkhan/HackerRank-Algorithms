import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        int countZ=0;
        int countN=0;
        int countP=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
    
        for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
        countZ++;
        
        
        }
        else if(arr[i]<0){
        countN++;
        
        }
        else if (arr[i]>0){
        countP++;
        
        
        }
          }
          System.out.println("Zero: "+countZ);
          System.out.println("+ve: "+countP);
          System.out.println("-ve: "+countN);
      
          double r1=(double)countP/n;
          double r2=(double)countN/n;
          double r3=(double)countZ/n;
          System.out.println("r1: "+r1);
          System.out.printf("%.6f\n",r1);
         
         System.out.println("-ve: "+r2); 
         System.out.printf("%.6f\n",r2);
         
         System.out.println("Zero: "+r3);
         System.out.printf("%.6f\n",r3);
          
      
    }
        
}
