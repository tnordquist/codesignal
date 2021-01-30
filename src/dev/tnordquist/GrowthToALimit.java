package dev.tnordquist;

public class GrowthToALimit {

  static int growingPlant(int upSpeed, int downSpeed, int desiredHeight)
  {
    // The height after x days (up - down) * (x - 1) + up
    // We want dh <= (u - d) * (x - 1) + u
    // (dh - u) / (u - d) + 1 <= x
    return Math.max(0, (int) Math.ceil((double) (desiredHeight - upSpeed) / (upSpeed - downSpeed))) + 1;
  }

  public static void main(String[] args) {
    System.out.println(growingPlant(100, 10, 910));
  }

}
