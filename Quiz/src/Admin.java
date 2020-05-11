public class Admin implements Daftar {
  private String nama, nim;
  private int nilai[], rata = 0;

  public Admin(String nama, String nim, int[] nilai) {
    this.nama = nama;
    this.nim = nim;
    this.nilai = nilai;
  }

  @Override
  public int hitungRata() {
    for (int i = 0; i < 4; i++) {
      rata += nilai[i];
    }
    rata = rata / 4;
    return rata;
  }

  @Override
  public void check() {
    hitungRata();
    if (rata > 85) {
      System.out.println("KETERANGAN : LOLOS");
      System.out.println("Selamat kepada " + nim + " telah diterima sebagai Aslab");
    } else {
      System.out.println("KETERANGAN : GAGAL");
			System.out.println("Mohon maaf kepada " + nim + " telah ditolak sebagai Aslab");
    }
  }

}