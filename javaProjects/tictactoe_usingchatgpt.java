import java.util.Scanner;

public class tictactoe_usingchatgpt {
  static Scanner input = new Scanner(System.in);
  static String[][] board = new String[3][3];
  static String player = "X";
  
  public static void main(String[] args) {
    // Initialize the board
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = " ";
      }
    }
    
    // Play the game
    while (true) {
      // Print the current board
      printBoard();
      
      // Get the player's move
      System.out.print("Enter row (0, 1, 2) for player " + player + ": ");
      int row = input.nextInt();
      System.out.print("Enter column (0, 1, 2) for player " + player + ": ");
      int col = input.nextInt();
      board[row][col] = player;
      
      // Check for a win
      if (isWin()) {
        System.out.println("Player " + player + " wins!");
        break;
      }
      
      // Check for a draw
      if (isDraw()) {
        System.out.println("Draw!");
        break;
      }
      
      // Switch players
      if (player.equals("X")) {
        player = "O";
      } else {
        player = "X";
      }
    }
  }
  
  public static void printBoard() {
    for (int i = 0; i < 3; i++) {
      System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
      if (i != 2) {
        System.out.println("-----------");
      }
    }
    System.out.println();
  }
  
  public static boolean isWin() {
    // Check rows
    for (int i = 0; i < 3; i++) {
      if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
        return true;
      }
    }
    
    // Check columns
    for (int i = 0; i < 3; i++) {
      if (board[0][i].equals(player) && board[1][i].equals(player) && board[2][i].equals(player)) {
        return true;
      }
    }
    
    // Check diagonals
    if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
      return true;
    }
    if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player)) {
      return true;
    }
   }
}
    
