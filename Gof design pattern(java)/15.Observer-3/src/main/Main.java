package main;

import main.Observable.Observer;

public class Main {

  public static void main(String[] args) {
    // 1. 제네릭
    // 2. 델리게이트
    // 3. 내부에 Observer를 넣는다.

    Button button = new Button();
    button.addObserver(new Observer<String>() {

      @Override
      public void update(Observable<String> o, String arg) {
        System.out.println(o + " is Clicked");
      }

    });

    button.onClick();
    button.onClick();
    button.onClick();
  }

}
