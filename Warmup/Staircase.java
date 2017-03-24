import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {
        
    public static void main(String[] args) {
        int count=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = in.nextInt();
       for(int i=1;i<=n;i++){
        
         for(int j=1;j<=n;j++){
          if((i+j)>n){
            System.out.print("#");
            
            }
          else
           System.out.print(" ");
          
          
          
          }
         System.out.println();
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
