package datar;

public class Segitiga {
  int keliling;
  float luas;

  public int kelilingSegitiga(int sisiSegitiga) {
    keliling = sisiSegitiga * 3;
    return keliling;
  }

  public float luasSegitiga(int tinggi, int alas) {
    luas = (alas * tinggi) / 2;
    return luas;
  }
}