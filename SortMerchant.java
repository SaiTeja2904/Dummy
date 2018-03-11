import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SortMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int flag[]=new int[n];
        int count=0;
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
            flag[i]=0;
        }
        int abc;
        for(int i=0;i<n;i++){
            if(flag[i]==0){
                flag[i]=1;
                abc=c[i];
                for(int j=i+1;j<n;j++){
                    if(flag[j]==0 && c[j]==abc){
                        count++;
                        flag[j]=1;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
