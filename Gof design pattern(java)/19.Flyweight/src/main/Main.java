package main;

public class Main {

  // Flyweight
  // �޸� �����ϱ�

  // �ö��̿���Ʈ : 48kg <= �ö��̱� < 51kg

  // �н���ǥ
  // �ö��̿���Ʈ ������ ���� �޸� ������ �����Ѵ�.

  // Ű����
  // �޸�

  // Ŭ���̾�Ʈ�� �̹���(���ҽ� ����� ŭ)�� ���
  // new image();
  // ���� �̹����� ����ϰ� �� ��� new image()�� ���
  // �׷� ��� �����÷ο� �߻����ɼ��� ������
  // ���� �̹��� �Ŵ���(�̹��� Ǯ : �ڷᱸ��)�� ���
  // �̹��� �Ŵ����� A��� �̹����� ��� �ִٰ� ��û�� ��ȯ

  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();

    Flyweight flyweight = factory.getFlyweight("A");
    System.out.println(flyweight);

    flyweight = factory.getFlyweight("A");
    System.out.println(flyweight);

    flyweight = factory.getFlyweight("B");
    System.out.println(flyweight);

    flyweight = factory.getFlyweight("B");
    System.out.println(flyweight);
  }

}
