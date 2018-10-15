package main;

import java.util.PriorityQueue;

public class Main {

  // Command Pattern
  // ����� ��üȭ

  // �н���ǥ
  // Ŀ�ǵ� ������ ���� ����� ��üȭ �� �� �ִ�.

  // iterator ���ϰ� interprinter ������ �������� ����.

  public static void main(String[] args) {
    // Ŀ�ǵ带 �����ؼ� ������� ����
    // List<Command> list = new LinkedList<>();
    // list.add(new Command() {
    //
    // @Override
    // public void execute() {
    // System.out.println("�۾� 1");
    // }
    //
    // });
    //
    // list.add(new Command() {
    //
    // @Override
    // public void execute() {
    // System.out.println("�۾� 2");
    // }
    //
    // });
    //
    // list.add(new Command() {
    //
    // @Override
    // public void execute() {
    // System.out.println("�۾� 3");
    // }
    //
    // });

    // String ���̷� �켱������ ���ϰ�, ����� ����.
    PriorityQueue<Command> queue = new PriorityQueue<>();
    queue.add(new StringPrintCommand("AAA"));
    queue.add(new StringPrintCommand("A"));
    queue.add(new StringPrintCommand("AA"));


    for (Command command : queue) {
      command.execute();
    }
  }
}
