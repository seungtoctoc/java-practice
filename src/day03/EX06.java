package day03;

public class EX06 {

  public static void main(String[] args) {
    ApplePhone applePhone = new ApplePhone();
    SamsungPhone samsungPhone = new SamsungPhone();

    Person me = new Person("me");
    me.buyPhone(applePhone);

    Person ys = new Person("ys");
    ys.buyPhone(samsungPhone);

    me.getBattery();
    me.useKakaotalk();

    ys.getBattery();
    ys.useYoutube();

    ys.chargePhone();
    ys.chargePhone();

    me.useKakaotalk();
    me.useKakaotalk();
    me.useKakaotalk();
    me.useKakaotalk();
    me.useKakaotalk();
    me.useKakaotalk();
    me.useKakaotalk();
    me.useKakaotalk();
    me.useKakaotalk();
    me.useKakaotalk();

  }
}

class Person {

  String name;
  Phone phone;

  Person(String name) {
    this.name = name;
  }

  void buyPhone(Phone phone) {
    this.phone = phone;
  }

  void getBattery() {
    System.out.printf("%s getBattery\n", name);
    phone.getBattery();
  }

  void chargePhone() {
    System.out.printf("%s chargePhone\n", name);
    phone.charge();
  }

  void useKakaotalk() {
    System.out.printf("%s use kakaotalk\n", name);
    phone.useKakaotalk();
  }

  void useYoutube() {
    System.out.printf("%s use youtube\n", name);
    phone.useYoutube();
  }
}

class Phone {

  int battery;
  int maxBattery;

  void getBattery() {
    System.out.printf("배터리 잔량: %d / %d\n\n", battery, maxBattery);
  }

  void charge() {
    battery = Math.min(battery + 10, maxBattery);
    System.out.printf("charge, 배터리 잔량: %d / %d\n\n", battery, maxBattery);
  }

  void useKakaotalk() {
    useBattery(5);
  }

  void useYoutube() {
    useBattery(10);
  }

  void useBattery(int using) {
    if (battery >= using) {
      battery -= using;
      System.out.printf("use, 배터리 잔량: %d / %d\n\n", battery, maxBattery);
      return;
    }

    System.out.printf("can not use, 배터리 잔량: %d / %d\n\n", battery, maxBattery);
  }
}

class ApplePhone extends Phone {

  ApplePhone() {
    maxBattery = 80;
    battery = 33;
  }
}

class SamsungPhone extends Phone {

  SamsungPhone() {
    maxBattery = 120;
    battery = 41;
  }
}


