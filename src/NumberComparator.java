import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,5,88,90,-8,44,245,666,999,7,42,976,45,755,97,43,111,20};

        System.out.println("Nieposortowane:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Posortowane rosnąco:");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(final Integer number1, final Integer number2) {
                return -number1.compareTo(number2);
            }
        });

        System.out.println("Posortowane malejąco:");
        System.out.println(Arrays.toString(numbers));
    }
}
