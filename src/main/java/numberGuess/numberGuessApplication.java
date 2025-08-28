package numberGuess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class numberGuessApplication extends Application {
    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new
                FXMLLoader(numberGuessApplication.class.getResource("numberGuess-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 450);
        primaryStage.setTitle("Guess the number");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
