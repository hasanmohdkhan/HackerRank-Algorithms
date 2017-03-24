import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter :");
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int  homeRange;
        int countA=0;
        int countO=0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            homeRange=a+(apple[apple_i]); 
            System.out.println("outP: " +homeRange);
            
            if(homeRange>=s && homeRange<=t) 
           { countA++;
            
            }
            
            
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            homeRange=b+(orange[orange_i]); 
            System.out.println("outORan: " +homeRange);
            
            if(homeRange>=s && homeRange<=t) 
           { countO++;
            
            }
            
            
            
        }
        System.out.println("O/p:"+countA);
        System.out.println("O/p:"+countO);
        
        
        
    }
}
