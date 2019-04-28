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
//    Pane pane = FXMLLoader.load(getClass().getResource("/MainLayout.fxml"));
//
//    Scene scene = new Scene(pane);
//    scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
//    primaryStage.setScene(scene);
//    primaryStage.show();

      ViewFactory viewFactory = new ViewFactory();

      Scene scene = viewFactory.getMainScene();
      primaryStage.setScene(scene);
      primaryStage.show();


  }
}
