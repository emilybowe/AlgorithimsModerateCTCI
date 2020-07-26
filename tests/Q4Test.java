import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class Q4Test {

    /*Assumptions/notes
    assume always 3x3
    assume given a completed board to check
    given what is in the centre of TicTacToe is then in several lines, check these first
     */

    private Q4 q4;

    @BeforeEach
    public void init() {
        q4 = new Q4();
    }

    @Test
    public void testFindWinner_whenXIsDiagonalWinner_shouldReturnTheWinnerIsX() {
        //given
        List<Integer> resultsArrayForAssessment = new ArrayList<>();
        resultsArrayForAssessment.add(1);
        resultsArrayForAssessment.add(2);
        resultsArrayForAssessment.add(1);
        resultsArrayForAssessment.add(2);
        resultsArrayForAssessment.add(1);
        resultsArrayForAssessment.add(0);
        resultsArrayForAssessment.add(2);
        resultsArrayForAssessment.add(0);
        resultsArrayForAssessment.add(1);
        //then
        Assertions.assertEquals("The winner is X", q4.findWinner(resultsArrayForAssessment));

    }

}