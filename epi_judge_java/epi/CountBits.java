package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class CountBits {
  @EpiTest(testDataFile = "count_bits.tsv")

  //Program to count number of bits set to 1 in a non-negative integer
  public static short countBits(int x) {

    short numBits = 0;

    while (x != 0) {
      //Using AND operation with 1 to count LSB in each pass,
      //and then shifting right to move on to next bit
      numBits += x & 1;
      x >>>= 1;
    }

    return numBits;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "CountBits.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
