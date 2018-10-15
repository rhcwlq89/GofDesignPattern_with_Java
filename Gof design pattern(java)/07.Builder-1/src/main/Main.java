package main;
import computer.Computer;
import computer.ComputerFactory;
import computer.LgGramBluePrint;

public class Main {

  // Build Pattern
  // 복잡한 단계가 있는 인스턴스 생성과정을 단순화

  // 학습목표
  // 복잡한 단계가 필요한 인스턴스 생성을 빌더 패턴을 통해서 구현할 수 잇다.

  // Builder : 건축업자, 건설자, 시공자

  // Builder
  // 복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브클래스에게 넘겨주는 패턴

  // 예제
  // 복잡한 단계를 거쳐야 생성되는 객체(컴퓨터)
  // 컴퓨터 구성요소 (CPU, RAM, STORAGE)
  // BluePrint를 통해서 Computer 객체를 생성한다.

  public static void main(String[] args) {

    ComputerFactory factory = new ComputerFactory();
    factory.setBluePrint(new LgGramBluePrint());

    // factory.setBlueprint(new MacBlueprint());
    // factory.setBlueprint(new SonyBlueprint());
    // factory.makeAndGet();
    factory.make();
    Computer computer = factory.getComputer();

    // Computer computer = new Computer("i7", "16G", "256GB");
    System.out.println(computer.toString());
  }

}
