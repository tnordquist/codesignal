package dev.tnordquist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompareArrays {

  private static boolean areSimilar(int[] a, int[] b) {

    int mark = -1;
    int grace = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i] && mark > -1) {
        if (a[i] != b[mark] || b[i] != a[mark]) {
          return false;
        } else if (a[i] == b[mark] && b[i] == a[mark] && ++grace > 1) {
          return false;
        }
      } else if (a[i] != b[i]) {
        mark = i;
      }
    }
    return true;
  }


  static boolean chessBoardCellColor(String cell1, String cell2) {

    char[] char1 = cell1.toCharArray();
    char[] char2 = cell2.toCharArray();
    boolean oneDark = false;
    boolean twoDark = false;

    if ((char1[0] % 2 != 0 && char1[1] % 2 != 0)
        || (char1[0] % 2 == 0 && char1[1] % 2 == 0)) {
      oneDark = true;
    }

    if ((char2[0] % 2 != 0 && char2[1] % 2 != 0)
        || (char2[0] % 2 == 0 && char2[1] % 2 == 0)) {
      twoDark = true;
    }
    return oneDark == twoDark;
  }

  static boolean chessBoardCellColor2(String cell1, String cell2) {

    char[] char1 = cell1.toCharArray();
    char[] char2 = cell2.toCharArray();
    return Math.abs(char1[0] - char2[0]) % 2 == Math.abs(char1[1] - char2[1]) % 2;

  }

//  String[] strList1 = str1.split(" ");
//  String[] strList2 = str2.split(" ");
//
//  List<String> list1 = Arrays.asList(strList1);
//  List<String> list2 = Arrays.asList(strList2);
//
//  // Prepare a union
//  List<String> union = new ArrayList<>(list1);
//    union.addAll(list2);
//
//  // Prepare an intersection
//  List<String> intersection = new ArrayList<>(list1);
//    intersection.retainAll(list2);
//
//  // Subtract the intersection from the union
//    union.removeAll(intersection);
//
//    for (String s : union) {
//    System.out.println(s);
//  }

  /**
   * Given an array of equal-length strings, you'd like to know if it's possible to rearrange the
   * order of the elements in such a way that each consecutive pair of strings differ by exactly one
   * character.
   *
   * @param inputArray of equal-length strings
   * @return true if it's possible, and false if not.
   */
  static Set<Map<Character, Integer>> stringsRearrangement(String[] inputArray) {

    Set<Map<Character, Integer>> set = new HashSet<>();
    for (String str : inputArray) {
      char[] charArr = str.toCharArray();
      Map<Character, Integer> charMap = new HashMap<>();
      for (char letter : charArr) {
        if (charMap.containsKey(letter)) {
          charMap.put(letter, charMap.get(letter) + 1);
        } else {
          charMap.put(letter, 1);
        }
      }
      set.add(charMap);
    }
    return set;
  }

  static boolean stringsRearrangement2(String[] inputArray) {
    LinkedList<String> tries = loadStrings(inputArray);
    LinkedList<String> matches = new LinkedList<String>();
    matches.offer(tries.poll());
    int len = matches.getFirst().length();
    while (!tries.isEmpty()) {
      int numOfTries = tries.size();
      String first = matches.getFirst();
      String last = matches.getLast();
      for (int t = 0; t < numOfTries; t++) {
        String actual = tries.poll();
        if (exactOneDiff(first, actual, len)) {
          matches.addFirst(actual);
          break;
        } else if (exactOneDiff(last, actual, len)) {
          matches.addLast(actual);
          break;
        } else {
          tries.offer(actual);
        }
      }
      if (numOfTries == tries.size()) {
        return false;
      }
    }
    return true;

  }

  static boolean exactOneDiff(String target, String actual, int len) {

    int diff = 0;
    for (int ch = 0; ch < len; ch++) {
      if (target.charAt(ch) != actual.charAt(ch)) {
        diff++;
      }
    }
    return diff == 1;
  }

  static LinkedList<String> loadStrings(String[] in) {
    LinkedList<String> temp = new LinkedList<String>();
    for (String str : in) {
      temp.offer(str);
    }
    return temp;
  }

  public static void main(String[] args) {
//    System.out.println(areSimilar(new int[]{2, 3, 1},
//        new int[]{1, 3, 2}));

//    long startTime = System.nanoTime();
//    System.out.println(chessBoardCellColor("A1", "B2"));
//    long endTime = System.nanoTime();
//    System.out.println((endTime - startTime));  //divide by 1000000 to get milliseconds.
//
//    long startTime2 = System.nanoTime();
//    System.out.println(chessBoardCellColor2("A1", "B2"));
//    long endTime2 = System.nanoTime();
//    System.out.println((endTime2 - startTime2));  //divide by 1000000 to get milliseconds.

    System.out.println(stringsRearrangement2(new String[]{"abc",
        "abx",
        "axx",
        "abc"}));
  }

}
