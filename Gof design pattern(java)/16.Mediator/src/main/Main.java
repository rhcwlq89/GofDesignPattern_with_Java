package main;

import abst.Colleague;
import abst.Mediator;
import concrete.ChatColleague;
import concrete.ChatMediator;

public class Main {

  // Mediator
  // M:N���踦 1:1�� �����ϱ�

  // �н� ��ǥ
  // �̵����� ������ ���� ������ ���踦 ������ ����� ����

  // Ű����
  // ����, M:N to 1:1

  // ���� : �׷�ü��
  // �׸��� ������ ����� ��� ���.

  public static void main(String[] args) {
    Mediator mediator = new ChatMediator();

    Colleague colleague1 = new ChatColleague();
    Colleague colleague2 = new ChatColleague();
    Colleague colleague3 = new ChatColleague();

    colleague1.join(mediator);
    colleague2.join(mediator);
    colleague3.join(mediator);

    colleague1.sendData("AAA");
    colleague2.sendData("BBB");
    colleague3.sendData("CCC");

  }

}

