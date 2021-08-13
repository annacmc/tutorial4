import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalcTest {

  @Test
  void add() {
    int result = Calc.add(6, 2);
    assertEquals(result, 8);
  }

  @Test
  void subtract() {
    int result = Calc.subtract(5, 2);
    assertEquals(result, 3);
  }
}