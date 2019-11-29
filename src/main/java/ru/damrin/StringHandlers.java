package ru.damrin;

public class StringHandlers {

  private String arithmeticAction;
  private int argumentA;
  private int argumentB;
  private boolean isLeftRoman;
  private boolean isRightRoman;

  CheckIfRoman preCheck = new CheckIfRoman();
  Errors err = new Errors();


  public boolean isLeftRoman() {
    return isLeftRoman;
  }

  public boolean isRightRoman() {
    return isRightRoman;
  }

  public String getArithmeticAction() {
    return arithmeticAction;
  }

  public int getArgumentA() {
    return argumentA;
  }

  public int getArgumentB() {
    return argumentB;
  }




  public void handler(String line) {
    this.isLeftRoman = false;
    this.isRightRoman = false;

    String[] splitString = line.split(" ");


    try {
      this.argumentA = Integer.parseInt(splitString[0]);
    } catch (NumberFormatException ex) {
      if(preCheck.checkIf(splitString[0])==true){
        if (preCheck.getToArabic()>=1 && preCheck.getToArabic()<=10){
          this.argumentA = preCheck.getToArabic();
          isLeftRoman = true;
        } else {
          System.out.println(err.getOutOfRange());
          System.exit(0);
        }
      } else {
        System.out.println(err.getIncorrectFormat());
        System.exit(0);
      }
    }

    try {
      this.argumentB = Integer.parseInt(splitString[2]);
    } catch (NumberFormatException ex) {
      if(preCheck.checkIf(splitString[2])==true){
        if (preCheck.getToArabic()>=1 && preCheck.getToArabic()<=10){
          this.argumentB = preCheck.getToArabic();
          isRightRoman = true;
        } else {
          System.out.println(err.getOutOfRange());
          System.exit(0);
        }
      } else {
        System.out.println(err.getIncorrectFormat());
        System.exit(0);
      }
    }

    this.arithmeticAction = splitString[1];
  }
}
