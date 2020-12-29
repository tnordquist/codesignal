package dev.tnordquist;

public class ArrayIncreases {

  static int arrayChange(int[] inputArray) {
    int count = 0;
    int i = 0;
    while (i < inputArray.length - 1) {
      if (inputArray[i + 1] <= inputArray[i]) {
        inputArray[i + 1]++;
        count++;
      } else {
        i++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(arrayChange(new int[]{2, 1, 10, 1}));
  }
}
