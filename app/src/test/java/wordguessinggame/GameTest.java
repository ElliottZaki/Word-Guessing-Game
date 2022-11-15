package wordguessinggame;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GameTest {
  @Test public void testsGetsWordMethod01() {
    Game game = new Game("MAKERS");
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void testsGetsWordMethod02() {
    Game game = new Game("JAVA");
    assertEquals(game.getWordToGuess(), "J___");
  }
}