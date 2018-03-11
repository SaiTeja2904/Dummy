import java.util.Scanner;
class Check{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1=sc.next();
		int count=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='a'){
					count++;
				}

		}
		System.out.println(count);
	}
}