import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppétit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        Scanner in=new Scanner(System.in);
        System.out.print("Enter: ");
        int n=in.nextInt();
        int k=in.nextInt();
        int[] item=new int[n];
        for(int i= 0;i <item.length ;i++  ){
          item[i]=in.nextInt();  
        
        
        }
        
        int charges=in.nextInt();         
        
        int sumOfAllItem=0;
        for(int i= 0;i <item.length ;i++){
           sumOfAllItem+=item[i];
        
        
        }
        sumOfAllItem=sumOfAllItem-item[k]; // left item  not eaten by Anna
        
        int actualCharge=(sumOfAllItem/2);
         if(charges-actualCharge==0){
            System.out.println("Bon Appetit");
            
            }       
        else
        
          System.out.println((charges-actualCharge));
    
    
    }
}