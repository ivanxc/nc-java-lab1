module com.ivanxc.netcracker.ballincontainer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.ivanxc.netcracker.lab to javafx.fxml;
    exports com.ivanxc.netcracker.lab;
}