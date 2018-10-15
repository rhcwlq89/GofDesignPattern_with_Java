package windows;

import abst.Button;

public class WindowsButton implements Button {

  @Override
  public void click() {
    System.out.println("윈도우 버튼 클릭");
  }

}
