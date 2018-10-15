package main;

import example.Ax;
import example.GameCharacter;
import example.Knife;
import example.Sword;
import exdelegate.AObj;
import exinterface.Ainterface;
import exinterface.Ainterfaceimpl;

public class Main {

  // 학습목표
  // 인터페이스 개념을 이해
  // 델리게이트 개념을 이해
  // 전략 패턴 개념을 이해

  // Interface : 키보드나 디스플레이 따위처럼 사람과 컴퓨터를 연결하는 장치
  // 기능에 대한 선언과 구현을 분리
  // 기능을 사용하는 통로

  // Delegate : 위임
  // 객체가 기능을 수행할 때 해당 객체 이외의 객체의 기능을 호출하는 것.

  // Strategy
  // 여러 알고리즘을 하나의 추상적인 접근점(Interface)을 만들어
  // 접근점에서 서로 교환가능하도록 하는 패턴

  // 요구사항
  // 신작 게임에서 캐릭터(GameCharacter)와 무기를 구현해보세요.
  // 무기(Weapon)는 두 가지 종류가 있습니다. { 검(Sword), 칼(Knife) }

  // 유지보수요청
  // 무기 중에 도끼를 추가해주세요
  // 무기 추가가 용이하다.(전략패턴의 장점)

  public static void main(String[] args) {
    // 기능과 구현을 분리, 통로로 사용
    Ainterface ainterface = new Ainterfaceimpl();
    ainterface.funcA();

    // 위임
    AObj aObj = new AObj();
    aObj.funcAA();

    // 전략패턴 예제 : 무기교체
    GameCharacter character = new GameCharacter();
    character.attack();

    character.setWeapon(new Sword());
    character.attack();
    character.setWeapon(new Knife());
    character.attack();

    // 요구사항 : 무기 중에 도끼를 추가해달라.
    character.setWeapon(new Ax());
    character.attack();
  }
}
