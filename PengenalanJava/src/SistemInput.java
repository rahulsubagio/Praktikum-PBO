import java.util.Scanner;

public class SistemInput {
    public static void main(String[] args) {
       String nama;
       int nim, umur;
       
       Scanner scanInput = new Scanner(System.in);
       System.out.print("Nama : ");
       nama = scanInput.nextLine();
       System.out.print("Nim : ");
       nim = scanInput.nextInt();
       System.out.print("Umur : ");
       umur = scanInput.nextInt();
       
       System.out.println("\nNama :" + nama);
       System.out.println("Nim  : " + nim);
       System.out.println("Umur : " + umur);
    }
}
