package ru.damrin;

import java.util.Scanner;


public class App {

  public static void main(String[] args) {

    StringHandlers stringBox = new StringHandlers();
    MathOperations calc = new MathOperations();
    RomanMetric roman = new RomanMetric();
    Errors err = new Errors();

    Scanner scan = new Scanner(System.in);
    stringBox.handler(scan.nextLine());

    calc.setA(stringBox.getArgumentA());
    calc.setB(stringBox.getArgumentB());
    calc.setArithmeticAction(stringBox.getArithmeticAction());
    calc.calculation(calc.getA(), calc.getB(), calc.getArithmeticAction());

    if (stringBox.isRightRoman() && stringBox.isLeftRoman()) {
      System.out.println(roman.toRoman(calc.getConclusion()));
    } else if (!stringBox.isLeftRoman() && !stringBox.isRightRoman()) {
      System.out.println(calc.getConclusion());
    } else {
      System.out.println(err.getIncorrectFormat());
    }
  }
}
