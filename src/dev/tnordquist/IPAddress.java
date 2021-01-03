package dev.tnordquist;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

public class IPAddress {

  static boolean isIPv4Address(String inputString) {
//    final Pattern ADDRESS_VALIDATOR
//        = Pattern.compile("^((?!00)([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]).){3}\\b((?!00)([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]))$");
//    final Pattern ADDRESS_VALIDATOR
//        = Pattern.compile("^(?!00)([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]).{3}\\b((?!00)[0-9][0-9]?|2[0-4][0-9]|25[0-5])$");
// return inputString.matches("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
    final Pattern ADDRESS_VALIDATOR
        = Pattern.compile(
        "(?:(?:25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[1]?[0-9][0-9]?)");
    return (ADDRESS_VALIDATOR.matcher(inputString).matches());
  }

  static boolean isIPv4Address2(String inputString) {
    String[] split = inputString.split("[.]");
    if (split.length > 4) {
      return false;
    }
    for (String str : split) {
      if (str.isEmpty()) {
        return false;
      }
      if (!str.matches("[0-9]{1,3}")) {
        return false;
      }
      int number = Integer.parseInt(str);
      if (!(number >= 0 && number <= 255)) {
        return false;
      }
    }
    return true;
  }

  static boolean isIPv4Address3(String inputString) {
    String[] units = inputString.split("\\.");

    if (units.length != 4) {
      return false;
    }
    for (String unit : units) {
      if (unit.matches("[0][0-9]")) {
        return false;
      }
    }
    for (String j : units) {
      if (Integer.parseInt(j) < 0 || Integer.parseInt(j) > 255) {
        return false;
      }

    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isIPv4Address3("172.16.254.1"));
  }
}
