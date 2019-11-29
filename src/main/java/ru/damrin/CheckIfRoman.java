package ru.damrin;

public class CheckIfRoman {
  private int toArabic;

  public int getToArabic() {
    return toArabic;
  }

  public boolean checkIf(String incomeNum){
    int convertedValue;
    RomanMetric converter = new RomanMetric();
    String[] romanLetters = {"X", "V", "I", "C", "L", "D", "M"};
    String[] romanCheck = incomeNum.split("");

    boolean[] arrayCheck = new boolean[romanCheck.length];
    boolean checker;
    boolean testIfTrue = false;

    for (int i = 0; i < romanCheck.length; i++) {
      checker = false;
      for (int j = 0; j < romanLetters.length; j++) {
        if (romanCheck[i].equals(romanLetters[j])) {
          checker = true;
          arrayCheck[i] = checker;
        }
      }
    }

    for (int i = 0; i <arrayCheck.length; i++){
      if (arrayCheck[i]==false) {
        System.out.printf("Введено некорректное значение");
        System.exit(0);}
    }
    testIfTrue = true;
    this.toArabic = converter.toArabic(incomeNum);
    return testIfTrue;
  }

}
