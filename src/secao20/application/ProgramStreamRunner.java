package secao20.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramStreamRunner {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 33, 32);

        Stream<Integer> str1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(str1.toArray()));

        Stream<String> str2 = Stream.of("Maria" ,"Bob", "Alex");
        System.out.println(Arrays.toString(str2.toArray()));

//        str2.forEach(System.out::println);
        Stream<Integer> str3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(str3.limit(10).toArray()));

        Stream<Long> str4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(str4.limit(10).toArray()));
    }
}
