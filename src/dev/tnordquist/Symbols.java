package dev.tnordquist;

import java.util.HashSet;
import java.util.Set;
public class Symbols {

  static int differentSymbolsNaive(String s) {
    char[] charArr = s.toCharArray();
    Set<Character> set = new HashSet<>();
    for (char ch: charArr) {
      set.add(ch);
    }
    return set.size();
  }

  static int differentSymbolsNaive2(String s) {
    return (int) s.chars().distinct().count();
  }

  public static void main(String[] args) {
    System.out.println(differentSymbolsNaive2("cabca"));
  }
}
