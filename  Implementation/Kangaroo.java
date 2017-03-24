import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        /*
         *   x1 + s * v1 = x2 + s * v2  // euation s is no of jump point
         *   x1-x2 = s(v2-v1)
         *   s = (x1-x2)/(v2-v1)
         */
        if(v1>v2 && (x1-x2)%(v2-v1)==0){
        System.out.println("YES");
        
        }
        else 
        
        System.out.println("NO");
        
        
    }
}
