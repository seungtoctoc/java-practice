package day01;

public class EX01 {

  public static void main(String[] args) {
    int score = 87;
    char result = 'F';

      if (score >= 90) {
          result = 'A';
      } else if (score >= 80) {
          result = 'B';
      } else if (score >= 70) {
          result = 'C';
      }

    System.out.printf("result : %c", result);
  }
}
