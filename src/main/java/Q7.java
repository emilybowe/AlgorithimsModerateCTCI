import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q7 {

    public int findMaximum(int number1, int number2) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(number1);
        numberList.add(number2);
        Collections.reverse(numberList);
        return numberList.get(0);
    }
}
