import java.util.ArrayList;
import java.util.Arrays;

public class Exercise5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int sum =0 ;
        for (int i : numbers ){

            sum += i;

        }
        System.out.println("The sum of all the numbers is : " + sum);


    }
}
