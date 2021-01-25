package dev.tnordquist;

import java.util.stream.Stream;

public class CharDigit {

  char firstDigit(String inputString) {
    char[] aNum = inputString.toCharArray();
    char theNum = 48;
    for (int i = 0; i < inputString.length(); ++i) {
      if (aNum[i] >= 48 && aNum[i] <= 57) {
        theNum = aNum[i];
        break;
      }
    }
    return theNum;
  }

  static char firstDigitStreamed(String inputString) {

    Stream<String> strStream = Stream.of(inputString);
    return (char) inputString.chars().parallel().filter(charac -> (charac >= 0 && charac <=9)).findFirst().orElse(0);
  }

  public static void main(String[] args) {
    System.out.println(firstDigitStreamed("q2q-q"));
  }
}