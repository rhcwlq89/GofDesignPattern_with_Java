package main;

public class Cat implements Cloneable {
  private String name;
  // private Integer age;
  private Age age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Age getAge() {
    return age;
  }

  public void setAge(Age age) {
    this.age = age;
  }

  public Cat copy() throws CloneNotSupportedException {
    Cat ret = (Cat) this.clone();
    // Age의 Shallow Copy를 막음
    ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
    return ret;
  }


}
