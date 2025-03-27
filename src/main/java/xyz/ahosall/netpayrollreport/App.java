package xyz.ahosall.netpayrollreport;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import xyz.ahosall.netpayrollreport.windows.HomeWindow;

/**
 * 
 * @author Ahosall
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        HomeWindow.show(stage);
    }

    public static void main(String[] args) {
        launch();
    }

}