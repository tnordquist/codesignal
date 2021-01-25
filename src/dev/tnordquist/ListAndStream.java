package dev.tnordquist;

import java.util.List;
import java.util.stream.Collectors;

public class ListAndStream {

  public List<String> upperCase(List<String> list) {

    return list.stream()
        .map(s -> s.toUpperCase())
        .collect(Collectors.toList());
  }
}
