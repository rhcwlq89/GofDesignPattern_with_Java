package adapter;

public class Math {

  // 두 배의 수를 구하는 함수
  public static double twoTime(double num) {
    return num * 2;
  }

  // 절반의 수를 구하는 함수
  public static double half(double num) {
    return num / 2;
  }

  // 추가요구사항
  // 강화된 알고리즘
  public static Double doubled(Double d) {
    // 공통 라이브러리이기 때문에 로그를 추가하는 것은 적절하지 않음.
    return d * 2;
  }

}
