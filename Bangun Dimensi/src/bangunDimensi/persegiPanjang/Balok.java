package bangunDimensi.persegiPanjang;

public class Balok extends PersegiPanjang {
  private int tinggi;

  public Balok() {

  }

  public Balok(int panjang, int lebar, int tinggi) {
    super(panjang, lebar);
    this.tinggi = tinggi;
  }

  @Override
  public double hitungLuas() {
    super.luas = 2 * (getPanjang() * getLebar() + getPanjang() * tinggi + getLebar() * tinggi);
    return super.luas;
  }

  public double hitungVolume() {
    super.volume = getPanjang() * getLebar() * tinggi;
    return super.volume;
  }

  public void tampil() {
    super.hitungLuas();
    super.hitungKeliling();
    System.out.println("\n2. ::: Persegi Panjang ::: ");
    System.out.println("   -> Luas : " + super.luas);
    System.out.println("   -> Keliling : " + super.keliling);

    hitungLuas();
    hitungVolume();
    System.out.println("\n     ::: Balok ::: ");
    System.out.println("     -> Luas : " + super.luas);
    System.out.println("     -> Volume : " + super.volume);
  }
}