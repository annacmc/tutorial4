import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalcTest {

  @Test
  void add() {
    int result = Calc.add(6, 1);
    assertEquals(result, 7);
  }

  @Test
  void subtract() {
    int result = Calc.subtract(5, 1);
    assertEquals(result, 4);
  }
}