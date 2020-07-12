public class Q3 {

    public static int[] findPointOfIntersection(int[] l1s, int[] l1e, int[] l2s, int[] l2e) {
        //y = mx + c
        // x = c2 - c1 / m1 - m2
        // m = y-y/x-x
        int ml1 = (l1e[1] - l1s[1])/(l1e[0] - l1s[0]);
        int ml2 = (l2e[1] - l2s[1])/(l2e[0] - l2s[0]);
        // y-mx = c
        int cl1 = l1e[1] - (ml1)*(l1e[0]);
        int cl2 = l2e[1] - (ml2)*(l2e[0]);
        // x = c2 - c1 / m1 - m2

        int x = (cl2 - cl1) / (ml1 - ml2);
        int y = ml1 + cl1;

        int[] pointOfIntersection = {x, y};

        return pointOfIntersection;
    }


}
