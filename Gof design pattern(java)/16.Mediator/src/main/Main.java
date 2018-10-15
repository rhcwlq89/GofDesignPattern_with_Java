package main;

import abst.Colleague;
import abst.Mediator;
import concrete.ChatColleague;
import concrete.ChatMediator;

public class Main {

  // Mediator
  // M:N관계를 1:1로 변경하기

  // 학습 목표
  // 미디에이터 패턴을 통해 복잡한 관계를 간단한 관계로 구현

  // 키워드
  // 관계, M:N to 1:1

  // 예시 : 그룹체팅
  // 네명의 유저가 약속을 잡는 경우.

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

