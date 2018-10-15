package main;

import Sam.SamFactory;
import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import gt.GtFactory;

public class Main {

  // Abstract Facotry Pattern
  // 객체 생성의 가상화

  // 학습목표
  // 관련있는 객체의 생성을 가상화할 수 있다.

  // 키워드
  // 생성부분의 가상화/ 관련있는 개체

  // 실습예제

  public static void main(String[] args) {
    BikeFactory samFactory = new SamFactory();
    Body samBody = samFactory.createBody();
    Wheel samWheel = samFactory.createWheel();

    System.out.println(samBody.getClass());
    System.out.println(samWheel.getClass());

    BikeFactory gtFactory = new GtFactory();
    Body gtBody = gtFactory.createBody();
    Wheel gtWheel = gtFactory.createWheel();

    System.out.println(gtBody.getClass());
    System.out.println(gtWheel.getClass());
  }

}
