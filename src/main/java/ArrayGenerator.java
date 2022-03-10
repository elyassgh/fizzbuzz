import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayGenerator {

    static List<Integer> generate(int n) {

        if (n == 0) return new ArrayList<>();

        return Collections.singletonList(1);
    }

}
