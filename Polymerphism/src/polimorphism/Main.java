package polimorphism;

public class Main {
  public static void main(String[] args) {
    Hewan hewanAnonim = new Hewan("Anonim");
    hewanAnonim.makan();
    Hewan hewan1 = new Herbivora("Kelinci");
    Hewan hewan2 = new Karnivora("Ayam");
    Hewan hewan3 = new Omnivora("Kucing");
    hewan1.makan();
    hewan2.makan();
    hewan3.makan();
  }
}