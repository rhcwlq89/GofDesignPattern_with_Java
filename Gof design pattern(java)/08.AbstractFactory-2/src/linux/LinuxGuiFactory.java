package linux;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

public class LinuxGuiFactory implements GuiFactory {

  @Override
  public Button createButton() {
    return new LinuxButton();
  }

  @Override
  public TextArea createTextArea() {
    return new LinuxTextArea();
  }


}
