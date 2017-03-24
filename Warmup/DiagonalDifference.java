import java.*;
import java.util.*;
public class DiagonalDifference {

    public static void main(String[] args) {
        int sumD1=0;
        int sumD2=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
    
        // diagonal 1
        
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                if(a_i==a_j){
                 sumD1+=a[a_i][a_j];
                 System.out.println("SumD1: "+sumD1+"i,j: "+a_i+","+a_j);  
                
                }
              
            }
        }
         // diagonal 2
         int i,j;
         for(i=0,j=n-1; i<a.length && j>=0;i++, j--){
           sumD2=sumD2+a[i][j];
           System.out.println("SumD2: "+sumD2+"i,j: "+i+","+j);
        } 
     
     System.out.println("SumD1: "+sumD1);
     System.out.println("SumD2: "+sumD2);
     int result=sumD1-sumD2;
      result=Math.abs(result);
    
     System.out.println("Difference: "+result);
     
     
    
    
    }
    
    
    
    
    
    
    
    
    
    
}
