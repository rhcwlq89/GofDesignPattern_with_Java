package main;

import adapter.Adapter;
import adapter.AdapterImpl;

public class Main {

  // 학습목표
  // 알고리즘을 요구사항에 맞춰 사용할 수 있다.

  // Adapter : 기계, 기구등을 다목적으로 사용하기 위한 부가기구

  // Adapter
  // 연관성 없는 두 객체 묶어 사용하기

  // 요구사항
  // 두수에 대한 다음 연산을 수행하는 개체를 만들어 주세요
  // 1. 수의 두 배의 수를 반환 : twiceOf(Float) : Float
  // 2. 수의 반(1/2)의 수를 반환 : halfOf(Float) : Float
  // 구현 객체 이름은 'Adapter'으로 해주세요.
  // Math클래스에서 두 배와 절반을 구하는 함수는 이미 구현되어 있습니다.

  // 더공부해봅시다.
  // 알고리즘 변경을 원합니다.
  // Math클래스에 새롭게 두배를 구할 수 있는 함수가 추가되었습니다.
  // 1. 새로 구현된 알고리즘을 이용하도록 프로그램을 수정해주세요.
  // 2. 절반을 구하는 기능에서 로그를 찍는 기능을 추가해주시기 바랍니다.

  public static void main(String[] args) {
    Adapter adapter = new AdapterImpl();
    System.out.println(adapter.twiceOf(100f));
    System.out.println(adapter.halfOf(88f));

    // 다른 사람의 알고리즘을 적용할때 데이터형식이 다를때 사용가능하다.
    // 버블소트 알고리즘 구현한 것을 누군가 주었는데, 배열로 처리했을 경우
    // 소팅해야할 것들이 List로 되어 있다면
    // List -> Array로 변경하고 소팅한 후 Array -> List로 다시 변경하여 사용하면 된다.
  }
}
