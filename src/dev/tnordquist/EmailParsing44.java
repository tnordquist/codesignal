package dev.tnordquist;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailParsing44 {

 static String findEmailDomain(String address) {
    String pattern = "(?<=@).*(?=\n)";
    Pattern r = Pattern.compile(pattern);
    Matcher m = r.matcher(address);
    return m.group();
  }

  static String findEmailDomain2(String address) {
    char[] domain = address.toCharArray();
    StringBuilder sb = new StringBuilder();
    int i = domain.length-1;
    while(domain[i] != '@') {
      sb.append(domain[i--]);
    }
    sb.reverse();
   return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(findEmailDomain2("someaddress@yandex.ru"));
  }
}