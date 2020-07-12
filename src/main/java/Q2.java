import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.counting;


public class Q2 {

    public static long checkFrequency(List<String> book, String word) {

       long frequency =
               book.stream()
               .filter(b -> b == word)
                       .collect(counting());

        return frequency;
    }

}
