package xyz.ahosall.netpayrollreport.windows;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import xyz.ahosall.netpayrollreport.App;

public class HomeWindow {
  public static void show(Stage stage) throws IOException {
    FXMLLoader loader = new FXMLLoader(App.class.getResource("fxml/home.fxml"));
    Parent root = loader.load();

    stage.setScene(new Scene(root));
    stage.show();
  }
}
