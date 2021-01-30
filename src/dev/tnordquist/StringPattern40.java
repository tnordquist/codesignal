package dev.tnordquist;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPattern40 {

  /**
   * For inputString = "123aa1", the output should be longestDigitsPrefix(inputString) = "123"
   * <p>
   * Input: inputString: "  3) always check for whitespaces" Expected Output: ""
   * <p>
   * Input: inputString: "the output is 42" Expected Output: ""
   *
   * @param inputString
   * @return
   */
  static String longestDigitsPrefix2(String inputString) {
    String[] splitArr = inputString.split("");
    String result = "";
    for (String letter : splitArr) {
      if (letter.matches("\\d")) {
        result += letter;
      } else {
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(longestDigitsPrefix2("0123456789"));
  }

}
