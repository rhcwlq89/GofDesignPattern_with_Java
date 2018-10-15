package main;

public class Main {

  // State Pattern
  // 상태를 객체로 나타내기

  // 학습 목표
  // 상태패턴을 통해 상태를 객체로 나타내고 행동 구현한다.

  // 키워드
  // 객체, 상태, 행동

  // 전략패턴 vs 상태패턴
  // 전략패턴은 알고리즘 변경
  // 상태패턴은 이벤트로 발생한 상태를 변경(이벤트가 상태를 변경시킬 수 있다)

  public static void main(String[] args) {

    Light light = new Light();

    light.off();
    light.off();
    light.off();

    light.on();
    light.on();
    light.on();

    light.off();
    light.on();
    light.off();
    light.on();
    light.off();
    light.on();
  }

}
