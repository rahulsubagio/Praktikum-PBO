import java.util.Scanner;
import datar.*;
import ruang.*;

public class Main {
  public static void main(final String[] args) {

    Persegi persegi = new Persegi();
    Segitiga segitiga = new Segitiga();
    Balok balok = new Balok();
    Kubus kubus = new Kubus();

    int pilih, sisiPersegi, keliling;
    int sisiSegitiga, tinggi, alas;
    float luas;
    int volume, luasalas;
    int panjang, lebar, sisiKubus;
    char piliha, kembali = 0;

    Scanner scanInput = new Scanner(System.in);

    do {
      System.out.println("::::: Menu :::::");
      System.out.println("1. Bangun Datar");
      System.out.println("2. Bangun Ruang");
      System.out.print("Pilih : ");
      pilih = scanInput.nextInt();
      switch (pilih) {
      case 1:
        System.out.println("\n::::: Bangun Datar :::::");
        System.out.println("a. Persegi");
        System.out.println("b. Segitiga");
        System.out.print("Pilih : ");
        piliha = scanInput.next().charAt(0);
        switch (piliha) {
        case 'a':
          System.out.println("\n::::: Persegi :::::");
          System.out.print("Input Sisi : ");
          sisiPersegi = scanInput.nextInt();
          keliling = persegi.kelilingPersegi(sisiPersegi);
          luas = persegi.luasPersegi(sisiPersegi);
          System.out.println("Keliling Persegi : " + keliling);
          System.out.println("Luas Persegi : " + luas);
          break;
        case 'b':
          System.out.println("\n::::: Segitiga :::::");
          System.out.print("Input Sisi : ");
          sisiSegitiga = scanInput.nextInt();
          System.out.print("Input Tinggi : ");
          tinggi = scanInput.nextInt();
          System.out.print("Input Alas : ");
          alas = scanInput.nextInt();
          keliling = segitiga.kelilingSegitiga(sisiSegitiga);
          luas = segitiga.luasSegitiga(tinggi, alas);
          System.out.println("Keliling Segitiga : " + keliling);
          System.out.println("Luas Segitiga : " + luas);
          break;
        }
        break;
      case 2:
        System.out.println("\n::::: Bangun Ruang :::::");
        System.out.println("a. Balok");
        System.out.println("b. Kubus");
        System.out.print("Pilih : ");
        piliha = scanInput.next().charAt(0);
        switch (piliha) {
        case 'a':
          System.out.println("\n::::: Balok :::::");
          System.out.print("Input Panjang : ");
          panjang = scanInput.nextInt();
          System.out.print("Input Lebar : ");
          lebar = scanInput.nextInt();
          System.out.print("Input Tinggi : ");
          tinggi = scanInput.nextInt();
          volume = balok.volumeBalok(panjang, lebar, tinggi);
          luasalas = balok.luasAlas(panjang, lebar);
          System.out.println("Volume Balok : " + volume);
          System.out.println("Luas Alas : " + luasalas);
          break;
        case 'b':
          System.out.println("\n::::: Balok :::::");
          System.out.print("Input sisi : ");
          sisiKubus = scanInput.nextInt();
          volume = kubus.volumeKubus(sisiKubus);
          luasalas = kubus.luasAlas(sisiKubus);
          System.out.println("Volume Kubus : " + volume);
          System.out.println("Luas Alas : " + luasalas);
          break;
        }
        break;
      }
      System.out.print("\nKembali? : ");
      kembali = scanInput.next().charAt(0);
      System.out.println("\n");
    } while (kembali == 'y');
  }
}