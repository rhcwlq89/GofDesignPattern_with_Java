package main;

public class Main {

  // Singleton Pattern
  // 하나의 인스턴스만 있도록 하기

  // 객체란?
  // 객체 : 속성과 기능을 갖춘 것
  // 클래스 : 속성과 기능을 정의한 것
  // 인스턴스 : 속성과 기능을 가진 것 중 실재하는 것
  // 객체 = 클래스 U 인스턴스

  // 학습목표
  // 싱글톤 패턴을 통해서 하나의 인스턴스만 생성하도록 구현할 수 있다.

  // Singleton : 외동이, 한개의 것, 한장
  // Singleton Pattern
  // 하나만 생성해야할 객체를 위한 패턴

  // 요구사항
  // 개발 중인 시스템에서 스피커에 접근할 수 있는 클래스를 만들어주세요.

  // static : 전역변수. 하나만 존재.
  // 디버깅모드에서 Windows->Show View->Expression 으로 변수값들을 확인가능

  // 더 공부해 봅시다.
  // 인스턴스를 호출할 때 로그를 찍어주는 소스를 추가

  public static void main(String[] args) {
    // 아래의 경우 에러(생성자가 private로 선언됨)
    // SystemSpeaker speaker = new SystemSpeaker();

    // 하나의 인스턴스에만 접근하는지 확인하기 위해서 두개를 생성
    SystemSpeaker speaker1 = SystemSpeaker.getInstance();
    SystemSpeaker speaker2 = SystemSpeaker.getInstance();

    // default
    // output : 5, 5
    System.out.println(speaker1.getVolume());
    System.out.println(speaker2.getVolume());

    // output : 11, 11
    speaker1.setVolume(11);
    System.out.println(speaker1.getVolume());
    System.out.println(speaker2.getVolume());

    // output : 22, 22
    speaker1.setVolume(22);
    System.out.println(speaker1.getVolume());
    System.out.println(speaker2.getVolume());
  }

}
