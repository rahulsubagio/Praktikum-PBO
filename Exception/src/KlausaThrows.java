public class KlausaThrows {
  public static void uji(int angka) {
    if (angka < 0) {
      throw new NullPointerException("Kesalahan : Null Pointer Exception");
    } else {
      throw new ArithmeticException("Kesalahan : Aritmathic Exception");
    }
  }

  public static void main(String[] args) {
    System.out.println("\n::::: Program Klausa Throws :::::");
    try {
      uji(0);
    } catch (Exception exc) {
      System.out.println("");
      System.err.println("Exception ditangkap disini");
      System.err.println("\n\tPemberitahuan!!! \n" + exc.getMessage());
    }
    System.out.println("\nPernyataan di luar blok trycatch");
  }
}