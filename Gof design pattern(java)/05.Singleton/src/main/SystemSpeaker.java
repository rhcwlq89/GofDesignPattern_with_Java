package main;

public class SystemSpeaker {

  private static SystemSpeaker instance;
  private int volume;

  private SystemSpeaker() {
    this.volume = 5;
  }

  public static SystemSpeaker getInstance() {
    // 로그추가
    if (instance == null) {
      // 시스템 스피커
      instance = new SystemSpeaker();
      System.out.println("새로 생성");
    } else {
      System.out.println("이미 생성");
    }

    return instance;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }
}
