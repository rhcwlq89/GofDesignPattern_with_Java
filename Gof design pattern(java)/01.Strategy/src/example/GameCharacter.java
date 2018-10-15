package example;

public class GameCharacter {

  // 접근점(Interface)
  private Weapon weapon;

  // 교환가능
  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void attack() {

    if (weapon == null) {
      System.out.println("맨손 공격");
    } else {
      // Delegate : 공격이라는 기능을 무기에게 위임함.
      weapon.attack();
    }

  }

}
