import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayListExercises {
    public static void main(String[] args) {
        //Exercise 1
        System.out.println("*********** Exercise 1 ***********\n");
        ArrayList<Integer> myRandomNumbers = new ArrayList<>(createRandomList(10, 100));
        System.out.println("My RandomList of numbers: " +  myRandomNumbers);
        myRandomNumbers.remove(2);
        System.out.println("My RandomList of numbers after removing the third element: " + myRandomNumbers);
        Random random = new Random();
        myRandomNumbers.set(0, random.nextInt(100));
        System.out.println("My RandomList of numbers after replacing the first element: " + myRandomNumbers);


        //Exercise 2
        System.out.println("\n*********** Exercise 2 ***********\n");
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Orange", "Mango", "Kiwi", "Apple", "Peach", "Banana", "Grape", "Cherry", "Pomegranate", "Strawberry"));
        System.out.println("My fruits arraylist: " +  fruits);
        System.out.println("The index of Banana: " + fruits.indexOf("Banana"));
        isFruitFound(fruits, "Blueberry");
        isFruitFound(fruits, "Mango");

        //Exercise 3
        System.out.println("\n*********** Exercise 3 ***********\n");
        ArrayList<Integer> someNumbers = new ArrayList<>(createRandomList(10, 100));

        System.out.println("List of some numbers: " + someNumbers);
        System.out.println("List of odd numbers: " + filterEvenNumbers(someNumbers));

        //Exercise 3 - Bonus
        System.out.println("\n*********** Exercise 3 - Bonus ***********\n");
        for (int i = someNumbers.size() - 1; i >= 0; i--) {
            if (someNumbers.get(i) % 2 == 0) {
                someNumbers.remove(i);
            }
        }
        System.out.println("My List of odd numbers: " +  someNumbers);

        //Exercise 4
        System.out.println("\n*********** Exercise 4 ***********\n");
        ArrayList<Integer> someNumbersToReverse = new ArrayList<>(createRandomList(10, 100));
        System.out.println("The original list: " + someNumbersToReverse);
        reverseList(someNumbersToReverse);


        //Exercise 5
        System.out.println("\n*********** Exercise 5 ***********\n");
        ArrayList<Integer> numbers = new ArrayList<>(createRandomList(10, 100));
        System.out.println("Sum of numbers in " + numbers + " is: " + calculateSumOfList(numbers));


        //Exercise 6
        System.out.println("\n*********** Exercise 6 ***********\n");
        ArrayList<String> fruitsBasket = new ArrayList<>(Arrays.asList("Orange", "Mango", "Kiwi", "Cherry", "Apple", "Mango", "Banana", "Grape", "Cherry", "Pomegranate", "Strawberry", "Banana", "Mango"));
        System.out.println("Original List: " + fruitsBasket);
        System.out.println("List without duplicate elemets: " + removeDuplicates(fruitsBasket));


        //Exercise 7
        System.out.println("\n*********** Exercise 7 ***********\n");
        ArrayList<Integer> numbersToBeSorted = new ArrayList<>(createRandomList(10, 100));
        System.out.println("My list of numbers" + numbersToBeSorted);
        Collections.sort(numbersToBeSorted);
        System.out.println("list of numbers sorted ascending: " + numbersToBeSorted);
        Collections.sort(numbersToBeSorted, Collections.reverseOrder());
        System.out.println("list of numbers sorted descending: " + numbersToBeSorted);

        //Exercise 8
        System.out.println("\n*********** Exercise 8 ***********\n");
        ArrayList<Integer> numbersTofindMaxValue = new ArrayList<>(createRandomList(10, 100));
        findMaxValue(numbersTofindMaxValue);

        //Exercise 9
        System.out.println("\n*********** Exercise 9 ***********\n");
        ArrayList<Integer> listOfNumbers1 = new ArrayList<>(createRandomList(5, 100));
        ArrayList<Integer> listOfNumbers2 = new ArrayList<>(createRandomList(5, 100));
        System.out.println("First List: " +  listOfNumbers1);
        System.out.println("Second List: " +  listOfNumbers2);
        System.out.println("Merged List: " + mergeLists(listOfNumbers1, listOfNumbers2));

        //Exercise 10
        System.out.println("\n*********** Exercise 10 ***********\n");
        ArrayList<String> fruitsBasket1 = new ArrayList<>(Arrays.asList("Orange", "Mango", "Kiwi", "Apple", "Peach", "Banana", "Grape", "Cherry", "Pomegranate", "Strawberry"));
        ArrayList<String> fruitsBasket2 = new ArrayList<>(Arrays.asList("Apple", "Watermelon", "Lemon", "Mango", "Pineapple", "Banana", "Pear", "Cherry", "Blueberry", "Strawberry"));
        System.out.println("First List: " + fruitsBasket1);
        System.out.println("Second List: " + fruitsBasket2);
        System.out.println("Common elements: " + findCommonElements(fruitsBasket1, fruitsBasket2));

        //Exercise 11
        System.out.println("\n*********** Exercise 11 ***********\n");
        ArrayList<String> newFruitsBasket = new ArrayList<>(Arrays.asList("Orange", "Mango", "Kiwi", "Cherry", "Apple", "Mango", "Banana", "Grape", "Cherry", "Pomegranate", "Strawberry", "Banana", "Mango"));
        System.out.println("My Fruit Basket: " + newFruitsBasket);
        System.out.println("Mango has appeared in this basket " + Collections.frequency(newFruitsBasket, "Mango") + " times.");
        System.out.println("Banana has appeared in this basket " + Collections.frequency(newFruitsBasket, "Banana") + " times.");
        System.out.println("Kiwi has appeared in this basket " + Collections.frequency(newFruitsBasket, "Kiwi") + " times.");

        //Exercise 12
        System.out.println("\n*********** Exercise 12 ***********\n");
        ArrayList<Integer> numbersToBeAdded = new ArrayList<>(createRandomList(10, 100));
        System.out.println("Sum of numbers in " + numbersToBeAdded + " is: " + calculateSumOfList(numbersToBeAdded));

        //Exercise 13
        System.out.println("\n*********** Exercise 13 ***********\n");
        System.out.println("The average of Numbers of List above is: " + calculateAverage(numbersToBeAdded));

        //Exercise 14
        System.out.println("\n*********** Exercise 14 ***********\n");
        System.out.println("My fruit basket: " + fruitsBasket);
        System.out.println(checkIfExist(fruitsBasket, "Banana") ? "Banana exists in the fruit basket." : "Banana doesn't exist in the fruit basket.");
        System.out.println(checkIfExist(fruitsBasket, "Apple") ? "Apple exists in the fruit basket." : "Apple doesn't exist in the fruit basket.");
        System.out.println(checkIfExist(fruitsBasket, "Lemon") ? "Lemon exists in the fruit basket." : "Lemon doesn't exist in the fruit basket.");

        //Exercise 15
        System.out.println("\n*********** Exercise 15 ***********\n");
        System.out.println("My fruit basket: " + newFruitsBasket);
        System.out.println("Mango has appeared in this basket " + countOccurrences(newFruitsBasket, "Mango") + " times.");
        System.out.println("Banana has appeared in this basket " + countOccurrences(newFruitsBasket, "Banana") + " times.");
        System.out.println("Kiwi has appeared in this basket " + countOccurrences(newFruitsBasket, "Kiwi") + " times.");


    }

    public static ArrayList<Integer> createRandomList(int size, int maxValue) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < size; index++) {
            newArrayList.add(random.nextInt(maxValue+1));
        }
        return newArrayList;
    }
    public static void isFruitFound(ArrayList<String> fruits, String fruit) {
        if (fruits.contains(fruit)) {
            System.out.println("The index of " + fruit + " is: " + fruits.indexOf(fruit));
        }
        else {
            System.out.println("Not found");
        }
    }

    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    public static int calculateSumOfList(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
       return sum;
    }

    public static void reverseList(ArrayList<Integer> numbers) {
        int temp;
        for (int index = 0; index < numbers.size() / 2; index++) {
            temp = numbers.get(index);
            numbers.set(index, numbers.get(numbers.size() - index - 1));
            numbers.set(numbers.size() - index-1, temp);
        }
        System.out.println("My reversed list: " +  numbers);
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> stringList){
        ArrayList<String> uniqueList = new ArrayList<>(stringList); // Copy original list to avoid modifying it directly

        for (String element : stringList) {
            while (Collections.frequency(uniqueList, element) > 1) {
                uniqueList.remove(element);
            }
        }
        return uniqueList;
    }


    public static void findMaxValue(ArrayList<Integer> numbers) {
        System.out.println("Maximum number in " +  numbers + " is: " + Collections.max(numbers));
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list1.size(), list2);
        return list1;
    }

    public static ArrayList<String> findCommonElements(ArrayList<String> firstList, ArrayList<String> secondList) {
        firstList.retainAll(secondList);
        return firstList;
    }

    public static int calculateAverage(ArrayList<Integer> numbers) {
        return (int) calculateSumOfList(numbers) / numbers.size();
    }

    public static boolean checkIfExist(ArrayList<String> words, String word) {
        return words.contains(word);
    }

    public static int countOccurrences(ArrayList<String> words, String word) {
        return Collections.frequency(words, word);
    }
}
