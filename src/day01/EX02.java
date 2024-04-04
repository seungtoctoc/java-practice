package day01;

public class EX02 {

  public static void main(String[] args) {
    int num = 4;
    char result = 'N';

    switch (num) {
      case 9:
        result = 'A';
        break;
      case 8:
        result = 'B';
        break;
      case 7:
        result = 'C';
        break;
      default:
        result = 'F';
    }

    System.out.printf("result: %c", result);
  }
}
