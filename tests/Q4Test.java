import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;


class Q4Test {

    @Test
    public void findWinnerTest() {
        //given
        Optional<Character> e = Optional.empty();
        Optional<Character> o = Optional.of('o');
        Optional<Character> x = Optional.of('x');
        Optional[] resultsArray = {o, x, x, x, x, o, e, x, o, e, x, x, e, e, e, x, x, x, e, e, e, e, e, e};

        //when
        Q4 q4 = new Q4();

        //then
        Assertions.assertEquals("The winner is: x", q4.findWinner(resultsArray));
    }



}