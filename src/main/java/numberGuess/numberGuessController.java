package numberGuess;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class numberGuessController {
    @FXML
    Button btnCheck = new Button();

    @FXML
    TextField txtGuess = new TextField();

    @FXML
    Label lbAlert = new Label();

    @FXML
    VBox vBox = new VBox();

    numberGuess ng = new numberGuess();
    int guess = 0;
    int tries = 0;

    public void checkGuess() {
        guess = Integer.parseInt(txtGuess.getText());
        lbAlert.setText("");
        if (guess < 9 || guess > 100) {
            lbAlert.setTextFill(Color.RED);
            lbAlert.setText("Enter a two digit number");
        } else {
            tries++;
            Label nLabel = new Label();
            nLabel.setFont(new Font("Arial", 24));
            Label nLabel2 = new Label();
            nLabel2.setFont(new Font("Arial", 24));

            if (ng.getNumber() == guess) {
                lbAlert.setTextFill(Color.GREEN);
                lbAlert.setText("You Won! That's the number!");
                nLabel2.setTextFill(Color.YELLOWGREEN);
                nLabel.setTextFill(Color.YELLOWGREEN);
            } else {
                if (ng.onesCorrect(guess)) {
                    nLabel2.setTextFill(Color.YELLOWGREEN);
                } else if (ng.onesExist(guess)) {
                    nLabel2.setTextFill(Color.ORANGE);
                } else {
                    nLabel2.setTextFill(Color.BLACK);
                }
                if (ng.tensCorrect(guess)) {
                    nLabel.setTextFill(Color.YELLOWGREEN);
                } else if (ng.tensExist(guess)) {
                    nLabel.setTextFill(Color.ORANGE);
                } else {
                    nLabel.setTextFill(Color.BLACK);
                }

                if (tries == 5) {
                    lbAlert.setTextFill(Color.RED);
                    lbAlert.setText("Game Over!");
                    btnCheck.setDisable(true);
                } else {
                    lbAlert.setTextFill(Color.BLACK);
                    lbAlert.setText("GREEN: correct number and position. \n" +
                            "ORANGE: Correct Number but not position. \n" +
                            "BLACK: No Match \n" +
                            "Keep Trying");

                }
            }
            nLabel.setText("" + guess / 10 + " ");
            nLabel2.setText("" + guess % 10) ;
            HBox nHBox = new HBox( );

            nHBox.getChildren().add(nLabel);
            nHBox.getChildren().add(nLabel2);
            vBox.getChildren().add(nHBox);
        }

    }
}