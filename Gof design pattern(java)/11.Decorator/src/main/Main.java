package main;

import java.util.Scanner;
import abst.IBeverage;
import concrete.Base;
import concrete.Espresso;
import concrete.Milk;

public class Main {

  // Decorator
  // 동적으로 책임추가

  // 학습목표
  // 동적으로 책임 추가가 필요할 때
  // 데코레이터 패턴을 사용할 수 있다

  // 키워드
  // 동적, 책임 추가

  // 예제 - 커피 제조 방법
  // 에스프레소 : 커피의 기본
  // 아메리카노 : 에스프레소 + 물

  // 카페라테 : 에스프레소 + 스팀밀크
  // 헤이즐넛 : 아메리카노 + 헤이즐럿 시럽
  // 카페모카 : 카페라떼 + 초콜릿
  // 캬라멜 마끼아또 : 카페라떼 + 캬라멜 시럽

  // 커피의 값을 측정하는 프로그램을 구현

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    IBeverage beverage = new Base();
    boolean done = false;

    while (!done) {
      System.out.println("음료 현재 가격 : " + beverage.getTotalPrice());
      System.out.println("선택 : 1.샷 추가 / 2. 우유 추가");
      switch (sc.nextInt()) {
        case 0:
          done = true;
          break;
        case 1:
          beverage = new Espresso(beverage);
          break;
        case 2:
          beverage = new Milk(beverage);
          break;
      }
    }

    System.out.println("음료 가격 : " + beverage.getTotalPrice());
    sc.close();

  }

}
