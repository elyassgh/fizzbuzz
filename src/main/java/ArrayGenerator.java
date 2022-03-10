import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayGenerator {

    static List<Integer> generate(int n) {
        return IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
    }

}
