package bangunDimensi.lingkaran;

import bangunDimensi.BangunDimensi;

public class Lingkaran extends BangunDimensi {
  private int jari;

  public Lingkaran() {

  }

  public Lingkaran(int jari) {
    this.jari = jari;
  }

  @Override
  public double hitungLuas() {
    super.luas = super.pi * jari * jari;
    return super.luas;
  }

  @Override
  public double hitungKeliling() {
    super.keliling = 2 * super.pi * jari;
    return super.keliling;
  }

  public int getJari() {
    return jari;
  }

  public void setJari(int jari) {
    this.jari = jari;
  }
}