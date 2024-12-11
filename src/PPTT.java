import java.util.Arrays;
import java.util.List;

public class PPTT {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(numbers.stream().max(Integer::compare).get());

        numbers.stream().map(i->i+i).forEach(System.out::println);
    }


}
