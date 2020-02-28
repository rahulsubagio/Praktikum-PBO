package bangunDimensi.persegi;

import bangunDimensi.BangunDimensi;

public class Persegi extends BangunDimensi {
  private int panjang;

  public Persegi() {

  }

  public Persegi(int panjang) {
    this.panjang = panjang;
  }

  @Override
  public double hitungLuas() {
    super.luas = panjang * panjang;
    return super.luas;
  }

  @Override
  public double hitungKeliling() {
    super.keliling = 4 * panjang;
    return super.keliling;
  }

  public int getPanjang() {
    return panjang;
  }

  public void setPanjang(int panjang) {
    this.panjang = panjang;
  }
}