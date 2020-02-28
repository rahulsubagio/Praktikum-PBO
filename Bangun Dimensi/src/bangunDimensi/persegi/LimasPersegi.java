package bangunDimensi.persegi;

public class LimasPersegi extends Persegi {
  private int tinggi;
  private double luasAlas, luasSisi;

  public LimasPersegi() {

  }

  public LimasPersegi(int panjang, int tinggi) {
    super(panjang);
    this.tinggi = tinggi;
  }

  public void hitungLuasAlas() {
    luasAlas = getPanjang() * getPanjang();
  }

  public void hitungLuasSisi() {
    luasSisi = 4 * ((getPanjang() * tinggi) / 2);
  }

  @Override
  public double hitungLuas() {
    hitungLuasAlas();
    hitungLuasSisi();
    super.luas = luasAlas + luasSisi;
    return super.luas;
  }

  public double hitungVolume() {
    hitungLuasAlas();
    super.volume = (luasAlas * tinggi) / 3;
    return super.volume;
  }

  public void tampil() {
    super.hitungLuas();
    hitungLuas();
    hitungVolume();
    System.out.println("\n     ::: Limas Persegi :::");
    System.out.println("     -> Luas : " + super.luas);
    System.out.println("     -> Volume : " + super.volume);
  }
}