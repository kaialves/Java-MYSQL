package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseUtils {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/";	
	
	public static Connection getConnection(String nomeBanco, String usuario, String senha) 
			throws ClassNotFoundException, SQLException 
	{
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL+nomeBanco, usuario, senha);
	}
	
	public static boolean insert(Connection conn, String sql) 
			throws SQLException 
	{
		Statement cmd =  conn.createStatement();
		cmd.executeUpdate(sql);	
	
		return true;
	}
	
	public static List<String> list(Connection conn, String sql) throws SQLException {
		List<String> linhas = new ArrayList<String>();
		
		Statement cmd = conn.createStatement();		
		ResultSet dados = cmd.executeQuery(sql);		
		
		while(dados.next()) {
			linhas.add("Id:         " + dados.getInt(1));
			linhas.add("Nome:       " + dados.getString(2));
			linhas.add("Nascimento: " + dados.getDate(3));
			linhas.add("Peso:       " + dados.getDouble(4));
			linhas.add("Cor:        " + dados.getString(5));
			linhas.add("\n-----------------\n");
		}
		
		return linhas;
	}
	
}
