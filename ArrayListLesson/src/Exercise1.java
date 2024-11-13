import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {


//      Exercise 1
        ArrayList<Integer> myintArrList = new ArrayList<>();

        myintArrList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(myintArrList);

        myintArrList.remove(2);
        System.out.println(myintArrList);

        myintArrList.set(0,500);
        System.out.println(myintArrList);





    }

}
