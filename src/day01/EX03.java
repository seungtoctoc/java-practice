package day01;

public class EX03 {

  public static void main(String[] args) {
    int age = 21;
    String message = "init";

    switch (age / 10) {
      case 0:
        message = "어린이입니다..";
        break;
      default:
        message = (age / 10) + "0대입니다..";
    }

    System.out.println(message);
  }
}
