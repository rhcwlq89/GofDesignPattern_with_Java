package main;

public class Proxy implements Subject {

  private Subject real;

  public Proxy(Subject realSubject) {
    this.real = realSubject;
  }

  @Override
  public void action1() {
    System.out.println("Proxy : 간단한 업무");
  }

  @Override
  public void action2() {
    System.out.println("Proxy가 업무를 넘겨줌");
    this.real.action2();
  }

}
