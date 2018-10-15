package main;

import main.Button.OnClickListener;

public class Main {

  // Observer Pattern
  // ���� ��ȭ �����ϱ�

  // �н���ǥ
  // ������ ������ ���� �̺�Ʈ �߻� �� ��ü �ܺο��� ó���� �� �ִ�.

  // Ű����
  // ��ü �ܺ�, �̺�Ʈ ó��

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
