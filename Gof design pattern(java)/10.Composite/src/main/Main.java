package main;

import file.Component;
import file.File;
import file.Folder;

public class Main {

  // Composite Pattern
  // 컨테이너와 내용을 같게 다루기

  // 학습목표
  // 컴패짓 패턴을 통해서 트리구조를 구현할 수 잇다.

  // 키워드
  // 컨테이너/내용물 동일시

  // 예제 코드
  // 파일시스템
  // root
  // usr home

  public static void main(String[] args) {
    Folder root = new Folder("root");
    Folder home = new Folder("home");
    Folder garam = new Folder("garam");
    Folder music = new Folder("music");
    Folder picture = new Folder("picture");
    Folder doc = new Folder("doc");
    Folder usr = new Folder("usr");

    File track1 = new File("track1");
    File track2 = new File("track2");
    File pic1 = new File("pic1");
    File doc1 = new File("doc1");
    File java = new File("java");

    root.addComponent(home);
    home.addComponent(garam);
    garam.addComponent(music);
    music.addComponent(track1);
    music.addComponent(track2);
    garam.addComponent(picture);
    picture.addComponent(pic1);
    garam.addComponent(doc);
    doc.addComponent(doc1);

    root.addComponent(usr);
    usr.addComponent(java);

    show(root);
  }

  private static void show(Component component) {
    System.out.println(component.getClass().getSimpleName() + "|" + component.getName());
    if (component instanceof Folder) {
      Folder folder = (Folder) component;
      for (Component c : folder.getChildren()) {
        show(c);
      }
    }
  }
}
