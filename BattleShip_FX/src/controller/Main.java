package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Implements the starting point of the App
 * 
 * @author Emmanuel
 */
public class Main extends Application {

  /**
   * Application start method
   * @author Emmanuel
   */
  @Override
  public void start(Stage primaryStage) {
    loadStage("/view/game.fxml", "BattleshipFX");
  }

  /**
   * Utility to load a stage
   * @author Emmanuel
   * @param fxml Name of the FXML file
   * @param title Window title
   */
  void loadStage(String fxml, String title) {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
    try {
      Parent root1 = (Parent) fxmlLoader.load();
      Stage stage = new Stage();
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.resizableProperty().setValue(Boolean.FALSE);
      stage.setTitle(title);
      stage.setScene(new Scene(root1));
      stage.getIcons().add(new Image("file:media/BattleshipFX.png"));
      stage.show();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Main entry point for the application
   * @author Emmanuel
   * @param args Default main app parameters
   */
  public static void main(String[] args) {
    launch(args);
  }
}
