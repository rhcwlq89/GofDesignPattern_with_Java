package main;

public class MorseCode {

  // bridge를 사용하지 않을 경우
  // 내부기능 변경시 MorseCode2로 정의 해야한다.

  // public void dot() {
  // System.out.print(".");
  //
  // }
  //
  // public void dash() {
  // System.out.print("-");
  // }
  //
  // public void space() {
  // System.out.print(" ");
  // }

  // bridge를 사용하는 경우
  private MorseCodeFunction morseCodeFunction;


  public MorseCode() {
    super();
  }

  public MorseCode(MorseCodeFunction morseCodeFunction) {
    super();
    this.morseCodeFunction = morseCodeFunction;
  }

  public MorseCodeFunction getMorseCodeFunction() {
    return morseCodeFunction;
  }

  public void setMorseCodeFunction(MorseCodeFunction morseCodeFunction) {
    this.morseCodeFunction = morseCodeFunction;
  }

  public void dot() {
    morseCodeFunction.dot();
  }

  public void dash() {
    morseCodeFunction.dash();
  }

  public void space() {
    morseCodeFunction.space();
  }


}
