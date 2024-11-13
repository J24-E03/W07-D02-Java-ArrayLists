import java.util.ArrayList;
import java.util.Arrays;

public class Exercise3 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> newNumbers = new ArrayList<>();

        for (int i : numbers ){

            if (i % 2 == 0 ){
                newNumbers.add(i);
            }
        }
        System.out.println(newNumbers);

    }
}
