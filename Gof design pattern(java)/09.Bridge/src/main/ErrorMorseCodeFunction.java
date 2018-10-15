package main;

public class ErrorMorseCodeFunction implements MorseCodeFunction {

  @Override
  public void dot() {
    System.err.print(".");
  }

  @Override
  public void dash() {
    System.err.print("-");
  }

  @Override
  public void space() {
    System.err.print(" ");
  }


}
