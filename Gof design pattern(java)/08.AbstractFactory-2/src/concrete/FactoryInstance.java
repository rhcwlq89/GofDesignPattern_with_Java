package concrete;

import abst.GuiFactory;
import linux.LinuxGuiFactory;
import mac.MacGuiFactory;
import windows.WindowsGuiFactory;

public class FactoryInstance {

  public static GuiFactory getGuiFactory() {
    GuiFactory guiFactory;

    System.out.println(getOsCode());
    switch (getOsCode()) {
      case 0:
        guiFactory = new MacGuiFactory();
        break;
      case 1:
        guiFactory = new LinuxGuiFactory();
        break;
      case 2:
        guiFactory = new WindowsGuiFactory();
        break;
      default:
        guiFactory = null;
        break;
    }

    return guiFactory;
  }

  private static int getOsCode() {
    if (System.getProperty("os.name").equalsIgnoreCase("Windows 10")) {
      return 2;
    }
    return 1;
  }


}
