package day02;

public class EX03 {

  public static void main(String[] args) {
    Phone galaxy = new Phone("Galaxy Flip", "갤갤갤");
    Phone iPhone = new Phone("iPhone 15", "ring ding dong");

    Person sonny = new Person("대 흥 민", "마 비키라 내 폰 킬끼다");
    Person beckham = new Person("Beckham", "Can I turn on my phone, sonny?");

    PhoneStore galaxyStore = new PhoneStore("Galaxy Store", galaxy);
    PhoneStore appleStore = new PhoneStore("Apple Store", iPhone);

    System.out.println("* 쏘니, 베컴이 상점에서 휴대폰을 구매합니다.");
    galaxyStore.sellPhone(sonny);
    appleStore.sellPhone(beckham);

    System.out.println("\n* 쏘니가 폰을 켭니다");
    sonny.turnOnPhone();

    System.out.println("\n* 베컴이 폰을 켭니다");
    beckham.turnOnPhone();
  }
}

class Person {

  String name;
  Phone phone;
  String turnOnSpeech;

  Person(String name, String turnOnSpeech) {
    this.name = name;
    this.turnOnSpeech = turnOnSpeech;
  }

  void turnOnPhone() {
    System.out.printf("%s\n", turnOnSpeech);

    this.phone.turnOn();
  }

  void buyPhone(Phone phone) {
    this.phone = phone;
  }

  public String getName() {
    return name;
  }
}

class Phone {

  String name;
  boolean isTurn;
  String turnOnSound;

  Phone(String name, String turnOnSound) {
    this.name = name;
    this.turnOnSound = turnOnSound;
    this.isTurn = false;
  }

  void turnOn() {
    System.out.printf("%s\n", turnOnSound);
    this.isTurn = true;
  }

  String getName() {
    return this.name;
  }
}

class PhoneStore {

  String name;
  Phone phone;

  PhoneStore(String name, Phone phone) {
    this.name = name;
    this.phone = phone;
  }

  void sellPhone(Person person) {
    System.out.printf("%s에서 %s이 %s를 구매했습니다.\n", name, person.getName(), phone.getName());
    person.buyPhone(phone);
  }

  String getName() {
    return name;
  }
}