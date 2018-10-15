package abst;

public abstract class Colleague {

  private Mediator mediator;

  public boolean join(Mediator mediator) {
    if (this.mediator != null)
      return false;
    this.mediator = mediator;
    return mediator.addColleague(this);
  }

  public void sendData(String data) {
    if (this.mediator != null)
      this.mediator.mediate(data);
  }

  public abstract void handle(String data);
}
