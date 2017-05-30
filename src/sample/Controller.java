package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextArea in;
    public Button button;
    public TextField out;
    public void clicked()
    {
        out.setText(
                solve.Companion.solve(
                        in.getText()
                )
        );
    }
}
