import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q3Test {

    @Test
    public void shouldFindPointOfIntersection() {
        //given
        int[] l1s = {-4, -5};
        int[] l1e = {5, 4};
        int[] l2s = {-5, 0};
        int[] l2e = {5, -0};
        //when
        int[] expected = {1, 0};
        //then
        Assertions.assertArrayEquals(expected, Q3.findPointOfIntersection(l1s, l1e, l2s, l2e));
    }
}
