import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTriplets{
   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter : ");
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int mA=0;
        int mB=0;
        if(a0>b0){
          mA++;  
            
           }
        else if (b0>a0){
        mB++;
        
        
        }       
        
         
        if(a1>b1){
          mA++;  
           }
        else if (b1>a1){
            mB++;
        }
        
        
        if(a2>b2){
            mA++;
           }
        else if (b2>a2){
        mB++;
        
        }
        
        System.out.println("Score A: "+mA+ " B: " +mB);
    }
}
