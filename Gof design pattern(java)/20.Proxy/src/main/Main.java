package main;

public class Main {

  // Proxy Pattern
  // �븮�� �������

  // Proxy : �븮��

  // �н���ǥ
  // ���Ͻ� ������ ���ؼ� �۾��� ������ ������ �� �ִ�.

  // �� ������ ����.

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
