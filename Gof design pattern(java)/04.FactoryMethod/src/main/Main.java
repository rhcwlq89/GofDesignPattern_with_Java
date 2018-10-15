package main;

import concrete.HpPotionCreator;
import concrete.MpPotionCreator;
import framework.Item;
import framework.ItemCreator;

public class Main {

  // Factory Method
  // 생성의 템플릿 메소드 패턴

  // 학습목표
  // 1. 팩토리 메소드 패턴에서 템플릿 메소드 패턴이 사용됨을 안다.
  // 2. 팩토리 메소드 패턴에서의 구조와 구현의 분리를 이해하고 구조와 구현의 분리의 장점을 안다.

  // 요구사항
  // 아이템을 생성하는 주체를 'ItemCreator'로 합니다.
  // 게임 아이템과 아이템 생성을 구현해주세요.
  // 1. 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청합니다.
  // 2. 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터 베이스에 아이템 생성정보를 남깁니다.
  // 아이템은 item이라는 interface로 다룰 수 있도록 합니다.
  // 1. item은 use함수를 기본함수로 갖고 있습니다.
  // 2. 현재 아이템의 종류는 체력회복물약, 마력회복물약이 있습니다.

  public static void main(String[] args) {
    ItemCreator creator;
    Item item;

    creator = new HpPotionCreator();
    item = creator.create();
    item.use();

    creator = new MpPotionCreator();
    item = creator.create();
    item.use();
  }

}
