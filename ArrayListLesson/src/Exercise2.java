import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {

        //      Exercise 2

        ArrayList<String> fruits = new ArrayList<>();

        fruits.addAll(Arrays.asList("apple", "orange", "banana", "grape", "strawberrie"
                , "mangoe", "watermelon", "pineapple", "peache", "pear"));
        System.out.println(fruits);

        if (fruits.contains("apple")){
            System.out.println("It contains apple");
        }else {
            System.out.println("It doesn't contains apple");
        }

        System.out.println("Index of banana is : "+ fruits.indexOf("banana"));


    }
}
