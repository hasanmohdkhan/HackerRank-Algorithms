
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        int maxH=height[0];
        for(int i=0;i<height.length;i++){
        if(height[i]>maxH){
           maxH=height[i];
            
        }
        }
        int count=0;
        for(int i= 0;i < height.length; i++){
        if(maxH==height[i]){
         count++;
        
        }
        
        
        }
        
        
        System.out.println("Number of candles: "+count);
        
        System.out.println(maxH);
        
    }
}
