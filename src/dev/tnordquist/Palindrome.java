package dev.tnordquist;

public class Palindrome {

  static boolean palindromeRearranging(String str) {
    char[] strArr;
    int isEven = 0;
    int unique = 0;
    do {
      strArr = str.toCharArray();
      char ch = strArr[0];
      int count = 1;
      unique++;
      for (int i = 1; i < strArr.length; i++) {
        if (ch == strArr[i]) {
          count++;
        }
      }
      if (count % 2 == 0) {
        isEven++;
      }
      // replace all occurrence of the character
      // which is already counted
      str = str.replace("" + ch, "");
      // If string is of length 0 then come
      // out of the loop
      if (str.length() == 0) {
        break;
      }
    } while (strArr.length > 1);

    if (isEven >= (unique - 1)) {
      return true;
    }
    return false;
  }

  static boolean palindromeRearranging2(String inputString) {
    int map = 0;
    for(int i=0; i<inputString.length(); i++) {
      map ^= 1 << (inputString.charAt(i) - 'a');
    }
    return map == 0 || (map & -map) == map;
  }

  public static void main(String[] args) {
    System.out.println(palindromeRearranging2("abcab"));
  }
}
