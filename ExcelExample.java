import java.sql.*;
//import sun.jdbc.odbc.*;

class ExcelExample
{
	public static void main(String[] args)throws SQLException {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("Hello");
	}
}