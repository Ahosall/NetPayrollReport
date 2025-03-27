package xyz.ahosall.netpayrollreport.fxcontrollers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DialogController {
    private Stage stage;

    @FXML
    private Label lblTitle;

    @FXML
    private Label lblMessage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setErrMessage(String title, String message) {
        lblTitle.setText(title);
        lblMessage.setText(message);
    }
    
    @FXML
    private void handleOk() {
        stage.close();
    }

}
