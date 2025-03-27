module xyz.ahosall.netpayrollreport {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens xyz.ahosall.netpayrollreport.fxcontrollers to javafx.fxml;
    exports xyz.ahosall.netpayrollreport;
}
