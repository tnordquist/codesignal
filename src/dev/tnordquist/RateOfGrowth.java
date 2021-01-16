package dev.tnordquist;

public class RateOfGrowth {

  static int depositProfit(int deposit, int rate, int threshold) {

      double accum = deposit;
      int count = 0;
      while(accum < threshold) {
        accum = accum * (1 + (rate / 100.0));
        count++;
      }
      return count;
  }


 static int depositProfit2(int deposit, int rate, int threshold) {
    return (int)Math.ceil(Math.log((double)threshold / deposit) / Math.log(1 + (rate / 100.0)));
  }

  public static void main(String[] args) {
    System.out.println(depositProfit2(100, 1, 101));
  }

}
