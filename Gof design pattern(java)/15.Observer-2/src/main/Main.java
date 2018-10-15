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

    // Observable ���� changed �÷��װ� ����.
    // changed flag�� ��ȭ�ؾ� �̺�Ʈ ó��!!!!
    button.onClick();
    button.onClick();
    button.onClick();

    // Button�� ���� UI�� �����µ�, java������ �ߺ� ����� ���� �ʾ�
    // ���� ����� ����� �κ��� �ִ�.
  }



}
