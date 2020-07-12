import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Q4Test {

    @Test
    public void findWinnerTest() {
        //given
        List<Optional> ticTacToeResults = new ArrayList<>();

        Optional<String> x = Optional.of("x");
        Optional<String> o = Optional.of("o");

        for(int i = 0; i < 2; i++) { //0, 1 = o
            ticTacToeResults.add(o);
        }

        for(int i = 2; i < 9; i++) { //2, 3, 4, 5, 6, 7, 8 = x
            ticTacToeResults.add(x);
        }

        //when
        Q4 q4 = new Q4();

        //then
        //Assertions.assertEquals(Optional.of("o"), ticTacToeResults.get(0));
        Assertions.assertEquals(Optional.of("x"), q4.findWinner(ticTacToeResults));
    }

}