package xyz.ahosall.netpayrollreport.fxcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import xyz.ahosall.netpayrollreport.utils.validators.PathValidator;

public class HomeController {

  @FXML
  private TextField txtReportPathDatacon;

  @FXML
  private TextField txtReportPathCiss;

  @FXML
  private void handleGenerator(ActionEvent event) {
    String reportPathDatacon = txtReportPathDatacon.getText();
    String reportPathCiss = txtReportPathCiss.getText();

    try {
      PathValidator.validate(reportPathDatacon);
      PathValidator.validate(reportPathCiss);
    } catch (IllegalArgumentException iae) {
      System.err.println(iae.getMessage());
      return;
    }

    // Start data processing
  }

}
