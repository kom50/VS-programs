package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			GridPane root = new GridPane();
			// Parent root = FXMLLoader.load(getClass().getResource("/FXMLFile.fxml"));
			Scene scene = new Scene(root, 400, 400);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			Button btn = new Button("Click Me?");
			btn.setId("btn");
			btn.setStyle(
					"-fx-text-color : blue; -fs-padding: 40px; -fx-border : 20;  -fx-margin-left : 40; -fx-padding : 15 15 11 15; -fx-font-weight : bold;  -fx-border-radius : 20;");

			btn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					System.out.println("Hello button is clicked..");

				}
			});

			Label l1 = new Label("Hello");
			btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent mEvent) {
					System.out.println("Mouse enter on button");
					l1.setText("Mouse enter on button.");
				}
			});
			root.getChildren().addAll(l1, btn);

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
