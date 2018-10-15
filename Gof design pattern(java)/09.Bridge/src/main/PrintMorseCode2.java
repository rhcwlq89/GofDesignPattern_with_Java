package main;

public class PrintMorseCode2 extends MorseCode2 {
  // print garam
  public PrintMorseCode2 g() {
    dash();
    dash();
    dot();
    space();
    return this;
  }

  public PrintMorseCode2 a() {
    dot();
    dash();
    space();
    return this;
  }

  public PrintMorseCode2 r() {
    dot();
    dash();
    dot();
    space();
    return this;
  }

  public PrintMorseCode2 m() {
    dash();
    dash();
    space();
    return this;
  }
}
