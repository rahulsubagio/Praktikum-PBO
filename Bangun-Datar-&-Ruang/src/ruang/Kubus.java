package ruang;

public class Kubus {
  int volume, luasalas;

  public int volumeKubus(int sisiKubus) {
    volume = sisiKubus * sisiKubus * sisiKubus;
    return volume;
  }

  public int luasAlas(int sisiKubus) {
    luasalas = sisiKubus * sisiKubus;
    return luasalas;
  }
}