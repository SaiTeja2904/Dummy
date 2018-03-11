import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Account{
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	//private double monthlyInterestRate=0;
	private String date;

	Account(int id,double balance){
		this.id=id;
		this.balance=balance;
	}

	public void setAnnualIntrestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}

	public void dateCreated(String date){
		this.date=date;
	}

	public double getMonthlyInterestRate(){
		return ((this.annualInterestRate/100)/12);
	}

	public void withDraw(double value){
		this.balance-=value;
	}

	public void deposit(double value){
		this.balance+=value;
	}

	public void printDetails(){
		System.out.println("Account Number: "+this.id);
		System.out.println("Balance: $"+this.balance);
		System.out.println("Monthy Interest Rate: "+getMonthlyInterestRate());
		System.out.println("Date Created: "+date);
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Your ID");
		int id_main=sc.nextInt();
		System.out.println("Enter Intital deposit:$");
		double balance_main=sc.nextDouble();
		System.out.println("Enter annualInterestRate");
		double ait_main=sc.nextDouble();
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
       	Date dateobj = new Date();
       	String date_main=df.format(dateobj);
       	Account account=new Account(id_main,balance_main);
       	account.setAnnualIntrestRate(ait_main);
       	account.dateCreated(date_main);
       	account.withDraw(2500);
       	System.out.println("\nAfter Withdrawal of money");
       	account.printDetails();
       	account.deposit(3000);
       	System.out.println("\nAfter deposit of money");
       	account.printDetails();
	}
}