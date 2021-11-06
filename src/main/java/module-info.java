module kr.jhpark.annoying {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.codehaus.groovy;


    opens kr.jhpark.annoying to javafx.fxml;
    exports kr.jhpark.annoying;

    //opens kr.jhpark.annoying.controller to javafx.fxml;
    //exports kr.jhpark.annoying.controller;

}