import java.util.ArrayList;
import java.util.Arrays;

public class Exercise6 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mike","Papa","November", "Oscar" , "Papa" , "Quebec", "Oscar" , "Romeo" , "Sierra" , "Oscar" ,"Tango"));
        ArrayList<String> newNames=  removeDuplicates(names);

        System.out.println("The list with unique values : " + newNames);

    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> myArrayList) {
        ArrayList<String> noDuplicate = new ArrayList<>();
        for (String item : myArrayList) {
            if (!noDuplicate.contains(item)) {
                noDuplicate.add(item);
            }
        }
        return noDuplicate;
    }
}
