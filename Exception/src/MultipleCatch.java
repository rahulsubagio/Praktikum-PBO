public class MultipleCatch {
  public static void main(String[] args) {
    System.out.println("\n::::: Program Multiple Catch :::::");
    try {
      int[] array = new int[9];
      array[9] = 13 / 1;
      System.out.println("Elemen Array indeks ke 9 adalah " + array[9]);
      System.out.println("Pernyataan dalam blok try setelah bebas dari exception");
    } catch (ArrayIndexOutOfBoundsException exc) {
      System.out.println("");
      System.err.println("Anda mengaksses array di luar indeks yang dideklarasikan");
    } catch (NegativeArraySizeException exc) {
      System.out.println("");
      System.err.println("Anda mengaksses array dengan ukuran negative");
    } catch (Exception exc) {
      System.out.println("");
      System.err.println("Anda melakukan pembagian dengan nol");
    }
    System.out.println("\nPernyataan di luar blok trycatch");
  }
}