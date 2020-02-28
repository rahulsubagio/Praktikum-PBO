package bangunDimensi.persegi;

public class Kubus extends Persegi {
  public Kubus() {

  }

  public Kubus(int panjang) {
    super(panjang);
  }

  @Override
  public double hitungLuas() {
    super.luas = 6 * (getPanjang() * getPanjang());
    return super.luas;
  }

  public double hitungVolume() {
    super.volume = getPanjang() * getPanjang() * getPanjang();
    return super.volume;
  }

  public void tampil() {
    super.hitungLuas();
    super.hitungKeliling();
    System.out.println("\n1. ::: Persegi ::: ");
    System.out.println("   -> Luas : " + super.luas);
    System.out.println("   -> Keliling : " + super.keliling);

    hitungLuas();
    hitungVolume();
    System.out.println("\n     ::: Kubus ::: ");
    System.out.println("     -> Luas : " + super.luas);
    System.out.println("     -> Volume : " + super.volume);
  }
}