package dev.tnordquist;

import java.util.Map;
import java.util.TreeMap;

public class StringCharacterComparison43 {

  /**
   * A string is said to be beautiful if each letter in the string appears at most as many times as
   * the previous letter in the alphabet within the string; ie: b occurs no more times than a; c
   * occurs no more times than b; etc. Note that letter a has no previous letter.
   *
   * @param inputString the string to be checked
   * @return true if fits the conditions of "beautiful".
   */
  static boolean isBeautifulString(String inputString) {
    char[] charArr = inputString.toCharArray();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    Map<Character, Integer> map = new TreeMap<>();
    for (char lett : alphabet) {
      map.put(lett, 0);
    }

    for (char key : charArr) {
      map.put(key, map.get(key) + 1);
    }

    for (int lett = 97; lett < 123; lett++) {
      int firstVal = map.get((char) lett);
      int secVal = map.get((char) (lett + 1));
      if (firstVal < secVal) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isBeautifulString("zyy"));
  }
}
