public class Q1 {

    public static int[] swap(int x, int y) { //1, 2
        x = x + y; //1 + 2 = 3
        y = x - y; //3 - 2 = 1
        x = x - y; //3 - 1 = 2
        int[] answers = {x, y};
        return answers;
    }

}
