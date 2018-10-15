package adapter;

public class AdapterImpl implements Adapter {

  // 인스턴스를 만들어서 사용해야 하는 경우가 있음.
  // Math math;

  @Override
  public Float twiceOf(Float f) {
    System.out.println("두배 함수 시작");
    // math.twoTime();

    // return (float) Math.twoTime(f.doubleValue());
    // 강화된 알고리즘 적용
    // 요구사항에 맞게 메소드를 변경
    return Math.doubled(f.doubleValue()).floatValue();
  }

  @Override
  public Float halfOf(Float f) {
    System.out.println("절반 함수 시작");
    return (float) Math.half(f.doubleValue());
  }

}
