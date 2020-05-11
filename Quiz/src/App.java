import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nim, nama, kembali;
		int banyak, nilai[] = new int[4];
		do {
			try {
				System.out.println("MENU FORM PENDAFTARAN");
				System.out.println("1. Asisten Laboratorium");
				System.out.println("2. Admin Laboratorium");
				System.out.print("Pilih Jenis Form : ");
				int pilih = input.nextInt();

				switch (pilih) {
					case 1:
						System.out.println("\nFORM PENDAFTARAN ASISTEN LABORATORIUM");
						System.out.print("Berapa banyak data yang akan di inputkan? : ");
						banyak = input.nextInt();
						for (int i = 0; i < banyak; i++) {
							input.nextLine();
							System.out.print("Input NIM : ");
							nim = input.nextLine();
							System.out.print("Input Nama : ");
							nama = input.nextLine();
							System.out.print("Input Nilai Tes Tulis : ");
							nilai[0] = input.nextInt();
							System.out.print("Input Nilai Tes Coding : ");
							nilai[1] = input.nextInt();
							System.out.print("Input Nilai Tes Wawancara : ");
							nilai[2] = input.nextInt();
							System.out.print("Input Nilai Tes Microteaching : ");
							nilai[3] = input.nextInt();
							Aslab aslab = new Aslab(nama, nim, nilai);
							aslab.check();
							System.out.println();
						}
						break;
					case 2:
						System.out.println("\nFORM PENDAFTARAN ADMIN LABORATORIUM");
						System.out.print("Berapa banyak data yang akan di inputkan? : ");
						banyak = input.nextInt();
						for (int i = 0; i < banyak; i++) {
							input.nextLine();
							System.out.print("Input NIM : ");
							nim = input.nextLine();
							System.out.print("Input Nama : ");
							nama = input.nextLine();
							System.out.print("Input Nilai Tes Tulis : ");
							nilai[0] = input.nextInt();
							System.out.print("Input Nilai Tes Coding : ");
							nilai[1] = input.nextInt();
							System.out.print("Input Nilai Tes Wawancara : ");
							nilai[2] = input.nextInt();
							System.out.print("Input Nilai Tes Jaringan : ");
							nilai[3] = input.nextInt();
							Admin admin = new Admin(nama, nim, nilai);
							admin.check();
							System.out.println();
						}
						break;
				}
			} catch (Exception e2) {
				System.err.println("Input Harus Bilangan Bulat!");
			} finally {
				input.nextLine();
				System.out.print("\nKembali ke menu utama? (y/n) : ");
				kembali = input.nextLine();
				System.out.println();
			}
		} while (kembali.equals("y"));
	}
}
