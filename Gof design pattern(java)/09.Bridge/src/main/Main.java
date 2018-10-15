package main;

public class Main {

  // Bridge Pattern
  // 기능 계층과 구현 계층의 분리

  // 학습목표
  // 브릿지 패턴에 대해서 이해
  // 어댑터 패턴과 브릿지 패턴을 연결하여 이해

  // 키워드
  // 기능과 구현을 분리

  // 예제 코드
  // 모스부호를 만드는 기능

  public static void main(String[] args) {
    // 브릿지 패턴을 사용하지 않았을 경우
    // PrintMorseCode printMorseCode = new PrintMorseCode();
    // printMorseCode.g();
    // printMorseCode.a();
    // printMorseCode.r();
    // printMorseCode.a();
    // printMorseCode.m();

    // Chainning
    // printMorseCode.g().a().r().a().m();

    // bridge 패턴사용
    PrintMorseCode printMorseCode = new PrintMorseCode(new FlashMorseCodeFunction());
    printMorseCode.g().a().r().a().m();
    System.out.println();
    printMorseCode.setMorseCodeFunction(new DefaultMorseCodeFunction());
    printMorseCode.g().a().r().a().m();
    System.out.println();
    printMorseCode.setMorseCodeFunction(new ErrorMorseCodeFunction());
    printMorseCode.g().a().r().a().m();


  }

}
