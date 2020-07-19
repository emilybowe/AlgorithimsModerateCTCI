import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Q4Test {

    /*Assumptions
    assume always 3x3
    assume given a completed board to check
    given what is in the centre of TicTacToe is then in several lines, check these first
     */

    @Test
    public void xShouldWinOnDiagonalTest() {
        //given
        int[] resultsArrayForAssessment = {1, 2, 1, 2, 1, 0, 2, 0, 1};
        //when
        Q4 q4 = new Q4();
        //then
        Assertions.assertEquals("The winner is x", q4.findWinner(resultsArrayForAssessment));

    }

}