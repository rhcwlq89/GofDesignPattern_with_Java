package abst;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
  protected List<Colleague> colleagues;



  public Mediator() {
    super();
    colleagues = new ArrayList<>();
  }

  public boolean addColleague(Colleague colleague) {
    if (colleagues != null)
      return colleagues.add(colleague);
    else
      return false;
  }

  public abstract void mediate(String data);

}
