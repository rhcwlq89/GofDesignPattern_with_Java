package main;

import java.util.Stack;
import memento.Memento;
import memento.Originator;

public class Main {

  // Memento Pattern
  // 상태저장하기

  // Memento : 기념품, 유품 , 추억거리

  // 학습목표
  // 메멘토 패턴을 통해서 객체의 상태를 저장하고 이전상태로 복구한다.
  // 접근 제한자 protected의 사용을 이해한다.

  // 키워드
  // 복구

  // package -> protected 를 사용한 이유

  public static void main(String[] args) {
    Stack<Memento> mementos = new Stack<>();
    Originator originator = new Originator();

    originator.setState("State 1");
    mementos.push(originator.createMemento());
    originator.setState("State 2");
    mementos.push(originator.createMemento());
    originator.setState("State 3");
    mementos.push(originator.createMemento());
    originator.setState("State Final");
    mementos.push(originator.createMemento());

    // protected 사용
    // 생성불가
    // Memento memento = new Memento("aaa");
    // 멤버함수 사용불가.
    // mementos.pop().getState();

    originator.restoreMemento(mementos.pop());
    System.out.println(originator.getState()); // State Final
    originator.restoreMemento(mementos.pop());
    System.out.println(originator.getState()); // State 3
    originator.restoreMemento(mementos.pop());
    System.out.println(originator.getState()); // State 2
    originator.restoreMemento(mementos.pop());
    System.out.println(originator.getState()); // State 1
  }
}
