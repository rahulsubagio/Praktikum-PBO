package belajarInterface;

public class Cat extends Animal implements Pet {

  String name;

  public Cat() {
    this("");
  }

  public Cat(String name) {
    super(4);
    this.name = name;
  }

  @Override
  void eat() {
    System.out.println("Kucing sedang " + "memakan ikan");
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
    System.out.println("Kucing sedang bermain");
  }

}