import java.util.Scanner;
class Mystery
{	String day; 
	boolean checkDate(String day)
	{
		this.day=day;
		if(day.equals("Sunday") ||day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday") )
		{
			return true;
		}
		else
			return false;

	}	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		String day=sc.next();
		Mystery m=new Mistery();
		if(m.checkDate(day))
		{
			System.out.println("Successful");
		}
		else
		{
			System.out.println("Sorry");
		}
	}
}