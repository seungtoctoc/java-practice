package day01;

public class EX05 {

  public static void main(String[] args) {
    Product newProduct = new Product("Genesis");
    newProduct.printName();

    Computer myComputer = new Computer("Apple", 32);
    myComputer.printSpec();
  }
}

// 상품 클래스
class Product {

  private String name;

  Product(String name) {
    this.name = name;
  }

  void printName() {
    System.out.println("name: " + this.name);
  }
}

class Computer {

  String company;
  int cost;

  Computer(String company, int cost) {
    this.company = company;
    this.cost = cost;
  }

  void printSpec() {
    System.out.printf("this computer is made by %s. And its cost is $%d", company, cost);
  }
}