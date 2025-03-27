package xyz.ahosall.netpayrollreport.windows;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import xyz.ahosall.netpayrollreport.fxcontrollers.DialogController;

public class DialogWindow {
  public static void show(String title, String message) {
    try {
      URL path = DialogWindow.class.getResource("/xyz/ahosall/netpayrollreport/fxml/dialog.fxml");
      FXMLLoader loader = new FXMLLoader(path);
      Parent root = (Parent) loader.load();

      Scene newScene = new Scene(root);
      Stage newStage = new Stage();

      DialogController controller = loader.getController();
      controller.setStage(newStage);

      controller.setErrMessage(title, message);

      newStage.setScene(newScene);
      newStage.showAndWait();
    } catch (IOException ie) {
      ie.printStackTrace();
    }
  }

}
