import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class Q4 {
    Deque<Optional> ticTacToeDeque = new ArrayDeque<>();

    Optional a = ticTacToeDeque.pop();
    Optional b = ticTacToeDeque.pop();
    Optional c = ticTacToeDeque.pop();

    public String findWinner(Optional[] resultsArray) {
        populateDeque(resultsArray);
        return checkForWinner();
    }

    public void populateDeque(Optional[] resultsArray) {
        for (Optional letter : resultsArray) {
            ticTacToeDeque.add(letter);
        }
    }

    public String checkForWinner() {
        {
            if (a.equals(b) && b.equals(c)) {
                return ("The winner is: " + a);
            } else {
                popNextThree();
            }
        }while (!ticTacToeDeque.isEmpty());
        return ("No one won");
    }

    public void popNextThree() {
        Optional a = ticTacToeDeque.pop();
        Optional b = ticTacToeDeque.pop();
        Optional c = ticTacToeDeque.pop();
    }
}












