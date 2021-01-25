package dev.tnordquist;

import java.util.Arrays;
import java.util.LinkedList;

public class ArrayValueSubstitution {

  /**
   * Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem
   */
  /*int[] arrayReplace1(int[] inputArray, int elemToReplace, int substitutionElem) {
    int[] replaceArr = Arrays.copyOf(inputArray, inputArray.length);
    for (int i = 0; i < inputArray.length; ++i) {
      if (inputArray[i] == elemToReplace) {
        replaceArr[i] = substitutionElem;
      }
    }
    return replaceArr;
  }*/

  /*static int[] arrayReplace2(int[] inputArray, int elemToReplace, int substitutionElem) {
    return Arrays.stream(inputArray)
        .map((operand) -> operand == elemToReplace ? substitutionElem : operand)
        .toArray();
  }*/
  static int[] extractEachKth(int[] inputArray, int k) {
    LinkedList<Integer> newList = new LinkedList<>();

    for (int i = 0; i < inputArray.length; ++i) {
      int peekNum = inputArray[i];
      if ((i+1)%k!=0) {
        newList.add(peekNum);
      }
    }

    int[] arr = newList.stream()
        .mapToInt(i -> i).toArray();
    return arr;
  }

  static LinkedList<Integer> loadInts(int[] in) {
    LinkedList<Integer> temp = new LinkedList<Integer>();
    for (int num : in) {
      temp.offer(num);
    }
    return temp;
  }

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(extractEachKth((new int[]{2, 4, 6, 8, 10}), 2)));
  }
}

