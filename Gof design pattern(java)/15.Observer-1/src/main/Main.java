package main;

import main.Button.OnClickListener;

public class Main {

  // Observer Pattern
  // 상태 변화 관찰하기

  // 학습목표
  // 옵저버 패턴을 통해 이벤트 발생 후 객체 외부에서 처리할 수 있다.

  // 키워드
  // 객체 외부, 이벤트 처리

  public static void main(String[] args) {
    Button button = new Button();

    // case 1
    // button.setOnClickListener(new ButtonClick());

    // case 2
    button.setOnClickListener(new OnClickListener() {

      @Override
      public void onClick(Button button) {
        System.out.println(button + " is Clicked ");
      }
    });

    button.onClick();
  }

}


class ButtonClick implements OnClickListener {

  @Override
  public void onClick(Button button) {
    System.out.println(button + " is Clicked");
  }

}
