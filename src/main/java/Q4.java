import java.util.List;

public class Q4 {

    private static final int EMPTY = 0;
    private static final int X = 1;
    private static final int O = 2;

    private int centre;

    private static final String WINNER_PHRASE = "The winner is ";
    private static final String NO_WINNER_PHRASE = "No winner";
    private static final String CENTRE_EMPTY_PHRASE = "Centre is empty";

    private int[][] ticTacToeArray = new int[3][3];

    public String findWinner(List<Integer> resultsArrayForAssessment) {
        validateInput(resultsArrayForAssessment);
        setup(resultsArrayForAssessment);
        return clarifyOutputMessage(checkService());
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

    private boolean validateInput2(List<Integer> resultsArrayForAssessment) {
        if(validateArraySize(resultsArrayForAssessment) && validateArrayInputType(resultsArrayForAssessment)) {
                return true;
        }else throw new IllegalArgumentException("Arrays must be of correct size and data type");
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
        resultsArrayForAssessment.add( ticTacToeArray[0][0]);
        resultsArrayForAssessment.add( ticTacToeArray[0][1]);
        resultsArrayForAssessment.add( ticTacToeArray[0][2]);
        resultsArrayForAssessment.add( ticTacToeArray[1][0]);
        resultsArrayForAssessment.add( ticTacToeArray[1][1]);
        resultsArrayForAssessment.add( ticTacToeArray[1][2]);
        resultsArrayForAssessment.add( ticTacToeArray[2][0]);
        resultsArrayForAssessment.add( ticTacToeArray[2][1]);
        resultsArrayForAssessment.add( ticTacToeArray[2][2]);
    }

    private void setCentreVariable() {
        centre = ticTacToeArray[1][1];
    }

    private String formatFinalOutput(String checkServiceOutput) {
        if (checkServiceOutput.equals(WINNER_PHRASE + X)){
            return WINNER_PHRASE + "x";
        }
        if (checkServiceOutput.equals(WINNER_PHRASE + O)) {
            return WINNER_PHRASE + "o";
        }else return checkServiceOutput;
    }

    private String checkService() {
        if(checkForWinnerByCentre().equals(WINNER_PHRASE + X)||checkForWinnerByCentre().equals(WINNER_PHRASE + O)){
            return checkForWinnerByCentre();
        }
        if(checkForWinnerByCentre().equals(NO_WINNER_PHRASE + X)||checkForWinnerByCentre().equals(NO_WINNER_PHRASE + O)) {
            return checkOutside();
        }
        if (checkForWinnerByCentre().equals(CENTRE_EMPTY_PHRASE)) {
            return checkOutside();
        }else return "error - should return winner/no winner/empty ";
    }

    private String checkForWinnerByCentre() {
        if (centre == X || centre == O) {
            return (checkCentre(centre) + centre);
        }else if (centre == EMPTY) {
            return CENTRE_EMPTY_PHRASE;
        }else return "error - centre should contain x/o/empty";
    }

    private String checkCentre(int centre) {
        if (ticTacToeArray[0][0] == centre && ticTacToeArray[2][2] == centre) {
            return WINNER_PHRASE;
        }else if(ticTacToeArray[0][2] == centre && ticTacToeArray[2][0] == centre) {
            return WINNER_PHRASE;
        }else if (ticTacToeArray[0][1] == centre && ticTacToeArray[2][1] == centre) {
            return WINNER_PHRASE;
        }else if (ticTacToeArray[1][0] == centre && ticTacToeArray[1][2] == centre) {
            return WINNER_PHRASE;
        }else return NO_WINNER_PHRASE;
    }

    private String checkOutside() {
        if (ticTacToeArray[0][0] == ticTacToeArray[0][1] && ticTacToeArray[0][1]  == ticTacToeArray[0][2] ) {
            return WINNER_PHRASE;
        }else if(ticTacToeArray[0][0] == ticTacToeArray[1][0] && ticTacToeArray[1][0]  == ticTacToeArray[2][0] ) {
            return WINNER_PHRASE;
        }else if (ticTacToeArray[2][0] == ticTacToeArray[2][1] && ticTacToeArray[2][1]  == ticTacToeArray[2][2] ) {
            return WINNER_PHRASE;
        }else if (ticTacToeArray[0][2] == ticTacToeArray[1][2] && ticTacToeArray[1][2]  == ticTacToeArray[2][2] ) {
            return WINNER_PHRASE;
        }else return NO_WINNER_PHRASE;
    }
}












