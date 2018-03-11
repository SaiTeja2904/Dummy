
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Time {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String st=String.valueOf(time).substring(8);
        if(st.equalsIgnoreCase("AM")){
            int abc=Integer.parseInt(time.substring(0,2));
            if(abc==12)
                abc=00;
            System.out.println("0"+abc+time.substring(2,8));
        }
        else if(st.equalsIgnoreCase("PM")){
        	int abc=Integer.parseInt(time.substring(0,2));
        	
            if(abc!=12)
                abc+=12;
        	System.out.println(abc+time.substring(2,8));
        }
    }
}