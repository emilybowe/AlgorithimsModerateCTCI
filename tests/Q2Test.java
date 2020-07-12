import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Q2Test {

    @Test
    public void shouldReturnFrequency() {
        //given
        List<String> sampleBook = new ArrayList<>();
        sampleBook.add("the");
        sampleBook.add("the");
        sampleBook.add("very");
        sampleBook.add("a");
        sampleBook.add("the");

        //when

        //then
        Assertions.assertEquals(3, Q2.checkFrequency(sampleBook, "the"));
    }
}
