module org.example.tdlist {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tdlist to javafx.fxml;
    exports org.example.tdlist;
}