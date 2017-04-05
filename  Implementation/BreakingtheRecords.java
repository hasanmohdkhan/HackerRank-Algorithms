import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingtheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        // your code goes here
        int max=score[0];
        int min=score[0];
        int countMin=0;
        int countMax=0;
        
        for(int i=0;i<score.length;i++){
            if(score[i]<min){
              min=score[i];
              countMin++;
            
            }
            if(max<score[i] /* >max */){
            max=score[i];
            countMax++;
            
            }
        }
        
        System.out.println(countMax+" "+countMin);
        
        
        
        
        
        
        
        
        
    }
}
