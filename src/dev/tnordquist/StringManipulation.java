package dev.tnordquist;

public class StringManipulation {

  static String alphabeticShift(String inputString) {

    return new String((inputString.chars().map((c) -> (c - 'a' + 1) % 26 + 'a').toArray()), 0,
        inputString.length());

  }

  static String alphabeticShift2(String inputString) {
    char[] chArr = inputString.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char let : chArr) {
      if (let != 'z') {
        sb.append(++let);
      } else {
        sb.append('a');
      }
    }
    return sb.toString();
  }



  public static void main(String[] args) {
    long startTime = System.nanoTime();
    System.out.println(alphabeticShift("crazy"));
    long endTime = System.nanoTime();
    System.out.println((endTime - startTime));  //divide by 1000000 to get milliseconds.

    System.out.println();

    long startTime2 = System.nanoTime();
    System.out.println(alphabeticShift2("crazy"));
    long endTime2 = System.nanoTime();
    System.out.println((endTime2 - startTime2));  //divide by 1000000 to get milliseconds.
  }

}
