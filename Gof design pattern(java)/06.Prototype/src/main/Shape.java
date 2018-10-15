package main;

public class Shape implements Cloneable {

  // 복사할 수 있게 Cloneable를 구현.

  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

}
