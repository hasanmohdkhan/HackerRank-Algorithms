
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            int diff=5-(grade%5);
            if(grade<38||diff>=3){
            System.out.println(grade);
            }             
            else{
                
            System.out.println(grade+diff);
            
            }
            
            
            
            
            
        }
    }
}
