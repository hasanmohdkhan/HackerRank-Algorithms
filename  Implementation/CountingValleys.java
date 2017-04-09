import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter :");
        int n=in.nextInt();
        char[] step=in.next().toCharArray();
        int countHill=0;
        int vally=0;
        for(int i=0;i<step.length;i++){
        if(step[i]=='U'){
         countHill++;
         System.out.println( i  +" "+"U: "+countHill);
        }
        else
            
             countHill--;
             System.out.println( i  +" "+"D: "+countHill);
             
        
         if(countHill==0 && step[i]=='U'){
            vally++;
            System.out.println("vally block: "+vally);
            }  
           
        
        }
        
        System.out.println(vally);
        
        
        
    }
}