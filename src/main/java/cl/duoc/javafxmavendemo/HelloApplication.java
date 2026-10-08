package cl.duoc.javafxmavendemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void init() {
        System.out.println("init(): preparación previa a la interfaz");
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start(): se crea y muestra la interfaz");
        primaryStage.setScene(new Scene(new VBox(), 400, 200));
        primaryStage.show();
    }

    @Override
    public void stop() {
        System.out.println("stop(): liberación de recursos antes del cierre");
    }

    public static void main(String[] args) {
        launch(args);
    }
}