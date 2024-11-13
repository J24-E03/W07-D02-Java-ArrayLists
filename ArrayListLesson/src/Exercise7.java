import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise7 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,6,5,7,10,4,1,8,9,3));

         Collections.sort(numbers);
         System.out.println(numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }
}
