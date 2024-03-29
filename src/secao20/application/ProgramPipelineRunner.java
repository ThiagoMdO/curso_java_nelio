package secao20.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramPipelineRunner {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 6, 9);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

//        Integer sum = list.stream().reduce(0, (x, y) -> x + y);
        Integer sum = list.stream().reduce(1, (x, y) -> x * y);

        System.out.println(sum);

        List<Integer> newList = list.stream()
                                .filter(x -> x % 2 == 0)
                                .map(x -> x * 10)
                                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    }
}
