import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayGeneratorTest {

    static List<Integer> EMPTY_LIST = new ArrayList<>();
    static List<Integer> ONE_LIST = Collections.singletonList(1);

    @Test
    public void itShouldReturnEmptyListWhenZeroIsGiven() {
        List<Integer> result = ArrayGenerator.generate(0);
        assertEquals(EMPTY_LIST, result);
    }

    @Test
    public void itShouldReturnListContains1When1IsGiven() {
        List<Integer> result = ArrayGenerator.generate(1);
        assertEquals(ONE_LIST, result);
    }
}