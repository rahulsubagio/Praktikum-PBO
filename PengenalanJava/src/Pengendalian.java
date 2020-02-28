public class Pengendalian {
    public static void main(String[] args) {
        String nama = "Rahul Subagio";
        int umur = 20;
        char jk = 'L';
        String ketjk = null;
        
        if (jk == 'L') {
            ketjk = "Laki - Laki";
            System.out.println("JK : " + ketjk);
            if (umur >= 1 && umur <= 12) {
                System.out.println("Anak-anak");
            } else if (umur >= 13 && umur <= 20) {
                System.out.println("Remaja");
            } else {
                System.out.println("Dewasa");
            }
        } else if (jk == 'P') {
            ketjk = "Perempuan";
            System.out.println("JK : " + ketjk);
            if (umur >= 1 && umur <= 12) {
                System.out.println("Anak-anak");
            } else if (umur >= 13 && umur <= 20) {
                System.out.println("Remaja");
            } else {
                System.out.println("Dewasa");
            }
        } else {
            System.out.println("Tidak Jelas");
        }
        System.out.println(nama + " Hasil JK adalah " + ketjk);
    }
}
