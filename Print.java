class Print
{
	public static void main(String[] args) {
		ConsoleReader r = new ConsoleReader();
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
			try{
				Thread.sleep(1000);//For Better Visualization
			}
			catch(InterruptedException e){
				System.out.println(e);
			} 
			for(int j=0;j<String.valueOf(i).length();j++)
			   System.out.print("\b");
			
		}
	}
}