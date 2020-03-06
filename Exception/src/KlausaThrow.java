public class KlausaThrow {
  public static void main(String[] args) {
    System.out.println("\n::::: Program Klausa Throw :::::");
    String input = "Throw RuntimeException";
    try {
      if (input.equals("Throw RuntimeException")) {
        throw new RuntimeException("Melempar Exception");
      } else if (input == null) {
        throw new NullPointerException();
      } else {
        System.out.println("input adalah input : " + input);
      }
      System.out.println("\nPernyataan di dalam blok try");
    } catch (Exception exc) {
      System.out.println("");
      System.err.println("Exception ditangkap disini");
      System.err.println("Exception yang ditangkap adalah : " + exc);
    }
    System.out.println("\nPernyataan di luar blok trycatch");
  }
}