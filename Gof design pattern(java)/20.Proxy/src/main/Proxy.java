package main;

public class Proxy implements Subject {

  private Subject real;

  public Proxy(Subject realSubject) {
    this.real = realSubject;
  }

  @Override
  public void action1() {
    System.out.println("Proxy : ������ ����");
  }

  @Override
  public void action2() {
    System.out.println("Proxy�� ������ �Ѱ���");
    this.real.action2();
  }

}
