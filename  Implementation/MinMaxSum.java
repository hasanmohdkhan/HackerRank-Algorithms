import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {
    
    public long mSumOffour(long p,long q,long r,long s){
    return p+q+r+s;
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        MinMaxSum obj=new MinMaxSum();
        long[] r=new long[5];
        r[0]=obj.mSumOffour(b,c,d,e);
        r[1]=obj.mSumOffour(a,c,d,e);
        r[2]=obj.mSumOffour(a,b,d,e);
        r[3]=obj.mSumOffour(a,b,c,e);
        r[4]=obj.mSumOffour(a,b,c,d);
        
        Arrays.sort(r);
       /* for(int i=0;i<5;i++){
        System.out.println(r[i]);
      } */
        System.out.println(r[0]+" "+r[r.length-1]);
      
    }
}
