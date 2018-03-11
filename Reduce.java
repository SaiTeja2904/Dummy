import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Reduce {

    static String super_reduced_string(String s){
        // Complete this function
        int i=0;
       StringBuffer a=new StringBuffer(s);
        while(i!=a.length()-1)
        {
            if(a.charAt(i)==a.charAt(i+1))
            {
                a.delete(i,i+2);
                i=0;
            }
            else
                i++;
        }
        String b=new String(a);
        if(b.length()==0)
            return "Empty String";
        else
            return b;
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
