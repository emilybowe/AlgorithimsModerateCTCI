import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Q7Test {

    Q7 q7;

    @BeforeEach
    public void init() {
        q7 = new Q7();
    }

    @Test
    public void givenTwoNumbers_shouldFindMaximum() {
        //given
        //when
        //then
        Assertions.assertEquals(20, q7.findMaximum(8, 20));
    }
}
