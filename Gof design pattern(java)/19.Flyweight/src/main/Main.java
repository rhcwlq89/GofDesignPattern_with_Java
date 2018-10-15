package main;

public class Main {

  // Flyweight
  // 메모리 절약하기

  // 플라이웨이트 : 48kg <= 플라이급 < 51kg

  // 학습목표
  // 플라이웨이트 패턴을 통해 메모리 공간을 절약한다.

  // 키워드
  // 메모리

  // 클라이언트가 이미지(리소스 사용이 큼)를 사용
  // new image();
  // 동일 이미지를 사용하게 될 경우 new image()를 사용
  // 그럴 경우 오버플로우 발생가능성이 높아짐
  // 따라서 이미지 매니저(이미지 풀 : 자료구조)를 사용
  // 이미지 매니저는 A라는 이미지를 들고 있다가 요청시 반환

  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();

    Flyweight flyweight = factory.getFlyweight("A");
    System.out.println(flyweight);

    flyweight = factory.getFlyweight("A");
    System.out.println(flyweight);

    flyweight = factory.getFlyweight("B");
    System.out.println(flyweight);

    flyweight = factory.getFlyweight("B");
    System.out.println(flyweight);
  }

}
