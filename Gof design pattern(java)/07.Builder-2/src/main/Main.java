package main;
import computer.Computer;
import computer.ComputerBuilder;

public class Main {

  // Builder Pattern(가독성 & 많은 멤버 변수)
  // 많은 멤버변수를 가진 객체생성

  // 학습목표
  // 많은 변수를 가진 객체의 생성을 가독성이 높도록 생성할 수 있다.

  // Builder Pattern
  // 많은 인자를 가진 객체생성을 다른 객체의 도움으로 생성하는 패턴

  public static void main(String[] args) {
    Computer computer =
        ComputerBuilder.start().setCpu("i7").setRam("8g").setStorage("256G SSD").build();
    System.out.println(computer.toString());
  }
}
