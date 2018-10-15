package com.main;

import com.helper.AbstGameConnectHelper;
import com.helper.DefaultGameConnectHelper;

public class Main {

  // Template Method
  // 공통적인 프로세스를 묶어주기

  // 학습목표
  // 일정한 프로세스를 가진 요구사항을 템플릿 메소드 패턴을 이용하여
  // 구현할 수 있다.

  // Template : 모양자

  // Template Method Pattern
  // 알고리즘의 구조를 메소드에 정의하고 하위 클래스에서
  // 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴

  // 사용시점
  // 구현하려는 알고리즘이 일정한 프로세스가 있다.
  // 구현하려는 알고리즘이 변경가능성이 있다.

  // 사용단계
  // 알고리즘을 여러단계로 나눈다.
  // 나눠진 알고리즘의 단계를 메소드로 선언
  // 알고리즘을 수행할 템플릿 메소드를 만든다.
  // 하위 클래스에서 나눠진 메소드들을 구현한다.

  // 요구사항
  // 신작게임의 접속을 구현해주세요
  // requestCOnnection(String str) : String (템플릿 메소드)
  //
  // 유저가 게임 접속시 다음을 고려해야 합니다. (단계별 메소드를 선언)
  // 1. 보안과정 : 보안 관련 부분을 처리합니다.
  // doSecurity(String string) : String
  // 2. 인증과정 : user name과 password가 일치하는 지 확인합니다.
  // authentication(String id, String password) : boolean
  // 3. 권한과정 : 접속자가 유료 회원인지 무료회원인지 게임 마스터인지 확인합니다.
  // authorization(String userName) : int
  // 4. 접속과정 : 접속자에게 커넥션 정보를 넘겨줍니다.
  // connection(String info) : String

  // 더 공부해 봅시다.
  // 보안 부분이 정부 정책에 의해서 강화되었습니다. 강화된 방식으로 코드를 변경해야 합니다.
  // 여가부에서 밤 10시 이후에 미성년자의 접속을 제한해야 합니다.

  // public : 어디서든지 사용가능.
  // protected : 하위 클래스에서도 사용가능
  // private : 자기자신만 사용가능(하위 클래스에서도 사용하지 못함)
  // 의도를 전달하기 위해서 packaging에 대한 고려가 필요하다.

  public static void main(String[] args) {
    AbstGameConnectHelper helper = new DefaultGameConnectHelper();
    helper.requestConnection("아이디 암호 접속정보");
  }

}
