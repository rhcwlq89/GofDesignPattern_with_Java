package system;

public class Facade {

  private HelpSystem01 helpSystem01;
  private HelpSystem02 helpSystem02;
  private HelpSystem03 helpSystem03;

  public Facade() {
    super();
    this.helpSystem01 = new HelpSystem01();
    this.helpSystem02 = new HelpSystem02();
    this.helpSystem03 = new HelpSystem03();
  }

  public void process() {
    this.helpSystem01.process();
    this.helpSystem02.process();
    this.helpSystem03.process();
  }


}
