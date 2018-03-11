
class Static_demo extends SuperA
{
	
	public void hello(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse()); ;

		//System.out.println("Hello "+s);
		//System.err.println(super.abc);
	}
}

class Fun extends Static_demo
{
	static int abc=11;
	public static void main(String[] args) {
		new Static_demo().hello("yessssa");
		//System.out.println(this.abc);
	}
}