package dev.tnordquist;

public class MaxValInArr {

  static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int max = Integer.MIN_VALUE;
    int sum = max;
    for (int i = 0; i < inputArray.length - k+1; i++) {
      sum = 0;
      for (int j = i; j < k + i; j++) {
        sum += inputArray[j];
      }
      if (sum > max) {
        max = sum;

      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(arrayMaxConsecutiveSum(new int[]{1, 3, 2, 4}, 3));
  }
}
