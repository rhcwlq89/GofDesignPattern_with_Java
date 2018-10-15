package com.helper;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

  @Override
  protected String doSecurity(String string) {
    // System.out.println("복호화 과정");
    System.out.println("강화된 알고리즘을 이용한 복호화");
    return string;
  }

  @Override
  protected boolean authentication(String id, String password) {
    System.out.println("아이디/암호 확인과정");
    return true;
  }

  @Override
  protected int authorization(String username) {
    System.out.println("권한확인");
    // 서버에서 유저나이를 알 수 있다.
    // 나이를 확인하고 시간을 확인하는 과정을 추가.
    return -1;
  }

  @Override
  protected String connection(String info) {
    System.out.println("마지막 접속 단계!");
    return info;
  }

}
