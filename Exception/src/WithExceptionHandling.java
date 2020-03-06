public class WithExceptionHandling {
  public static void main(String[] args) {
    System.out.println("\n::::: Program Exception :::::");
    try {
      int hasil = 9 / 0;
      System.out.println("Hasil Pembagian : " + hasil);
      System.out.println("Pernyataan dalam blok try setelah bebas dari exception");
    } catch (Exception exc) {
      System.out.println("");
      System.err.println("ArithmeticException menangkap exception hasil pembagian oleh nol");
      System.err.println("\nException yang ditangkap adalah : " + exc);
      System.out.println("");
    }
    System.out.println("\nPernyataan di luar blok trycatch");
  }
}