import java.util.List;
import java.util.Optional;

public class Q4 {
    List<Optional> ticTacToeResults;

    public static Optional<String> findWinner(List<Optional> ticTacToeResults) {
        if (check(ticTacToeResults, 0, 3).equals("error")) {
            if (check(ticTacToeResults, 3, 6).equals("error")) {
                if (check(ticTacToeResults, 6, 9).equals("error")) {

                } else return check(ticTacToeResults, 6, 9);
            } else return check(ticTacToeResults, 3, 6);
        }
        return check(ticTacToeResults, 0, 3);
    }
    public static Optional<String> check(List<Optional> ticTacToeResults, int lowerBound, int upperBound) {
        int xCount = 0;
        int oCount = 0;
        for (int i = lowerBound; i < upperBound; i++) {
            if (ticTacToeResults.get(i).equals(Optional.of("x"))) {
                xCount += 1;
            }
            if (ticTacToeResults.get(i).equals(Optional.of("o"))) {
                oCount += 1;
            }
        }
        if(xCount == 3) return Optional.of("x");
        if(oCount == 3) return Optional.of("o");
        return Optional.of("error");
    }
}








