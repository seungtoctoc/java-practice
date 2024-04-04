package day02;

public class EX01 {

  public static void main(String[] args) {
    Animal dog = new Animal("코코", "멍멍");
    dog.cry();

    Animal cat = new Animal("뮹", "미야오옹");
    cat.cry();
  }
}

class Animal {

  String name;
  String sound;

  Animal(String name, String sound) {
    this.name = name;
    this.sound = sound;
  }

  void cry() {
    System.out.printf("%s: %s\n", name, sound);
  }
}