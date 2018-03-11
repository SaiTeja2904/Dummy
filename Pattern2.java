class Pattern2{
	public static void main(String[] args) {
		java.util.Scanner st=new java.util.Scanner(System.in);
		System.out.println("Enter n value");
		int n=st.nextInt();
	    for(int i=0;i<n;i++) {
            for(int j=0;j<n-i-1;j++)
                System.out.print("0");
            for(int k=0;k<i;k++)
                System.out.print("*");
            System.out.print("*");
            for(int k=0;k<i;k++)
                System.out.print("*");
            for(int j=0;j<n-i-1;j++)
                System.out.print("0");
            System.out.println(" ");
        }
    }     
}
/*
00*00
0***0
*****
*/