import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Ex1
        ArrayList<Integer> myNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(myNumbers);
        myNumbers.remove(2);
        System.out.println(myNumbers);
        Collections.replaceAll(myNumbers, 1, 13);
        System.out.println(myNumbers);

//        Ex2
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana"));
        fruits.contains("Apple");
        fruits.indexOf("Banana");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fruit:");
        String fruit = sc.nextLine();
        if (fruits.contains(fruit)){
            System.out.println(fruits.indexOf(fruit));
        } else {
            System.out.println("Not found");
        }

//        Ex3
        ArrayList<Integer> myNumbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        myNumbers2.removeIf( n -> n % 2 == 0 );
        System.out.println(myNumbers2);

//        Ex4
        ArrayList<Integer> myNumbers3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> reversedInts = new ArrayList<>();
        for(int i = myNumbers3.size()-1; i>-1; i--){
            reversedInts.add(myNumbers3.get(i));
        }
        System.out.println(reversedInts);

//        Ex5
        ArrayList<Integer> myNumbers4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = 0;
        for(int i = myNumbers4.size()-1; i>-1; i--){
           sum = sum + myNumbers4.get(i);
        }
        System.out.println(sum);

//        Ex6
        ArrayList<Integer> myNumbers5 = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 4));
        ArrayList<Integer> removeList = new ArrayList<>();
        for (int i : myNumbers5){
            if (Collections.frequency(myNumbers5, i) > 1) {
                removeList.add(i);
            }
        }
        myNumbers5.removeAll(removeList);
        System.out.println(myNumbers5);

//        Ex7
        ArrayList<Integer> myNumbers6 = new ArrayList<>(Arrays.asList(9, 2, 3, 4, 5, 6, 7, 8, 1, 10));
        myNumbers6.sort(null);
        System.out.println(myNumbers6);
        myNumbers6.sort(Collections.reverseOrder());
        System.out.println(myNumbers6);

//        Ex8
        ArrayList<Integer> myNumbers7 = new ArrayList<>(Arrays.asList(9, 2, 3, 4, 5, 6, 7, 8, 1, 10));
System.out.println(MAX(myNumbers7));

//        Ex9
        ArrayList<Integer> myNumbers8 = new ArrayList<>(Arrays.asList(9, 2, 3, 4, 5, 6, 7, 8, 1, 10));
        ArrayList<Integer> myNumbers9 = new ArrayList<>(Arrays.asList(11, 12, 13, 14));
        myNumbers9.addAll(myNumbers8);
        System.out.println(myNumbers9);

//        Ex10
        ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Lemon"));
        ArrayList<String> yellows = new ArrayList<>(Arrays.asList("Sun", "Banana", "Lemon", "Yolk"));
        String r = "";
        for (String s : fruits2) {
            for (String t : yellows) {
                if (s.equals(t)){
                    if (r.contains(s)){
                        continue;
                    } else r += s + " ";
                }
            }
        }
        System.out.println(r);

//        Ex11
        ArrayList<String> yellows2 = new ArrayList<>(Arrays.asList("Sun", "Banana", "Lemon", "Sun", "Yolk"));
        String specific = "Sun";
        int counter = 0;
        for (String s : yellows2) {
            if  (s.equals(specific)){
                counter++;
            }
        }
        System.out.println(counter);

//        Ex12
        System.out.println(sum(myNumbers8));

//        Ex13
        System.out.println(average(myNumbers8));

//        Ex14
        if (contains(yellows2, specific)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

//        Ex15
        System.out.println(containsNum(yellows2, specific));
    }
    public static int MAX(ArrayList myNumbers7){
        int o = (int) Collections.max(myNumbers7);
        return o;
    }
    public static int sum(ArrayList<Integer> myNumbers8){
        int sum = 0;
        for(int i : myNumbers8){
            sum = sum + i;
        }
        return sum;
    }

    public static boolean contains(ArrayList<String> yellows2, String specific) {
        if (yellows2.contains(specific)){
                return true;
    } else {
            return false;
        }
    }

    public static int containsNum(ArrayList<String> yellows2, String specific){
        int counter = 0;
        for (String s : yellows2) {
            if (s.equals(specific)) {
                counter++;
            }
        }
        return counter;
    }

    public static double average(ArrayList<Integer> myNumbers8){
        double avg = sum(myNumbers8) / myNumbers8.size();
        return avg;
    }
}