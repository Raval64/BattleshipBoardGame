package controller;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Player;
import model.Ship;

/**
 * Implements a basic utility class
 * 
 * @author Sandeep
 * @author Emmanuel
 */
public class Utils {
  /**
   * Return the name of a ship givens its integer index
   * @author Sandeep
   * @param type index
   * @return name of the ship
   */
  public static String getBoatName(int type) {
    switch (type) {
    case 0:
      return "Carrier";
    case 1:
      return "Battleship";
    case 2:
      return "Cruiser";
    case 3:
      return "Submarine";
    case 4:
      return "Destroyer";
    }

    return "";
  }
  
  /**
   * Display a dialog with a message
   * @author Emmanuel
   * @param msg Message
   * @param showAndWait true=wait, false=no wait
   */
  public static void showInfo(String msg, boolean showAndWait) {
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("BattleshipFX - Info");
    alert.setHeaderText(null);
    alert.setContentText(msg);
    Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
    stage.getIcons().add(new Image("file:media/BattleshipFX.png"));

    if (showAndWait) {
      alert.showAndWait();
    } else {
      alert.show();
    }
  }
  
  /**
   * Return the color of a ship givens its index
   * @author Sandeep
   * @param type index
   * @return name of the ship
   */
  public static Color getBoatColor(String type) {
    if (type.equals("0")) {
      return Color.SALMON;
    } else if (type.equals("1")) {
      return Color.LIGHTGREEN;
    } else if (type.equals("2")) {
      return Color.LIGHTSKYBLUE;
    } else if (type.equals("3")) {
      return Color.PLUM;
    } else if (type.equals("4")) {
      return Color.SANDYBROWN;
    }

    return Color.BLACK;
  }
  
  /**
   * Checks if all the ships of a Player are destroyed
   * @author Sandeep
   * @param p Player
   * @return true if game over, false otherwise
   */
  public static boolean isGameOver(Player p) {
    for (Ship s : p.getShips()) {
      if (!s.isDestroyed()) {
        return false;
      }
    }

    return true;
  }
  
  /**
   * Returns the number of active ships on a player's board
   * @author Sandeep
   * @param p Player
   * @return the number of active ships
   */
  public static int numberOfShipsOn(Player p) {
    int c = 0;
    for (Ship s : p.getShips()) {
      if (!s.isDestroyed()) {
        c++;
      }
    }

    return c;
  }
  
  /**
   * Prints the board of player
   * @author Sandeep
   * @param p Player
   */
  public static void printBoard(Player p) {
    System.out.println("***" + p.getName() + "***");
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(p.getBoard()[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("");
  }
}
