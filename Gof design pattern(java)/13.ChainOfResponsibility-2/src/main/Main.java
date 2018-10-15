package main;

public class Main {

  // 확장된 Chain Of Responsibility

  public static void main(String[] args) {
    Attack attack = new Attack(100);
    Armor armor1 = new Armor(10);
    Armor armor2 = new Armor(40);


    armor1.setNextDefence(armor2);
    armor1.defence(attack);

    System.out.println(attack.getAmount());

    // Point 2 : 동적으로 추가가 가능하다.
    Defence defence = new Defence() {

      @Override
      public void defence(Attack attack) {
        int amount = attack.getAmount();
        amount -= 50;
        attack.setAmount(amount);
      }
    };

    attack.setAmount(100);
    armor2.setNextDefence(defence);
    armor1.defence(attack);
    System.out.println(attack.getAmount());
  }

}
