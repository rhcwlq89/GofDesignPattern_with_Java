package main;

import java.util.Stack;
import memento.Memento;
import memento.Originator;

public class Main {

  // Memento Pattern
  // ���������ϱ�

  // Memento : ���ǰ, ��ǰ , �߾�Ÿ�

  // �н���ǥ
  // �޸��� ������ ���ؼ� ��ü�� ���¸� �����ϰ� �������·� �����Ѵ�.
  // ���� ������ protected�� ����� �����Ѵ�.

  // Ű����
  // ����

  // package -> protected �� ����� ����

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

    // protected ���
    // �����Ұ�
    // Memento memento = new Memento("aaa");
    // ����Լ� ���Ұ�.
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
