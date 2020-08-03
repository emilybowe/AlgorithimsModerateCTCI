import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class Q6Test {

    Q6 q6;
    List<Integer> array1;
    List<Integer> array2;

    @BeforeEach
    public void init() {
        q6 = new Q6();
        array1 = new ArrayList<>();
        array2 = new ArrayList<>();
    }

    @Test
    public void smallestDifferenceTest() {
        //given
        array1.add(1);
        array1.add(3);
        array1.add(15);
        array1.add(11);
        array1.add(2);

        array2.add(23);
        array2.add(127);
        array2.add(235);
        array2.add(19);
        array2.add(8);

        //when
        //then
        Assertions.assertEquals(3, q6.smallestDifference(array1,array2));
    }
}