public class Rps {

  public boolean validateUserInput(String input) {
    boolean validate;
    if (input.equals("rock") || input.equals("scissors") || input.equals("paper") ) {
      validate = true;
    } else { validate = false; System.out.println("Not a valid selection.");}
    return validate;

  }
}
