import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tasks {
    public static void main(String[] args) {
        // Exercise 1
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integers.add(i);
        }

        System.out.println(integers);
        integers.remove(2);
        System.out.println(integers);
        integers.set(0, 100);
        System.out.println(integers);

        // Exercise 2
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Grape", "Apple", "Orange", "Banana", "Mangoe", "Pineapple"));
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.indexOf("Banana"));
        System.out.println(fruits.contains("Lemon") ? fruits.get(fruits.indexOf("Lemon")) : "Not found!");

        // Exercise 3
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int a : numbers) {
            if (a % 2 != 0) {
                oddNumbers.add(a);
            }
        }
        System.out.println(oddNumbers);

        // Bonus exercise
        numbers.removeIf(i -> i % 2 != 0);
        System.out.println(numbers);

        // Exercise 4
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add(i, arrayList.removeLast());
        }
        System.out.println(arrayList);

        // Exercise 5
        ArrayList<Integer> lastArray = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            lastArray.add(i);
        }

        int sum = 0;
        for (int a : lastArray) {
            sum += a;
        }
        System.out.println(sum);

        // Exercise 6
        ArrayList<Integer> duplicateNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 6));
        System.out.println(removeDuplicateNumbers(duplicateNumbers));

        // Exercise 7
        ArrayList<Integer> sortingList = new ArrayList<>(Arrays.asList(100, 5, 25, 38, 11, 4, 92, 29, 73, 15));
        Collections.sort(sortingList);
        System.out.println(sortingList);
        System.out.println(sortingList.reversed());

        // Exercise 8
        ArrayList<Integer> findMaximum = new ArrayList<>(Arrays.asList(100, 5, 25, 38, 11, 4, 92, 274, 29, 73, 15));
        System.out.println(findMaxNumber(findMaximum));

        // Exercise 9
        ArrayList<Integer> merge1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> merge2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        merge1.addAll(merge2);
        System.out.println(merge1);

        // Exercise 10
        ArrayList<String> commonElements1 = new ArrayList<>(Arrays.asList("John", "Tobias", "Mark", "Peter", "Sam", "Frank", "Nick"));
        ArrayList<String> commonElements2 = new ArrayList<>(Arrays.asList("Michael", "Nick", "Robert", "Tobias", "Matthias", "John", "Andy"));
        commonElements1.retainAll(commonElements2);
        System.out.println(commonElements1);

        // Exercise 11
        ArrayList<String> counter = new ArrayList<>(Arrays.asList("apple", "orange", "apple", "pineapple", "lemon", "apple"));
        System.out.println(Collections.frequency(counter, "apple"));

        // Exercise 12
        System.out.println(addAllNumbers(new ArrayList<>(Arrays.asList(100, 5, 25, 38, 11, 4, 92, 29, 73, 15))));

        // Exercise 13
        ArrayList<Integer> averageList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(addAllNumbers(averageList));
        System.out.println(calculateAverage(averageList, averageList.size()));

        // Exercise 14
        System.out.println(checkWord("Peter", commonElements1));
        System.out.println(checkWord("Matthias", commonElements2));

        // Exercise 15
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Michael", "Nick", "Robert", "Tobias", "Nick", "Matthias", "John", "Nick", "Andy", "Nick"));
        System.out.println(countWords("Nick", names));
    }

    private static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> arrayList) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int a : arrayList) {
            if (!list.contains(a)) {
                list.add(a);
            }
        }
        return list;
    }

    private static int findMaxNumber(ArrayList<Integer> list) {
        return Collections.max(list);
    }

    private static int addAllNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int a : list) {
            sum += a;
        }
        return sum;
    }

    private static int calculateAverage(ArrayList<Integer> list, int length) {
        return addAllNumbers(list) / length;
    }

    private static boolean checkWord(String word, ArrayList<String> list) {
        return list.contains(word);
    }

    private static int countWords(String word, ArrayList<String> list) {
        return Collections.frequency(list, word);
    }
}
