package EmailClient;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import EmailClient.view.ViewFactory;

public class App extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage primaryStage) throws Exception {

      ViewFactory viewFactory = new ViewFactory();

      Scene scene = viewFactory.getMainScene();
      primaryStage.setScene(scene);
      primaryStage.show();



  }
}
