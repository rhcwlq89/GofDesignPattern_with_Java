package main;

public class Main {

  // Proxy Pattern
  // 대리인 내세우기

  // Proxy : 대리인

  // 학습목표
  // 프록시 패턴을 통해서 작업을 나눠서 구현할 수 있다.

  // 잘 쓰이질 않음.

  public static void main(String[] args) {
    Subject real = new RealSubject();
    Subject proxy1 = new Proxy(real);
    Subject proxy2 = new Proxy(real);
    Subject proxy3 = new Proxy(real);

    proxy1.action1();
    proxy1.action2();
    proxy2.action1();
    proxy2.action2();
    proxy3.action1();
    proxy3.action2();

  }

}
