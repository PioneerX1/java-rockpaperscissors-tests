public class Rps {
  public String hand;
  public boolean validateUserInput(String input) {
    boolean validate;
    if (input.equals("rock") || input.equals("scissors") || input.equals("paper") ) {
      validate = true;
      hand = input;
    } else {
     validate = false;
     System.out.println("Not a valid selection.");
   }
    return validate;
  }

  public String calculateWinner(String p1Hand, String p2Hand){
    if (p1Hand.equals(p2Hand)){
      return "Tie!";
    } else if (p1Hand.equals("rock") && p2Hand.equals("scissors")) {
      return "Player 1 Wins!";
    } else if (p2Hand.equals("rock") && p1Hand.equals("scissors")) {
      return "Player 2 Wins!";
    } else if (p1Hand.equals("paper") && p2Hand.equals("rock")) {
      return "Player 1 Wins!";
    } else if (p2Hand.equals("paper") && p1Hand.equals("rock")) {
      return "Player 2 Wins!";
    } else if (p1Hand.equals("scissors") && p2Hand.equals("paper")) {
      return "Player 1 Wins!";
    } else if (p2Hand.equals("scissors") && p1Hand.equals("paper")) {
      return "Player 2 Wins!";
    } else {
      return "??";
    }
  }
}
