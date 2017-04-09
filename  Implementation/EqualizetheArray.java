import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EqualizetheArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.print("Enter: ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
         arr[i]=in.nextInt();
        
        
        }
        
         int count=0;
         Set<Integer> set=new LinkedHashSet<Integer>();
         for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            
            }
            
        Object[] d=set.toArray();  
         int m;
         int c=0;
         int[] match=new int[d.length];
          for(int i=0;i<d.length;i++){
           m=(Integer)d[i];
           c=0;
          for(int j=0;j<arr.length;j++){
            
            if(m==arr[j]){
              c++;            
             // System.out.println("M "+m +" arr["+j+"]" +" "+arr[j]);
            }
          } 
            match[i]=c;
            
              
              
           }
           
           Arrays.sort(match);
           
          
            int uniq=n-(match[(match.length)-1]);
           
           
    System.out.println("Count: "+uniq);
    
    
    }
}