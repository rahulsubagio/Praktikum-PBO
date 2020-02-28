import java.util.Scanner;

import bangunDimensi.lingkaran.Bola;
import bangunDimensi.lingkaran.Tabung;
import bangunDimensi.persegi.Kubus;
import bangunDimensi.persegi.LimasPersegi;
import bangunDimensi.persegiPanjang.Balok;
import bangunDimensi.persegiPanjang.LimasPersegiPanjang;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int panjang, lebar, tinggi, jari;
    char kembali;

    do {
      System.out.println("\nSelamat Datang di Welcome\n");
      System.out.print("Input Panjang : ");
      panjang = input.nextInt();
      System.out.print("Input Lebar : ");
      lebar = input.nextInt();
      System.out.print("Input Tinggi : ");
      tinggi = input.nextInt();
      System.out.print("Input Jari-Jari : ");
      jari = input.nextInt();

      Kubus kubus = new Kubus(panjang);
      LimasPersegi limas = new LimasPersegi(panjang, tinggi);
      Balok balok = new Balok(panjang, lebar, tinggi);
      LimasPersegiPanjang limasPP = new LimasPersegiPanjang(panjang, lebar, tinggi);
      Tabung tabung = new Tabung(jari, tinggi);
      Bola bola = new Bola(jari);

      kubus.tampil();
      limas.tampil();
      balok.tampil();
      limasPP.tampil();
      tabung.tampil();
      bola.tampil();

      System.out.print("\nUlang? : ");
      kembali = input.next().charAt(0);
    } while (kembali == 'y');
  }
}