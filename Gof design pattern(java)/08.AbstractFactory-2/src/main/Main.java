package main;

import abst.Button;
import abst.GuiFactory;
import abst.TextArea;
import concrete.FactoryInstance;

public class Main {

  public static void main(String[] args) {

    GuiFactory guiFactory = FactoryInstance.getGuiFactory();

    Button button = guiFactory.createButton();
    TextArea textArea = guiFactory.createTextArea();

    button.click();
    System.out.println(textArea.getText());
    System.out.println(System.getProperty("os.name"));


    // GuiFactory linuxFacotry = new LinuxGuiFactory();
    // Button linuxButton = linuxFacotry.createButton();
    // TextArea linuxTextArea = linuxFacotry.createTextArea();
    //
    // linuxButton.click();
    // System.out.println(linuxTextArea.getText());
    //
    // GuiFactory windowsFacotry = new WindowsGuiFactory();
    // Button windowsButton = windowsFacotry.createButton();
    // TextArea windowsTextArea = windowsFacotry.createTextArea();
    //
    // windowsButton.click();
    // System.out.println(windowsTextArea.getText());
    //
    // GuiFactory macFacotry = new MacGuiFactory();
    // Button macButton = macFacotry.createButton();
    // TextArea macTextArea = macFacotry.createTextArea();
    //
    // macButton.click();
    // System.out.println(macTextArea.getText());
  }

}
