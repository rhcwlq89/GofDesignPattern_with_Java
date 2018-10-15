package exdelegate;

import exinterface.Ainterface;
import exinterface.Ainterfaceimpl;

public class AObj {

  // ~ 기능이 필요합니다. 개발해주세요.
  Ainterface ainterface;

  public AObj() {
    ainterface = new Ainterfaceimpl();
  }

  public void funcAA() {
    // 위임을 하지 않았을 경우.
    // System.out.println("AAA");
    // System.out.println("AAA");

    // 다른 객체의 기능을 호출하는 것.(위임하다) : delegate
    ainterface.funcA();
    ainterface.funcA();


  }
}
