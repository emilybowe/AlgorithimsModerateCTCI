public class Q4 {

    private int empty = 0;
    private int x = 1;
    private int o = 2;
    private int centre;

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

    public void findWinner(int[] resultsArrayForAssessment) {
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

    private String checkForWinnerByCentre() {
        if (getCentre() == getX()) {
            return (checkCentre(getCentre()) + centre);
        }
        else if(getCentre() == getO()) {
            return (checkCentre(getCentre()) + centre);
        }
        else if (getCentre() == getEmpty()) {
            return "centre is empty";
        }
        else return "error";
    }

    private String checkCentre(int centre) {
        if (ticTacToeArray[0][0] == centre && ticTacToeArray[2][2] == centre) {
            return "The winner is ";
        }
        else if(ticTacToeArray[0][2] == centre && ticTacToeArray[2][0] == centre) {
            return "The winner is ";
        }
        else if (ticTacToeArray[0][1] == centre && ticTacToeArray[2][1] == centre) {
            return "The winner is ";
        }
        else if (ticTacToeArray[1][0] == centre && ticTacToeArray[1][2] == centre) {
            return "The winner is ";
        }
        else return "need to check rest of board";
    }
}












