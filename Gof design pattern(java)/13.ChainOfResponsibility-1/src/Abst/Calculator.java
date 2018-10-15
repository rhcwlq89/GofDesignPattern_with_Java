package Abst;

import concrete.Request;

public abstract class Calculator {

  private Calculator nextCalcultor;

  public Calculator getNextCalcultor() {
    return nextCalcultor;
  }

  public void setNextCalcultor(Calculator nextCalcultor) {
    this.nextCalcultor = nextCalcultor;
  }

  public boolean process(Request request) {

    if (this.nextCalcultor != null)
      if (this.nextCalcultor.process(request))
        return true;

    return operator(request);

    // if (operator(request)) {
    // return true;
    // } else {
    // if (this.nextCalcultor != null)
    // return this.nextCalcultor.process(request);
    //
    // return false;
    // }

  }

  // 동작내용
  abstract protected boolean operator(Request request);

}
