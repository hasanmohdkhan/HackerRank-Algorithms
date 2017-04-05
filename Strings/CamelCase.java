import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter:");
        String s = in.next();
        char[] ch =s.toCharArray();
        int count=1;
        
        for(int i=0;i<ch.length;i++){
        if(Character.isUpperCase(ch[i])){
        count++;
            
            
        }
            
        
        }
        
        
        System.out.println(count);
    }
}
