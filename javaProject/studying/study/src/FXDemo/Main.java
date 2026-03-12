package FXDemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button clickme = new Button("Click Me");
        Pane p = new Pane(clickme);
        Scene s = new Scene(p,800,450);
        primaryStage.setScene(s);
        clickme.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try{
                    stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        });
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        System.out.println("start");
        super.init();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
        super.stop();
    }
}
