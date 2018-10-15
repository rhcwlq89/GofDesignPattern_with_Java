package main;

import main.Observable.Observer;

public class Main {

  public static void main(String[] args) {
    // 1. ���׸�
    // 2. ��������Ʈ
    // 3. ���ο� Observer�� �ִ´�.

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
