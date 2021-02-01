package dev.tnordquist;

public class BishopAndPawn42 {

  static boolean bishopAndPawn(String bishop, String pawn) {

    char[] bishChar = bishop.toCharArray();
    char[] pawnChar = pawn.toCharArray();
    int convert_l = (int) 'a' - 1;
    int col_bish = bishChar[0]- convert_l;
    int col_pawn = pawnChar[0] - convert_l;
    return Math.abs(col_bish - col_pawn) == Math.abs(bishChar[1] - pawnChar[1]);
  }

  static boolean bishopAndPawn2(String bishop, String pawn) {

    char[] bishChar = bishop.toCharArray();
    char[] pawnChar = pawn.toCharArray();
    return Math.abs(bishChar[0]-pawnChar[0]) == Math.abs(bishChar[1] - pawnChar[1]);
  }

  static boolean bishopAndPawn3(String bishop, String pawn) {

    return Math.abs(bishop.charAt(0)-pawn.charAt(0)) == Math.abs(bishop.charAt(1) - pawn.charAt(1));
  }

  public static void main(String[] args) {
    System.out.println(bishopAndPawn3("h1", "h3"));
  }
}
