package main;

public class RealSubject implements Subject {

  @Override
  public void action1() {
    System.out.println("RealSubject : 간단한 업무");
  }

  @Override
  public void action2() {
    System.out.println("RealSubject : 복잡한 업무");
  }

}
