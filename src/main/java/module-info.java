module kr.jhpark.annoying {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.codehaus.groovy;


    opens kr.jhpark.annoying to javafx.fxml;
    exports kr.jhpark.annoying;
    exports kr.jhpark.annoying.controller;
    opens kr.jhpark.annoying.controller to javafx.fxml;

    exports kr.jhpark.annoying.model;
    opens kr.jhpark.annoying.model to javafx.fxml;

    requires com.jfoenix;
    requires java.logging;


}