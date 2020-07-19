public class Q4 {

    private int empty = 0;
    private int x = 1;
    private int o = 2;
    private int centre;
    private String winnerPhrase = "The winner is ";
    private String noWinnerPhrase = "No winner";
    private String centreEmptyPhrase = "Centre is empty";

    private int getX() {
        return x;
    }
    private int getO() {
        return o;
    }
    private int getEmpty() {
        return empty;
    }
    private int getCentre() {
        return centre;
    }

    private int[][] ticTacToeArray = new int[3][3];

    public String findWinner(int[] resultsArrayForAssessment) {
        setup(resultsArrayForAssessment);
        return checkService();
    }

    private void setup(int[] resultsArrayForAssessment) {
        populateTicTacToeArray(resultsArrayForAssessment);
        setCentreVariable();
    }
    private void populateTicTacToeArray(int[] resultsArrayForAssessment) {
        ticTacToeArray[0][0] = resultsArrayForAssessment[0];
        ticTacToeArray[0][1] = resultsArrayForAssessment[1];
        ticTacToeArray[0][2] = resultsArrayForAssessment[2];
        ticTacToeArray[1][0] = resultsArrayForAssessment[3];
        ticTacToeArray[1][1] = resultsArrayForAssessment[4];
        ticTacToeArray[1][2] = resultsArrayForAssessment[5];
        ticTacToeArray[2][0] = resultsArrayForAssessment[6];
        ticTacToeArray[2][1] = resultsArrayForAssessment[7];
        ticTacToeArray[2][2] = resultsArrayForAssessment[8];
    }
    private void setCentreVariable() {
        centre = ticTacToeArray[1][1];
    }

    private String checkService() {
        if(checkForWinnerByCentre().equals(winnerPhrase + getX())||checkForWinnerByCentre().equals(winnerPhrase + getO())){
            return checkForWinnerByCentre();
        }
        if(checkForWinnerByCentre().equals(noWinnerPhrase + getX())||checkForWinnerByCentre().equals(noWinnerPhrase + getO())) {
            return checkOutside();
        }
        if (checkForWinnerByCentre().equals(centreEmptyPhrase)) {
            return checkOutside();
        }
        else return "error - should return winner/no winner/empty ";
    }

    private String checkForWinnerByCentre() {
        if (getCentre() == getX() || getCentre() == getO()) {
            return (checkCentre(getCentre()) + centre);
        }
        else if (getCentre() == getEmpty()) {
            return centreEmptyPhrase;
        }
        else return "error - centre should contain x/o/empty";
    }

    private String checkCentre(int centre) {
        if (ticTacToeArray[0][0] == centre && ticTacToeArray[2][2] == centre) {
            return winnerPhrase;
        }
        else if(ticTacToeArray[0][2] == centre && ticTacToeArray[2][0] == centre) {
            return winnerPhrase;
        }
        else if (ticTacToeArray[0][1] == centre && ticTacToeArray[2][1] == centre) {
            return winnerPhrase;
        }
        else if (ticTacToeArray[1][0] == centre && ticTacToeArray[1][2] == centre) {
            return winnerPhrase;
        }
        else return noWinnerPhrase;
    }

    private String checkOutside() {
        if (ticTacToeArray[0][0] == ticTacToeArray[0][1] && ticTacToeArray[0][1]  == ticTacToeArray[0][2] ) {
            return winnerPhrase;
        }
        else if(ticTacToeArray[0][0] == ticTacToeArray[1][0] && ticTacToeArray[1][0]  == ticTacToeArray[2][0] ) {
            return winnerPhrase;
        }
        else if (ticTacToeArray[2][0] == ticTacToeArray[2][1] && ticTacToeArray[2][1]  == ticTacToeArray[2][2] ) {
            return winnerPhrase;
        }
        else if (ticTacToeArray[0][2] == ticTacToeArray[1][2] && ticTacToeArray[1][2]  == ticTacToeArray[2][2] ) {
            return winnerPhrase;
        }
        else return noWinnerPhrase;
    }
}












