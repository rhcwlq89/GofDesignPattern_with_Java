
package concrete;

import abst.AbstAdding;
import abst.IBeverage;

public class Milk extends AbstAdding {

  public Milk(IBeverage base) {
    super(base);
  }

  @Override
  public int getTotalPrice() {
    return super.getTotalPrice() + 50;
  }

}
