package memento;

public class Memento {

  String state;

  protected Memento(String state) {
    super();
    this.state = state;
  }

  protected String getState() {
    return state;
  }

  protected void setState(String state) {
    this.state = state;
  }

}
