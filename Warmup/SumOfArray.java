import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumOfArray {
    
    public static int mSumArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum =arr[i]+sum;
            
        }
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Value in array");
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int sum=mSumArray(arr);
        System.out.print("Sum : ");
        System.out.print(sum);
        
    }
}
