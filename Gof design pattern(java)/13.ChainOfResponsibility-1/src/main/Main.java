package main;

import Abst.Calculator;
import concrete.PlusCalculator;
import concrete.Request;
import concrete.SubCalculator;

public class Main {

  // Chain of responsibility

  // 학습목표
  // 다양한 처리방식을 유연하게 연결할 수 있다.

  // 키워드
  // 유연한 처리, 동적

  // 예제
  // 사칙연산을 하는 프로그램

  public static void main(String[] args) {
    Calculator plus = new PlusCalculator();
    Calculator sub = new SubCalculator();

    plus.setNextCalcultor(sub);
    Request request1 = new Request(1, 2, "+");
    Request request2 = new Request(10, 2, "-");

    plus.process(request1);
    plus.process(request2);
  }

}

