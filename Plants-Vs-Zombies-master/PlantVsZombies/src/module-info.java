module PlantVsZombies {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.media;

    opens code.model;
    opens code.view;
    opens code.controller;
}