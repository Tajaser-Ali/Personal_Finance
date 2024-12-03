package Personal_Finance;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ExpensesController {

    @FXML
    DatePicker dropDate = new DatePicker();

    @FXML
    TextField txtDesc = new TextField();

    @FXML
    TextField txtValue = new TextField();

    @FXML
    TextField txtCategory = new TextField();

    @FXML
    TextArea txtAreaTotal = new TextArea();

    @FXML
    Label lbExpenses = new Label();

    public void onClickAddEntry(ActionEvent actionEvent) {
    }

    public void onClickSeeExpenses(ActionEvent actionEvent) {

        //read value from input on SceneBuilder
        LocalDate ld = dropDate.getValue();
        String desc = txtDesc.getText();
        String category = txtCategory.getText();
        double value = Double.parseDouble(txtValue.getText());

        //new object from Expense
        Expense e1 = new Expense(category, desc, value, ld);

        //calculate totalExpenses
        e1.addTotalExpenses();

        //show output from SceneBuilder
        txtAreaTotal.setText(txtAreaTotal.getText() + e1.toString());
        lbExpenses.setText("Total expenses: $" +Expense.getTotalExpenses());
    }
}
