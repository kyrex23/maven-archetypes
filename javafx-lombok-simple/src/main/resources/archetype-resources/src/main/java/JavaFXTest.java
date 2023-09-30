package ${package};

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


@Slf4j
public class JavaFXTest extends Application {

	public static void main(String[] args) {
		log.info("Launching the JavaFX application...");
		launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException {
		stage.setTitle("JavaFX - Test");
		Parent root = FXMLLoader.load(this.getClass().getResource("/fxml/javafx_test.fxml"));
		Scene scene = new Scene(root, 200, 150);
		stage.setScene(scene);
		stage.show();
	}

}
