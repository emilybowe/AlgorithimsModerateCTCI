import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Q4 {

    private int xCount;
    private int oCount;
    int i_VALUES_FOR_ASSESSMENT = 0;
    List<Optional> horizontal = new ArrayList<>();

    public String findWinner(List<Optional> horizontal) {
        for(int i = 0; i < 2; i++) {
            if (checkResults().equals("No one won")) {
                Next();
            }
            else return checkResults();
        }
        return checkResults();
    }

    public int getxCount() {
        return xCount;
    }

    public int getoCount() {
        return oCount;
    }

    public String checkResults() {
        if (Assess(horizontal)) {
            if (getxCount() == 3) {
                return "X won";
            } else if (getoCount() == 3) {
                return "O won";
            }
        }
        return "No one won";
    }

    public boolean Assess (List<Optional> horizontal) {
        for (int i = i_VALUES_FOR_ASSESSMENT; i < i_VALUES_FOR_ASSESSMENT + 3; i++) {
            if (horizontal.get(i).equals('x')) {
                xCount += 1;
            } else if (horizontal.get(i).equals('o')) {
                oCount += 1;
            }
        }
        return xCount == 3 || oCount == 3;
    }

    public void Next () {
            i_VALUES_FOR_ASSESSMENT += 3;
    }

}






