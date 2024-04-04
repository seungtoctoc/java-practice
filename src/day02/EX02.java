package day02;

public class EX02 {

  public static void main(String[] args) {
    Coffee vanillaLatte = new Coffee("바닐라 라떼", 5800, "Hot", "Tall");
    vanillaLatte.getInfo();

    Barista barista = new Barista("chunsik");
    barista.getCoffeeInfo(vanillaLatte);
    barista.makeCoffee(vanillaLatte);
  }
}

class Coffee {

  private String name;
  private int price;
  private String temperature;
  private String size;

  Coffee(String name, int price, String temperature, String size) {
    this.name = name;
    this.price = price;
    this.temperature = temperature;
    this.size = size;
  }

  void getInfo() {
    System.out.printf("---- %s ----\n", name);
    System.out.printf("price: %s\n", price);
    System.out.printf("temperature: %s\n", temperature);
    System.out.printf("size: %s\n\n", size);
  }

  void setPrice(int price) {
    if (price > this.price) {
      this.price = price;
    }
  }

  int getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }
}

class Barista {

  private String name;

  Barista(String name) {
    this.name = name;
  }

  void getCoffeeInfo(Coffee coffee) {
    System.out.printf("%d원 입니다 고갱님~\n", coffee.getPrice());
  }

  void makeCoffee(Coffee coffee) {
    System.out.printf("주문하신 %s 나왔습니다~\n", coffee.getName());
  }
}