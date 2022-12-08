module cn.xbgit.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens cn.xbgit.javafxdemo to javafx.fxml;
    exports cn.xbgit.javafxdemo;
}