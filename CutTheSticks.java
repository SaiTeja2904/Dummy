import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i=0;i<n;i++)
            {
            	int count=0;
            	 for(int k=0;k<n;k++){
              	if(arr[k]!=999)
              		count++;
              }
              if(count>0)
              System.out.println(count);
            	CutTheSticks cts=new CutTheSticks();
              int temp=cts.minValue(arr);
              //System.out.println("***"+temp);
              for(int j=0;j<n;j++){
              	if(arr[j]!=999)
              	    arr[j]-=temp;
              	if(arr[j]<=0){
              		arr[j]=999;
              	}
              }

             
            }
        }
    
     int minValue(int...yy){
         int min=999;  
         for(int abc:yy){
               if(min>abc){
                   min=abc;
               }
           }
         return min;
        }
    }
