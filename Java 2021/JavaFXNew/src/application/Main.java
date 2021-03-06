package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
//import javafx.event.Event;
import javafx.event.EventHandler;
//import javafx.event.EventTarget;
import javafx.event.EventType;
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
					"-fx-text-color : blue; -fx-padding: 60px; -fx-border : 30;  -fx-margin-left : 40; -fx-padding : 15 15 11 15; -fx-font-weight : bold;  -fx-background-radius : 20;");

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
			btn.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent mEvent) {
					System.out.println("Mouse Exit on button");
					l1.setText("Mouse Exit on button.");
				}
			});
			
			root.add(btn, 1, 1);
			root.add(l1, 3, 1);
//			root.getChildren().addAll(l1, btn);

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
