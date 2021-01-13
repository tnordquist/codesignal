package dev.tnordquist;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayValueSubstitution {

  /**
   * Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem
   *
   * @param inputArray
   * @param elemToReplace
   * @param substitutionElem
   * @return int[] array modified version of the original array.
   */
  int[] arrayReplace1(int[] inputArray, int elemToReplace, int substitutionElem) {
    int[] replaceArr = Arrays.copyOf(inputArray, inputArray.length);
    for (int i = 0; i < inputArray.length; ++i) {
      if (inputArray[i] == elemToReplace) {
        replaceArr[i] = substitutionElem;
      }
    }
    return replaceArr;
  }

  static int[] arrayReplace2(int[] inputArray, int elemToReplace, int substitutionElem) {
    return Arrays.stream(inputArray)
        .map((operand) -> operand == elemToReplace ? substitutionElem : operand)
        .toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(arrayReplace2(new int[]{1, 2, 1, 2, 1}, 2, 2)));
  }

}
