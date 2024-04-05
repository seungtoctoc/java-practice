package day03;

public class EX04 {

  public static void main(String[] args) {
    PastaRecipe pasta = new PastaRecipe("백종원아저씨");
    SteakRecipe steak = new SteakRecipe("백종투아저씨");

    pasta.getInfo();
    steak.getInfo();
  }
}

abstract class Recipe {


  String name;

  Recipe(String name) {
    this.name = name;
  }

  abstract void getInfo();
}

class PastaRecipe extends Recipe {

  PastaRecipe(String name) {
    super(name);
  }

  @Override
  void getInfo() {
    System.out.println("*** 파스타 레시피");
    System.out.println("소스만들고 면에 부어버려\n");
  }
}

class SteakRecipe extends Recipe {

  SteakRecipe(String name) {
    super(name);
  }

  @Override
  void getInfo() {
    System.out.println("*** 스테이크 레시피");
    System.out.println("고기굽고 소스 부어버려\n");
  }
}