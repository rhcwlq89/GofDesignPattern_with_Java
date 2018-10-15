package concrete;

import abst.Colleague;
import abst.Mediator;

public class ChatMediator extends Mediator {


  public ChatMediator() {
    super();
  }

  @Override
  public void mediate(String data) {

    for (Colleague colleague : this.colleagues) {
      // 중재가능성
      colleague.handle(data);
    }

  }

}
