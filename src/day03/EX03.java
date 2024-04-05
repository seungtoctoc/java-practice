package day03;

public class EX03 {

  public static void main(String[] args) {
    Dog mongmongi = new Dog();
    Cat kangCat = new Cat();
    Garden garden = new Garden();

    garden.getSound(mongmongi);

    garden.getSound(kangCat);
  }
}

class Garden {

  void getSound(Pet pet) {
    pet.cry();
  }
}

class Pet {

  void cry() {
    System.out.println("우웨에엑");
  }
}

class Dog extends Pet {

  void cry() {
    System.out.println("월 월 월");
  }
}

class Cat extends Pet {

  void cry() {
    System.out.println("미야옹");
  }
}
