package com.helper;

public abstract class AbstGameConnectHelper {

  // protected 사용하는 이유에 대해서 생각해둘 것.
  // 알고리즘의 단계이기 때문에 외부에 노출되면 안된다.

  protected abstract String doSecurity(String string);

  protected abstract boolean authentication(String id, String password);

  protected abstract int authorization(String username);

  protected abstract String connection(String info);

  // 템플릿 메소드
  public String requestConnection(String encryptedInfo) {
    // 보안과정 -> 암호화된 문자열을 복호화
    String descryptedInfo = doSecurity(encryptedInfo);

    // 인증과정 -> 반환된 것을 가지고 아이디, 암호를 할당한다.
    String id = "aaa";
    String password = "bbb";

    if (!authentication(id, password)) {
      throw new Error("아이디 암호 불일치");
    }

    // 권한과정 -> user name을 통해서 권한을 확인한다.
    String userName = "user";
    int i = authorization(userName);

    switch (i) {
      case -1:
        throw new Error("셧다운");
      case 0:
        System.out.println("게임 매니저");
        break;
      case 1:
        System.out.println("유료회원");
        break;
      case 2:
        System.out.println("무료회원");
        break;
      case 3:
        System.out.println("권한없음");
        break;
      default:
        // 기타 상황
        break;
    }

    // 접속과정 -> 접속자에게 접속정보를 넘겨준다.
    return connection(descryptedInfo);
  }

}
