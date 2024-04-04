package day01;

public class EX06 {

  public static void main(String[] args) {
    Person me = new Person("me", 20);
    me.printInfo();

    Person conor = new Person("conor", 30);

  }
}

class Person {

  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void printInfo() {
    System.out.printf("this person is named %s. And %d years old.\n", name, age);
  }
}