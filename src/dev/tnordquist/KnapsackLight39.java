package dev.tnordquist;

public class KnapsackLight39 {

  static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {

    if (weight1 > maxW && weight2 > maxW) {
      return 0;
    } else if ((weight1 + weight2) <= maxW) {
      return value1 + value2;

    } else if ((weight1 + weight2) > maxW && weight1 <= maxW && weight2 > maxW) {
      return value1;
    } else if ((weight1 + weight2) > maxW && weight2 <= maxW && weight1 > maxW) {
      return value2;
    } else {
      return Math.max(value1, value2);
    }
  }

  public static void main(String[] args) {
    System.out.println(knapsackLight(10,5,6,4,8));
  }
}
