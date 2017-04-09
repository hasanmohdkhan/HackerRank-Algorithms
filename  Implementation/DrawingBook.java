import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = in.nextInt();
        int p = in.nextInt();
        int front=p/2;
        int back=(n/2) - front;
        System.out.print((front < back )? front : back );
        
    }
}
