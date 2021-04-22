package hu.depti;

public class Calculator {


  public int add(int a, int b){
    return a + b;
  }

  public int substract(int a, int b) {
    return b - a;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) throws IllegalArgumentException {
    if (b == 0) {
      throw new IllegalArgumentException("Nullával való osztás nem értelmezett");
    }
    return a / b;
  }
}
