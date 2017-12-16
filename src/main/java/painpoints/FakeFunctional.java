package painpoints;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FakeFunctional {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(null, 0, 1, 2);
        List<Integer> results = list.stream()
                .filter(integer -> integer != null)
                .map(integer -> integer * 2)
                .collect(Collectors.toList());
    }
}
