package org.example;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Client client= new Client();
        new Thread(client.start());
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),400,500);
        stage.setTitle("Chat not GPT");
        ChatController controller = fxmlLoader.getController();
        controller.setClient(client);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}