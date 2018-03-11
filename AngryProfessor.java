import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String temp;
        String sol[]=new String[t];
        int count=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int i=0; i < n; i++){
                a[i] = in.nextInt();
            }
            count=0;
            for(int i=0;i<n;i++){
                if(a[i]<=0)
                    count++;
            }
            if(count>=k)
                temp="NO";
            else
                temp="YES";
            sol[a0]=temp;
        }
        
        for(String dep:sol){
            System.out.println(dep);
        }
    }
}