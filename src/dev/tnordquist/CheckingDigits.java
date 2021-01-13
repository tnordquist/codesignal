package dev.tnordquist;

public class CheckingDigits {

  boolean evenDigitsOnly(int n) {

    while(n != 0) {
      int digit = n % 10;
      if(digit % 2 != 0) {
        return false;
      }
      n /= 10;
    }
    return true;
  }


  static boolean evenDigitsOnly2(int n) {
    return (n + "").matches("[02468]+");
  }

  public static void main(String[] args) {
    System.out.println(evenDigitsOnly2(5468428));
  }

}
