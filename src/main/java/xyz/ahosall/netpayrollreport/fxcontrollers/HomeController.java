package xyz.ahosall.netpayrollreport.fxcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import xyz.ahosall.netpayrollreport.utils.validators.PathValidator;
import xyz.ahosall.netpayrollreport.windows.DialogWindow;

public class HomeController {

  @FXML
  private TextField txtReportPathDatacon;

  @FXML
  private TextField txtReportPathCiss;

  @FXML
  private void handleGeneratorButton(ActionEvent event) {
    String reportPathDatacon = txtReportPathDatacon.getText();
    String reportPathCiss = txtReportPathCiss.getText();

    try {
      PathValidator.validate(reportPathDatacon);
      PathValidator.validate(reportPathCiss);
    } catch (IllegalArgumentException iae) {
      DialogWindow.show("Campos Obrigatórios", "Verifique os campos e tente novamente.");
      return;
    }

    // Start data processing
  }

}
