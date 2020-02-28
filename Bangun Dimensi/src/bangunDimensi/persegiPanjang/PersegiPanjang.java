package bangunDimensi.persegiPanjang;

import bangunDimensi.BangunDimensi;

public class PersegiPanjang extends BangunDimensi {
  private int panjang, lebar;

  public PersegiPanjang() {

  }

  public PersegiPanjang(int panjang, int lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
  }

  @Override
  public double hitungLuas() {
    super.luas = panjang * lebar;
    return super.luas;
  }

  @Override
  public double hitungKeliling() {
    super.keliling = 2 * (panjang * lebar);
    return super.keliling;
  }

  public int getPanjang() {
    return panjang;
  }

  public int getLebar() {
    return lebar;
  }

  public void setPanjang(int panjang) {
    this.panjang = panjang;
  }

  public void setLebar(int lebar) {
    this.lebar = lebar;
  }
}