import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Q4Test {

    @Test
    public void findWinnerTest() {
        //given
        Optional<Character> empty = Optional.empty();
        Optional<Character> x = Optional.of('x');
        Optional<Character> o = Optional.of('o');

        Q4 q4 = new Q4();
        List<Optional> horizontal = new ArrayList<>();
        q4.horizontal.add(x);
        q4.horizontal.add(x);
        q4.horizontal.add(x);

        q4.horizontal.add(x);
        q4.horizontal.add(x);
        q4.horizontal.add(x);

        q4.horizontal.add(x);
        q4.horizontal.add(x);
        q4.horizontal.add(x);

        assertEquals("No one won", q4.findWinner(horizontal));
    }

}