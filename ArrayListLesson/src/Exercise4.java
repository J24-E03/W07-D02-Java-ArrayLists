import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (int i = 0; i < numbers.size(); i++) {
            numbers.add(i, numbers.remove(numbers.size() - 1));
        }

        System.out.println(numbers);

    }

}
