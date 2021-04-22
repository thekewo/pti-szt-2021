package hu.depti;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator calculator;

  @BeforeEach
  public void setUp() {
    calculator = new Calculator();
  }

  @Test
  @DisplayName("Simple add operation should work")
  public void testAdd() {
    assertEquals(20, calculator.add(15, 5), "Regular add should work");
  }

  @Test
  @DisplayName("Simple substract operation should work")
  public void testSubstract() {
    assertEquals(5, calculator.substract(27, 22), "Regular substract should work");
  }

  @Test
  @DisplayName("Simple multiplication should work")
  public void testMultiply() {
    assertEquals(20, calculator.multiply(4, 5), "Regular multiplication should work");
  }

  @RepeatedTest(5)
  @DisplayName("Ensure correct handling of zero")
  public void testMultiplyWithZero() {
    assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
    assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
  }

  @Test
  @DisplayName("Simple multiplication should work")
  public void testDivide() {
    assertEquals(4, calculator.divide(20, 5), "Regular divide should work");
  }

  @Test
  @DisplayName("Ensure correct handling of zero")
  public void testDivideWithZero() {
    assertEquals(0, calculator.divide(0, 5), "Devide with zero should be throw an Exception");
    assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
  }
}
