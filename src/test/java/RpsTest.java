import org.junit.*;
import static org.junit.Assert.*;

public class RpsTest {

  @Test
  public void validateUserInput_TestsForPlayerOneInput_True(){
    Rps playerOne = new Rps();
    boolean expectedOutput = true;
    assertEquals(expectedOutput, playerOne.validateUserInput("rock"));
  }

  @Test
  public void validateUserInput_TestsForPlayerTwoInput_True(){
    Rps playerTwo = new Rps();
    boolean expectedOutput = true;
    assertEquals(expectedOutput, playerTwo.validateUserInput("paper"));
  }

  @Test
  public void calculateWinner_TestsForPlayersTie_Tie(){
    Rps playerOne = new Rps();
    Rps playerTwo = new Rps();
    String expectedOutput = "Tie!";
    //String[] playerHands = {playerOne.hand, playerTwo.hand};
    assertEquals(expectedOutput, playerOne.calculateWinner("rock", "rock"));
  }

  @Test
  public void calculateWinner_TestForPlayersRockVScissors_Player_1_wins() {
     Rps playerOne = new Rps();
     Rps playerTwo = new Rps();
     String expectedOutput = "Player 1 Wins!";
     assertEquals(expectedOutput, playerOne.calculateWinner("rock", "scissors"));
  }

  @Test
  public void calculateWinner_TestForPlayersPaperVSROCK_Player_1_wins() {
     Rps playerOne = new Rps();
     Rps playerTwo = new Rps();
     String expectedOutput = "Player 1 Wins!";
     assertEquals(expectedOutput, playerOne.calculateWinner("paper", "rock"));
  }

  @Test
  public void calculateWinner_TestForPlayersScissorsVSPaper_Player_1_wins() {
     Rps playerOne = new Rps();
     Rps playerTwo = new Rps();
     String expectedOutput = "Player 1 Wins!";
     assertEquals(expectedOutput, playerOne.calculateWinner("scissors", "paper"));
  }

  @Test
  public void calculateWinner_TestForPlayersPaperVSROCK_Player_2_wins() {
     Rps playerOne = new Rps();
     Rps playerTwo = new Rps();
     String expectedOutput = "Player 2 Wins!";
     assertEquals(expectedOutput, playerOne.calculateWinner("rock", "paper"));
  }


  @Test
  public void calculateWinner_TestForPlayersRockVScissors_Player_2_wins() {
     Rps playerOne = new Rps();
     Rps playerTwo = new Rps();
     String expectedOutput = "Player 2 Wins!";
     assertEquals(expectedOutput, playerOne.calculateWinner("scissors", "rock"));
  }

  @Test
  public void calculateWinner_TestForPlayersScissorsVSPaper_Player_2_wins() {
     Rps playerOne = new Rps();
     Rps playerTwo = new Rps();
     String expectedOutput = "Player 2 Wins!";
     assertEquals(expectedOutput, playerOne.calculateWinner("paper", "scissors"));
  }

}
