import java.util.List;

public class Q4 {
    private static final int NO_WINNER = -1;
    private static final int X = 1;
    private static final int O = 2;
    private int centre ;

    private static final String WINNER_PHRASE = "The winner is ";
    private static final String NO_WINNER_PHRASE = "No winner";

    private final int[][] ticTacToeArray = new int[3][3];

    public String findWinner(List<Integer> resultsArrayForAssessment) {
        validateInput(resultsArrayForAssessment);
        setup(resultsArrayForAssessment);
        return formatMessage();
    }

    private boolean validateInput(List<Integer> resultsArrayForAssessment) {
        try {
            if(validateArraySize(resultsArrayForAssessment) && validateArrayInputType(resultsArrayForAssessment)) {
                return true;
            }
        }catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
        return false;
    }

    private boolean validateArraySize(List<Integer> resultsArrayForAssessment) {
        return resultsArrayForAssessment.size() == 9;
    }

    private boolean validateArrayInputType(List<Integer> resultsArrayForAssessment) {
        return resultsArrayForAssessment.stream()
                .anyMatch(n -> (n instanceof Integer));
    }

    private void setup(List<Integer> resultsArrayForAssessment) {
        populateTicTacToeArray(resultsArrayForAssessment);
        setCentreVariable();
    }

    private void populateTicTacToeArray(List<Integer> resultsArrayForAssessment) {
        ticTacToeArray[0][0] = resultsArrayForAssessment.get(0);
        ticTacToeArray[0][1] = resultsArrayForAssessment.get(1);
        ticTacToeArray[0][2] = resultsArrayForAssessment.get(2);
        ticTacToeArray[1][0] = resultsArrayForAssessment.get(3);
        ticTacToeArray[1][1] = resultsArrayForAssessment.get(4);
        ticTacToeArray[1][2] = resultsArrayForAssessment.get(5);
        ticTacToeArray[2][0] = resultsArrayForAssessment.get(6);
        ticTacToeArray[2][1] = resultsArrayForAssessment.get(7);
        ticTacToeArray[2][2] = resultsArrayForAssessment.get(8);
    }

    private void setCentreVariable() {
        centre = ticTacToeArray[1][1];
    }

    private String formatMessage() {
        int checkForWinnerInRemainingRowsResult = checkForWinnerInRemainingRows();
        if (checkForWinnerFirstUsingCentre()) {
            if (centre == 1) {
                return WINNER_PHRASE + "X";
            }else if(centre == 2) {
                return WINNER_PHRASE + "O";
            }
        }else if (checkForWinnerInRemainingRowsResult == 1) {
            return WINNER_PHRASE + "X";
        }else if(checkForWinnerInRemainingRowsResult == 2) {
                return WINNER_PHRASE + "O";
        }else {
            return NO_WINNER_PHRASE;
        }
        return NO_WINNER_PHRASE;
    }

    private boolean checkForWinnerFirstUsingCentre() {
        return (ticTacToeArray[0][0] == centre && ticTacToeArray[2][2] == centre) ||
                (ticTacToeArray[0][2] == centre && ticTacToeArray[2][0] == centre) ||
                (ticTacToeArray[0][1] == centre && ticTacToeArray[2][1] == centre) ||
                (ticTacToeArray[1][0] == centre && ticTacToeArray[1][2] == centre);
    }

    private int checkForWinnerInRemainingRows() {
        if(checkRemainingRows(X)) {
            return X;
        }else if (checkRemainingRows(O)) {
            return O;
        }
        else return NO_WINNER;
    }

    private boolean checkRemainingRows (int checker) {
        return  ((ticTacToeArray[0][0] == ticTacToeArray[0][1] && ticTacToeArray[0][1] == ticTacToeArray[0][2]
                        && ticTacToeArray[0][2] == checker) ||
                (ticTacToeArray[0][0] == ticTacToeArray[1][0] && ticTacToeArray[1][0] == ticTacToeArray[2][0]
                        && ticTacToeArray[2][0] == checker) ||
                (ticTacToeArray[2][0] == ticTacToeArray[2][1] && ticTacToeArray[2][1] == ticTacToeArray[2][2]
                        && ticTacToeArray[2][2] == checker) ||
                (ticTacToeArray[0][2] == ticTacToeArray[1][2] && ticTacToeArray[1][2] == ticTacToeArray[2][2]
                        && ticTacToeArray[2][2] == checker));
    }
}