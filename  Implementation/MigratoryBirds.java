
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter: ");
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        // your code goes here
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
        int c5=0;
        int[] store=new int[5];
        
        for(int i=0;i<types.length;i++){
          if(types[i]==1){
            c1++;
            store[0]=c1;
            } 
          else if(types[i]==2){
            c2++;
            store[1]=c2;
            }      
        else if(types[i]==3){
            c3++;
            store[2]=c3;
            
            }   
        
            else if(types[i]==4){
            c4++;
            store[3]=c4;
            }   
        else if(types[i]==5){
            c5++;
            store[4]=c5;
            }   
            
        }
        
       int m=0,i;
       int id=0;
        for(i=0;i<store.length;i++){
        System.out.println((i+1)+" "+store[i]);
        m=store[i];   
        
        for(int j=0;j<store.length;j++){
            if(store[j]> m){
              m=store[j];
              id=j;
            }
        
            
        }
            
    } 
            
       System.out.println("Highest " + m);     
       System.out.println("ID " + (id+1))  ;   
            
            
        
        
        
        
        
        
        
        
        System.out.println("1= "+c1+" 2= "+c2+" 3= "+c3+" 4= "+c4+" 5= "+c5);
        
        
        
    }
}
