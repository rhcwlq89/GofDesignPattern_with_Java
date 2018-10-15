package main;

import java.util.PriorityQueue;

public class Main {

  // Command Pattern
  // 명령의 객체화

  // 학습목표
  // 커맨드 패턴을 통해 명령을 객체화 할 수 있다.

  // iterator 패턴과 interprinter 패턴은 강의하지 않음.

  public static void main(String[] args) {
    // 커맨드를 정의해서 순서대로 수행
    // List<Command> list = new LinkedList<>();
    // list.add(new Command() {
    //
    // @Override
    // public void execute() {
    // System.out.println("작업 1");
    // }
    //
    // });
    //
    // list.add(new Command() {
    //
    // @Override
    // public void execute() {
    // System.out.println("작업 2");
    // }
    //
    // });
    //
    // list.add(new Command() {
    //
    // @Override
    // public void execute() {
    // System.out.println("작업 3");
    // }
    //
    // });

    // String 길이로 우선수위를 정하고, 명령을 수행.
    PriorityQueue<Command> queue = new PriorityQueue<>();
    queue.add(new StringPrintCommand("AAA"));
    queue.add(new StringPrintCommand("A"));
    queue.add(new StringPrintCommand("AA"));


    for (Command command : queue) {
      command.execute();
    }
  }
}
