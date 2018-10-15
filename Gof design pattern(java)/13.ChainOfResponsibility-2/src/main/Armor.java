package main;

public class Armor implements Defence {

  private Defence nextDefence;
  // 방어력
  private int def;

  public Armor(int def) {
    super();
    this.def = def;
  }

  public Defence getNextDefence() {
    return nextDefence;
  }

  public void setNextDefence(Defence nextDefence) {
    this.nextDefence = nextDefence;
  }

  @Override
  public void defence(Attack attack) {
    // Point !!!
    // 여러 객체가 다 같이 책임을 질 수 있다.
    process(attack);

    if (this.nextDefence != null) {
      this.nextDefence.defence(attack);
    }

  }

  private void process(Attack attack) {
    int amount = attack.getAmount();
    // 방어력
    amount -= def;
    attack.setAmount(amount);
  }
}
