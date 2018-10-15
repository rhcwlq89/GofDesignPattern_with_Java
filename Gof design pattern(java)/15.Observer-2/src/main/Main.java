package main;

import java.util.Observable;
import java.util.Observer;

public class Main {

  public static void main(String[] args) {
    // Observable observable;
    // Observer observer;
    Button button = new Button();
    button.addObserver(new Observer() {

      @Override
      public void update(Observable o, Object arg) {
        System.out.println(o + " is Clicked");
      }

    });

    // Observable 에는 changed 플래그가 존재.
    // changed flag가 변화해야 이벤트 처리!!!!
    button.onClick();
    button.onClick();
    button.onClick();

    // Button은 보통 UI를 가지는데, java에서는 중복 상속이 되지 않아
    // 실제 사용이 어려운 부분이 있다.
  }



}
