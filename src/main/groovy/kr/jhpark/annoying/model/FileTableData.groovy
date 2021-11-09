package kr.jhpark.annoying.model

import groovy.transform.CompileStatic
import groovy.transform.builder.SimpleStrategy
import javafx.beans.property.SimpleStringProperty

@CompileStatic
class FileTableData {

    SimpleStringProperty before;
    SimpleStringProperty after;

    FileTableData(String before, String after){
        this.before = new SimpleStringProperty(before)
        this.after = new SimpleStringProperty(after)
    }

    String getBefore() {
        return before.get()
    }



    void setBefore(SimpleStringProperty before) {
        this.before = before
    }

    String  getAfter() {
        return after.get()
    }

    void setAfter(SimpleStringProperty after) {
        this.after = after
    }
}
