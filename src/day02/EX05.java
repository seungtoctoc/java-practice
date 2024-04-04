public class EX05 {

  public static void main(String[] args) {
    Person sonny = new Person("손", "내가 한번 켜보겠다");
    Person beckham = new Person("Beckham", "Can I turn on my phone?");

    ApplePhone applePhone = new ApplePhone();
    SamsungPhone samsungPhone = new SamsungPhone();

    System.out.println("* 구매");
    sonny.buyPhone(samsungPhone.brand, applePhone, samsungPhone);
    beckham.buyPhone(applePhone.brand, applePhone, samsungPhone);

    System.out.println("\n* 쏜 폰 on");
    sonny.sayTurnOn();

    System.out.println("\n* 베컴 폰 on");
    beckham.sayTurnOn();

  }
}

class Person {

  String name;
  String turnOnSpeech;
  String phoneType;
  SamsungPhone samsungPhone;
  ApplePhone applePhone;

  Person(String name, String turnOnSpeech) {
    this.name = name;
    this.turnOnSpeech = turnOnSpeech;
  }

  void sayTurnOn() {
    System.out.printf("%s\n", turnOnSpeech);
    if (this.phoneType.equals("apple")) {
      applePhone.turnOn();
      return;
    }

    samsungPhone.turnOn();
  }

  void buyPhone(String type, ApplePhone applePhone, SamsungPhone samsungPhone) {
    if (type.equals("apple")) {
      this.phoneType = "apple";
      this.applePhone = applePhone;
      return;
    }

    this.phoneType = "samsung";
    this.samsungPhone = samsungPhone;

    System.out.printf("%s이 %sPhone을 구매했습니다.\n", this.name, this.phoneType);
  }
}

class Phone {

  String brand = "default";
}

class ApplePhone extends Phone {

  String brand = "apple";

  void turnOn() {
    System.out.println("애플플");
  }
}

class SamsungPhone extends Phone {

  String brand = "samsung";

  void turnOn() {
    System.out.println("삼송송");
  }
}