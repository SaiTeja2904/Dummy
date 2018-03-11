import java.util.Scanner;
class Some
{
public static void main( String args[] )
{
System.out.print ("Size of square ");
Scanner sc=new Scanner(System.in);
int size = sc.nextInt();
int j = 1;
for (int i=1;i <= size; i++)
{
for (j=1;j<=size;j++)
{
if (i == 1 || i== size || j == 1 || j == size){
System.out.print("*");
}
else 
System.out.print(" "); 
}
System.out.println();
}
}
}