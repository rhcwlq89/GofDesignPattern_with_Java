package main;

import main.Observable.Observer;

public class Button {

  private Observable<String> observable;

  public Button() {
    super();
    observable = new Observable<>();
  }

  public Observable<String> getObservable() {
    return observable;
  }

  public void setObservable(Observable<String> observable) {
    this.observable = observable;
  }

  public void addObserver(Observer<String> o) {
    observable.addObserver(o);
  }

  public void notifyObservers() {
    observable.notifyObservers(null);
  }

  public void onClick() {
    observable.setChanged();
    notifyObservers();
  }

}
