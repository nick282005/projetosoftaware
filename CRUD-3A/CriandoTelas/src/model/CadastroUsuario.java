package model;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class CadastroUsuario {
	
	public void cadastrarUsuario(Usuario usuario) throws SQLException {
		
		
		//Comando para inserir dados no banco de dados
		String sql = "INSERT INTO usuario (id, login, nome. senha) VALUES (?, ?, ?, ?)";
		
		//Conexão com o banco de dados
		Connection conn = ConexaoDB.conectar();
		
		//Preparar a consulta
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		//Substituir as ? pelos dados do objeto usuario
		stmt.setInt(1, usuario.getId());
		stmt.setString(2, usuario.getLogin());
		stmt.setString(2, usuario.getNome());
		stmt.setString(2, usuario.getSenha());
		
		//Executar a consulta
		stmt.executeUpdate();
	}
 
}