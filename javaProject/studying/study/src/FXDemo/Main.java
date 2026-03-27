package FXDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setResizable(false);

        ImageView iv = new ImageView(new Image(getClass().getResourceAsStream("/resource/image/bird.png")));
        StackPane root = new StackPane();
        root.getChildren().add(iv);
        Scene s = new Scene(root,800,450);
        stage.setScene(s);

        stage.show();
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
