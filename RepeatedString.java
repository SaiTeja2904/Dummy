import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long count=0;
        String temp="";
           for(long i=0;i<n;i++){
            temp=temp+s;
        }
        for(long j=0;j<n;j++){
            if(temp.charAt((int)j)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
