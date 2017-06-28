import org.junit.*;
import static org.junit.Assert.*;

public class RpsTest {

  @Test
  public void validateUserInput_TestsForRps_True(){
    Rps playerOne = new Rps();
    boolean expectedOutput = true;
    assertEquals(expectedOutput, playerOne.validateUserInput("rock"));
  }

}
