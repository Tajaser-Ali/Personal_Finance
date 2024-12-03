package subject_selector;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class subject_application extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(subject_application.class.getResource("subjects-view.fxml"));
        Scene s1 = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("Select Subject");
        primaryStage.setScene(s1);
        primaryStage.show();
    }
}
