package model;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConexaoDB {
 
	private static final String URL = "jdbc:mysql://localhost:3306/sistema";
	
	
	//Informar o Usuario e a senha do banco de dados
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	//Método estatico da classe qe retorna a conexão com o banco
	public static Connection conectar() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}