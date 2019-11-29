package ru.damrin;

public class MathOperations {

  private int conclusion;
  private int a;
  private int b;
  private String arithmeticAction;

  Errors err = new Errors();

  public void setA(int a) {
    if (a >= 1 && a <= 10) {
      this.a = a;
    } else {
      System.out.println(err.getOutOfRange());
      System.exit(0);
    }
  }

  public void setB(int b) {
    if (b >= 1 && b <= 10) {
      this.b = b;
    } else {
      System.out.println(err.getOutOfRange());
      System.exit(0);
    }
  }

  public void setArithmeticAction(String arithmeticAction) {
    this.arithmeticAction = arithmeticAction;
  }

  public int getConclusion() {
    return conclusion;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public String getArithmeticAction() {
    return arithmeticAction;
  }


  public int calculation(int a, int b, String arithmeticAction) {
    if (arithmeticAction.equals("+")) {
      conclusion = a + b;
    } else if (arithmeticAction.equals("-")) {
      conclusion = a - b;
    } else if (arithmeticAction.equals("*")) {
      conclusion = a * b;
    } else if (arithmeticAction.equals("/")) {
      conclusion = a / b;
    } else {
      System.out.println("Введена некорректная операция");
    }
    return conclusion;
  }
}
