import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayGeneratorTest {

    List<Integer> EMPTY_LIST = new ArrayList<>();
    List<Integer> ONE_LIST = Collections.singletonList(1);
    List<Integer> FIVE_LIST = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> TEN_LIST = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


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

    @Test
    public void itShouldReturnListFrom1To5When5isGiven() {
        List<Integer> result = ArrayGenerator.generate(5);
        assertEquals(FIVE_LIST, result);
    }

    @Test
    public void itShouldReturnListFrom1To10When10isGiven() {
        List<Integer> result = ArrayGenerator.generate(10);
        assertEquals(TEN_LIST, result);
    }

}