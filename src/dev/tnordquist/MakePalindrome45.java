package dev.tnordquist;

public class MakePalindrome45 {

  static String buildPalindrome(String str) {

    String thePalindrome = "";

    if(isPalidrome(str)){
      return str;
    }

    for (int end = 1; end < str.length(); end++) {
      String testStr = str.substring(0, end);
      StringBuilder subSb = new StringBuilder(testStr);
      subSb.reverse();
      String isPal = str + subSb;
      if(isPalidrome(isPal)) {
        thePalindrome = isPal;
        break;
      }
    }
    return thePalindrome;
  }

  static boolean isPalidrome(String str) {
    int front = 0;
    int end = str.length() - 1;
    while (front <= end) {
      if (str.charAt(front) != str.charAt(end)) {
        return false;
      }
      front++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(buildPalindrome("abba"));
  }
}
