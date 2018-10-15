package abst;

public abstract class AbstAdding implements IBeverage {

  private IBeverage base;


  public AbstAdding(IBeverage base) {
    super();
    this.base = base;
  }


  @Override
  public int getTotalPrice() {
    return base.getTotalPrice();
  }


  public IBeverage getBase() {
    return base;
  }


  public void setBase(IBeverage base) {
    this.base = base;
  }



}
