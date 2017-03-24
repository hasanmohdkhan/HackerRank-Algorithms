import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  AVaeryBigSum{

    public static void main(String[] args) {
        
        long sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter :");
        int n = in.nextInt();
        long arr[] = new long[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        
        
        for(int arr_i=0; arr_i < n; arr_i++){
            sum +=arr[arr_i];
        }
        
        System.out.print("Sum: "+sum);
        
        
        
        
        
        
        
    }
}
