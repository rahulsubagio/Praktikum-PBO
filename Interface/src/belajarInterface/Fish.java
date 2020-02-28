package belajarInterface;

public class Fish extends Animal implements Pet {

  String name;

  public Fish() {
    super(0);
  }

  @Override
  void eat() {
    System.out.println("Ikan sedang makan");
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void play() {
    System.out.println("Ikan sedang bermain");
  }

  @Override
  public void walk() {
    System.out.println("Ikan tidak berjalan " + "tapi berenang");
  }
}