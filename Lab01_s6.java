// Julien Diamond
// done independently of partner

import java.util.function.Function;

public class Lab01_s6 {
  public static void main(String[] args) {
    // functional interface
    Function<Character[], Character> funcMaxCharInArr = (Character[] arr) -> {
      Character max = arr[0];
      for (int i = 1; i < arr.length; i++) {
        if (arr[i].compareTo(max) > 0) max = arr[i];
      }
      return max;
    };

    // create example charArray
    Character[] charArray = {'H','E','L', 'L', 'O'};

    // apply
    System.out.println(funcMaxCharInArr.apply(charArray));
  }
}
