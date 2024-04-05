package day03;

public class EX01 {

  public static void main(String[] args) {
    Chicken chicken = new Chicken();
    Cow cow = new Cow();
    Farm farm = new Farm(chicken, cow);

    farm.getSound();

    cow.cry();

    chicken.cry();
  }
}

class Farm {

  Chicken chicken;
  Cow cow;

  Farm(Chicken chicken, Cow cow) {
    this.chicken = chicken;
    this.cow = cow;
  }

  void getSound() {
    chicken.cry();
    cow.cry();
  }
}

class Animal {

  void cry() {
    System.out.println("애니머어얼");
  }
}

class Cow extends Animal {

  void cry() {
    System.out.println("소오오오");
  }
}

class Chicken extends Animal {

  void cry() {
    System.out.println("다아아앍");
  }
}
