package windows;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;

public class WindowsGuiFactory implements GuiFactory {

  @Override
  public Button createButton() {
    return new WindowsButton();
  }

  @Override
  public TextArea createTextArea() {
    return new WindowsTextArea();
  }

}
