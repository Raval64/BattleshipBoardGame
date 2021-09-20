package model;

/**
 * Implements the data model for the Players
 * 
 * @author Urbashi
 */
public class Player {
  /**
   * Player's name
   */
  private String name;
  
  /**
   * Player's board
   */
  private String [][] board;
  
  /**
   * Player's ships
   */
  private Ship [] ships;  
  
  
  /**
   * Empty constructor
   */
  public Player() {

  }

  /**
   * Parameterized constructor
   * @author Urbashi
   * @param name Player's name
   */
  public Player(String name)
  {
    setName(name);
    setBoard(new String[10][10]);
    setShips(new Ship[5]);
  }
  
  /**
   * Gets the player name
   * @author Urbashi
   * @return Player's name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Sets the player name
   * @author Urbashi
   * @param name Player's name
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
   * Gets the player's board
   * @author Urbashi
   * @return Player's board
   */
  public String [][] getBoard() {
    return board;
  }
  
  /** 
   * Sets the player's board
   * @author Urbashi
   * @param board Player's board
   */
  public void setBoard(String [][] board) {
    this.board = board;
  }
  
  /**
   * Gets the players ships
   * @author Urbashi
   * @return Player's ships
   */
  public Ship [] getShips() {
    return ships;
  }
  
  /**
   * Sets the player's ships
   * @author Urbashi
   * @param ships Player's ships
   */
  public void setShips(Ship [] ships) {
    this.ships = ships;
  }
}
