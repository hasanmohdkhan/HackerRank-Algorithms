import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args)throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Time: ");
        String time = in.next();
        
        
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        	
        Date date = inputFormat.parse(time);
        System.out.println(displayFormat.format(date));
        in.close();
          
        
       
       
       
       
    }
}
