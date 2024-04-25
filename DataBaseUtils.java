package exemplo_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtils {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/";	
	
	public static Connection getConnection(String nomeBanco, String usuario, String senha) 
			throws ClassNotFoundException, SQLException 
	{
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL+nomeBanco, usuario, senha);
	}
}
