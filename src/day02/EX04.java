package day02;

public class EX04 {

  public static void main(String[] args) {
    Bus bus = new Bus();
    bus.drive();
    bus.printWheel();

    System.out.println("----");

    Taxi taxi = new Taxi();
    taxi.drive();
    taxi.printWheel();
  }
}

class Car {

  int wheel = 4;
  String drivingSound;

  void printWheel() {
    System.out.printf("바퀴는 %d개 있어요.\n", wheel);
  }

  void drive() {
    System.out.println("부모아앙");
  }
}

class Bus extends Car {

  void drive() {
    System.out.println("부아아아악");
  }

  void pushBell() {
    System.out.println("삐이이이이이이이이이익");
  }
}

class Taxi extends Car {

  void drive() {
    System.out.println("겍겍겍");
  }
}