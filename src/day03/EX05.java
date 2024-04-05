package day03;

public class EX05 {

  public static void main(String[] args) {
    Netflix netflix = new Netflix();
    Tving tving = new Tving();

    myFunc(netflix);
    myFunc(tving);
  }

  static void myFunc(OTT ott) {
    ott.openingLogo();
    ott.play();
    ott.finish();
    System.out.println();
  }
}


abstract class OTT {

  abstract void openingLogo();

  abstract void play();

  abstract void finish();
}

class Netflix extends OTT {

  void openingLogo() {
    System.out.println("뚜둥~ (커튼 앞으로 다가옴)");
  }

  void play() {
    System.out.println("넷플 재생 시작");
  }

  void finish() {
    System.out.println("넷플 재생 종료");
  }

}


class Tving extends OTT {

  void openingLogo() {
    System.out.println("티빙빙~");
  }

  void play() {
    System.out.println("티빙 재생 시작");
  }

  void finish() {
    System.out.println("티빙 재생 종료");
  }
}
