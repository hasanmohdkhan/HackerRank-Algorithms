

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IntroToTutorialChallenges {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       System.out.print("Enter: ");
       Scanner in=new Scanner(System.in);
       int key=in.nextInt();
       int n=in.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i]=in.nextInt();
           
        }
         int index=0;
         for(int i=0;i<arr.length;i++){
            
            if(key==arr[i]){
                index=i;  
            break;
            
            }
            
            
            }
    
    
        
    
       System.out.println(index);
    
    
    }
}