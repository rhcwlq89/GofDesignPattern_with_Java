package main;

public class Main {

  // DeepShallow
  // Deep Copy & Shallow Copy

  public static void main(String[] args) throws CloneNotSupportedException {
    Cat navi = new Cat();
    navi.setName("navi");
    navi.setAge(new Age(2014, 3));

    // 주소값을 넘겨줌.(Shallow Copy)
    // Cat yo = navi;
    // yo.setName("yo");
    //
    // System.out.println(navi.getName());
    // System.out.println(yo.getName());

    // Deep copy
    Cat yo = navi.copy();
    yo.setName("yo");
    // yo.setAge(new Age(2016, 1));
    // Age는 Shallow Copy가 일어남.
    yo.getAge().setValue(2);
    yo.getAge().setYear(2016);

    System.out.println(navi.getName());
    System.out.println(yo.getName());

    // 추가예제
    System.out.println(navi.getAge().getYear());
    System.out.println(yo.getAge().getYear());

    System.out.println(navi.getAge().getValue());
    System.out.println(yo.getAge().getValue());
  }

}
