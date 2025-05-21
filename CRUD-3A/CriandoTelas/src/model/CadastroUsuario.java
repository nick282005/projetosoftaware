package model;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;
 
public class CadastroUsuario {
	
	public void cadastrarUsuario(Usuario usuario) throws SQLException {
		
		
		//Comando para inserir dados no banco de dados
		String sql = "INSERT INTO usuario (id, login, nome, senha) VALUES (?, ?, ?, ?)";
		try {
		//Conexão com o banco de dados
		Connection conn = ConexaoDB.conectar();
		
		//Preparar a consulta
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		//Substituir as ? pelos dados do objeto usuario
		stmt.setInt(1, usuario.getId());
		stmt.setString(2, usuario.getLogin());
		stmt.setString(3, usuario.getNome());
		stmt.setString(4, usuario.getSenha());
		
		//Executar a consulta
		stmt.executeUpdate();
		
		//Criar tela
		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
		alerta.setTitle("CADASTRO REALIZADO");
		alerta.setHeaderText("CADASTRADO COM SUCESSO");
		alerta.setContentText("O NOVO USUARIO FOI INSERIDO NO SISTEMA");
		alerta.showAndWait();
		}catch(SQLException e) {
			Alert alerta = new Alert(Alert.AlertType.INFORMATION);
			alerta.setTitle("ERRO NO CADASTRO");
			alerta.setHeaderText("CADASTRO DEU ERRADO");
			alerta.setContentText("LOGIN JA EXISTE BOBÃO");
			alerta.showAndWait();
		}
		
	}
}
