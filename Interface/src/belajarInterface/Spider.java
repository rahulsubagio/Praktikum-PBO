package belajarInterface;

public class Spider extends Animal {

  public Spider() {
    super(8);
  }

  @Override
  void eat() {
    System.out.println("Laba - Laba " + "sedang makan");
  }
}