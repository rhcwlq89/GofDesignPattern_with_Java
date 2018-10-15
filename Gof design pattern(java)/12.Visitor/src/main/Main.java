package main;

import java.util.ArrayList;

public class Main {

  // Visito Pattern
  // 객체에서 처리 분리하기

  // 학습목표
  // 방문자 패턴을 이용하여 객체에서 처리를 분리해서 사용할 수 있다.

  // 키워트
  // 객체, 처리, 분리

  // 예제

  public static void main(String[] args) {

    ArrayList<Visitable> visitableList = new ArrayList<Visitable>();
    visitableList.add(new VisitableA(1));
    visitableList.add(new VisitableA(2));
    visitableList.add(new VisitableA(3));
    visitableList.add(new VisitableA(4));
    visitableList.add(new VisitableA(5));

    Visitor visitor = new VisitorA();

    for (Visitable visitable : visitableList) {
      visitable.accept(visitor);
    }
    
    System.out.println(((VisitorA) visitor).getAgeSum());
  }

}
