package main;

public class Main {

  // State Pattern
  // ���¸� ��ü�� ��Ÿ����

  // �н� ��ǥ
  // ���������� ���� ���¸� ��ü�� ��Ÿ���� �ൿ �����Ѵ�.

  // Ű����
  // ��ü, ����, �ൿ

  // �������� vs ��������
  // ���������� �˰��� ����
  // ���������� �̺�Ʈ�� �߻��� ���¸� ����(�̺�Ʈ�� ���¸� �����ų �� �ִ�)

  public static void main(String[] args) {

    Light light = new Light();

    light.off();
    light.off();
    light.off();

    light.on();
    light.on();
    light.on();

    light.off();
    light.on();
    light.off();
    light.on();
    light.off();
    light.on();
  }

}
