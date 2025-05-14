package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//Titulo Tela
			primaryStage.setTitle("Tela Cadastro");
			
			//Informa se a tela pode mudar o tamanho
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			
			//Carregar
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TelaCadastro.fxml"));
			Parent arquivoFXML = loader.load();
			
			Scene home = new Scene(arquivoFXML);
			primaryStage.setScene(home);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
