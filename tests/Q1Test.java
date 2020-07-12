import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @Test
    public void swapTwoNumbers() {
        //given
        int x = 1;
        int y = 2;
        int[] swapped = {2, 1};
        //when
        Q1.swap(x, y);
        //then
        assertNotNull(x);
        assertNotNull(y);
       assertArrayEquals(swapped, Q1.swap(x, y));
    }

}