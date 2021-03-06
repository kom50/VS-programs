package application;

// import com.sun.glass.events.MouseEvent;
// import com.sun.scenario.effect.impl.state.HVSeparableKernel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Scene scene = new Scene(root,400,400);

			Button btn1 = new Button("Say, Hello World");
			// Button btn2 = new Button("Say World");
			btn1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					System.out.println("hello world");
				}
			});

			// StackPane root = new StackPane();
			GridPane root = new GridPane();
			root.getChildren().add(btn1);
			// root.getChildren().add(btn2);
			Scene scene = new Scene(root, 600, 400);
			primaryStage.setTitle("First JavaFX Application");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// btn1.setId("ok");

			btn1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent me) {
					System.out.println("hello world");
				}
			});
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
