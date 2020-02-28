import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);

		String nama;
		int min = 101, max = 0, j = 1, n;
		float total = 0;

		System.out.print("Nama : ");
		nama = scanInput.nextLine();
		System.out.print("Berapa nilai yang akan diinputkan? : ");
		n = scanInput.nextInt();

		int nilai[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Nilai ke-" + j + " : ");
			nilai[i] = scanInput.nextInt();
			j++;
		}

		for (int i = 0; i < n; i++) {
			total += nilai[i];
			if (max < nilai[i]) {
				max = nilai[i];
			}
			if (min > nilai[i]) {
				min = nilai[i];
			}
		}

		System.out.println("\nNama : " + nama);
		System.out.println("Nilai Tertinggi : " + max);
		System.out.println("Nilai Terendah : " + min);
		System.out.println("Rata-rata Nilai : " + total / n);
	}
}
