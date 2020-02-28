package bangunDimensi.lingkaran;

public class Bola extends Lingkaran {

  public Bola() {

  }

  public Bola(int jari) {
    super(jari);
  }

  @Override
  public double hitungLuas() {
    super.luas = 4 * super.pi * getJari() * getJari();
    return super.luas;
  }

  public double hitungVolume() {
    super.volume = (4 * (super.pi * (getJari() * getJari() * getJari()))) / 3;
    return super.volume;
  }

  public void tampil() {
    hitungLuas();
    hitungVolume();
    System.out.println("\n     ::: Bola ::: ");
    System.out.println("     -> Luas : " + super.luas);
    System.out.println("     -> Volume : " + super.volume);
  }
}