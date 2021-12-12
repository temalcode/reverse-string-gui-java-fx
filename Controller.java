package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller
{
    @FXML
    private Button btn;

    @FXML
    private TextField text;

    @FXML
    private Label label;

    @FXML
    void reverseBtn(ActionEvent event)
    {
        reverse rr = new reverse();
        label.setText(rr.reverseString(text.getText()));
    }
}
