package ruang;

public class Balok {
  int volume, luasalas;

  public int volumeBalok(int panjang, int lebar, int tinggi) {
    volume = panjang * lebar * tinggi;
    return volume;
  }

  public int luasAlas(int panjang, int lebar) {
    luasalas = panjang * lebar;
    return luasalas;
  }
}