package dev.tnordquist;

public class Digits41 {

  /**
   * define digit degree of some positive integer as the number of times we need to replace this
   * number with the sum of its digits until we get to a one digit number.
   * <p>
   * Given an integer, find its digit degree.
   * <p>
   * Example
   * <p>
   * For n = 5, the output should be digitDegree(n) = 0; For n = 100, the output should be
   * digitDegree(n) = 1. 1 + 0 + 0 = 1. For n = 91, the output should be digitDegree(n) = 2. 9 + 1 =
   * 10 -> 1 + 0 = 1
   *
   * @param n
   * @return
   */
  static int digitDegree(int n) {
    int degree = 0;
    int sum = 0;
    if (n / 10 == 0) {
      return 0;
    }
    while (n != 0) {
      sum += n % 10;
      n /= 10;
      if (n == 0) {
        degree++;
        if (sum / 10 == 0) {
          return degree;
        } else {
          n = sum;
          sum = 0;
        }
      }
    }
    return degree;
  }

  /**
   * Recursive version
   * @param n
   * @return
   */
  static int digitDegree2(int n) {
    if (n / 10 == 0) {
      return 0;
    }
    int num = 0;
    while (n != 0) {
      num += n % 10;
      n /= 10;
    }
    return 1 + digitDegree(num);
  }

  public static void main(String[] args) {
    System.out.println(digitDegree2(91));
  }
}
