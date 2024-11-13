package org.dcistudent;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    private final Random random = new Random();

    public Main() {
        this
            // Exercise 1: Basic Operations on ArrayList of Integers
            .exercise1()
            // Exercise 2: Working with ArrayList of Strings
            .exercise2()
            // Exercise 3: Filtering Odd Numbers
            .exercise3()
            // Exercise 4: Reversing an ArrayList
            .exercise4()
            // Exercise 5: Summing Elements in an ArrayList
            .exercise5()
            // Exercise 6: Removing Duplicates
            .exercise6()
            // Exercise 7: Sorting an ArrayList
            .exercise7()
            // Exercise 8: Finding Maximum Value
            .exercise8()
            // Exercise 9: Merging Two Lists
            .exercise9()
            // Exercise 10: Finding Common Elements in Two Lists
            .exercise10()
            // Exercise 11: Counting Occurrences of a String
            .exercise11()
            // Exercise 12: Summing with a Method
            .exercise12(this.createRandomArrayList(10))
        ;
        this
            // Exercise 13: Calculating Average
            .exercise13(this.createRandomArrayList(10))
            // Exercise 14: Checking for Word in List
            .exercise14("Omar", Arrays.asList("Omar", "John", "Jane", "Doe"))
        ;
        // Exercise 15: Counting Word Occurrences
        this.exercise15("apple", Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
    }

    /**
     * Create an ArrayList of Integers with random values
     *
     * @param size Size of the list
     * @return List of random integers
     */
    public List<Integer> createRandomArrayList(int size) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(this.random.nextInt(1000));
        }

        return list;
    }

    /**
     * Exercise 1: Basic Operations on ArrayList of Integers
     *
     * 1. Create an ArrayList of Integers with values 1 to 10
     * 2. Remove the third element at index 2
     * 3. Replace the first element with 11
     */
    public Main exercise1() {
        List<Integer> list = this.createRandomArrayList(10);

        System.out.println("Exercise 1:");
        list.remove(2);
        System.out.println(Arrays.toString(list.toArray()));
        list.set(0, 11);
        System.out.println(Arrays.toString(list.toArray()));

        return this;
    }

    /**
     * Exercise 2: Working with ArrayList of Strings
     *
     * 1. Create an ArrayList of Strings with values "Banana", "Apple", "Orange", "Strawberry", "Watermelon", "Grape", "Mango"
     * 2. Check if the list contains "Apple"
     * 3. Find the index of "Banana"
     * 4. Check if the list contains "Pineapple"
     */
    public Main exercise2() {
        List<String> list = new ArrayList<>(
                Arrays.asList("Banana", "Apple", "Orange", "Strawberry", "Watermelon", "Grape", "Mango")
        );

        System.out.println("Exercise 2:");
        System.out.printf("Contains apple: %s%n", list.contains("Apple"));
        System.out.printf("Index of banana is: %s%n", list.indexOf("Banana"));

        if (!list.contains("Pineapple")) {
            System.out.println("Pineapple not found.");
        }

        return this;
    }

    /**
     * Exercise 3: Filtering Odd Numbers
     *
     * 1. Create an ArrayList of Integers with values 1 to 10
     * 2. Create an ArrayList of Integers to store odd numbers
     * 3. Iterate through the list and remove even numbers
     * 4. Add odd numbers to the list of odd numbers
     */
    public Main exercise3() {
        List<Integer> list = this.createRandomArrayList(10);
        List<Integer> listOdd = new ArrayList<>();

        System.out.println("Exercise 3:");
        System.out.println("List: " + Arrays.toString(list.toArray()));

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();

            if (i % 2 == 0) {
                iterator.remove();
                continue;
            }

            listOdd.add(i);
        }

        System.out.printf("List of odd numbers: %s%n", Arrays.toString(listOdd.toArray()));

        return this;
    }

    /**
     * Exercise 4: Reversing an ArrayList
     *
     * 1. Create an ArrayList of Integers with values 1 to 10
     * 2. Create an ArrayList of Integers to store reversed list
     * 3. Iterate through the list in reverse and add elements to the reversed list
     */
    public Main exercise4() {
        List<Integer> list = this.createRandomArrayList(10);
        List<Integer> listReversed = new ArrayList<>();

        System.out.println("Exercise 4:");
        System.out.println("List: " + Arrays.toString(list.toArray()));

        for (int i = list.size() - 1; i >= 0; i--) {
            listReversed.add(list.get(i));
        }

        System.out.printf("Reversed array list: %s%n", Arrays.toString(listReversed.toArray()));

        return this;
    }

    /**
     * Exercise 5: Summing Elements in an ArrayList
     *
     * 1. Create an ArrayList of Integers with values 1 to 10
     * 2. Iterate through the list and sum all elements
     */
    public Main exercise5() {
        List<Integer> list = this.createRandomArrayList(10);
        int sum = 0;

        System.out.println("Exercise 5:");
        System.out.println("List: " + Arrays.toString(list.toArray()));

        for (int i : list) {
            sum += i;
        }

        System.out.printf("Sum of elements: %s%n", sum);

        return this;
    }

    /**
     * Exercise 6: Removing Duplicates
     *
     * 1. Create an ArrayList of Integers with values 1 to 10
     * 2. Create an ArrayList of Integers with odd values
     * 3. Create an ArrayList of Integers to store unique values
     * 4. Remove odd numbers from the list of unique values
     */
    public Main exercise6() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> listOdd = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        List<Integer> listUnique = new ArrayList<>(list);

        System.out.println("Exercise 6:");
        System.out.println("List: " + Arrays.toString(list.toArray()));
        System.out.println("List odd: " + Arrays.toString(listOdd.toArray()));

        listUnique.removeAll(listOdd);

        System.out.printf("Non-duplicates list: %s%n", Arrays.toString(listUnique.toArray()));

        return this;
    }

    /**
     * Exercise 7: Sorting an ArrayList
     *
     * 1. Create an ArrayList of Integers with random values
     * 2. Sort the list
     */
    public Main exercise7() {
        List<Integer> list = this.createRandomArrayList(10);

        System.out.println("Exercise 7:");
        System.out.println("List: " + Arrays.toString(list.toArray()));
        System.out.println("List sorted: " + Arrays.toString(list.stream().sorted().toArray()));

        return this;
    }

    /**
     * Exercise 8: Finding Maximum Value
     *
     * 1. Create an ArrayList of Integers with random values
     * 2. Find the maximum value in the list
     */
    public Main exercise8() {
        List<Integer> list = this.createRandomArrayList(10);

        System.out.println("Exercise 8:");
        System.out.println("List: " + Arrays.toString(list.toArray()));
        System.out.printf("Max value: %s%n", Collections.max(list));

        return this;
    }

    /**
     * Exercise 9: Merging Two Lists
     *
     * 1. Create two ArrayList of Integers with random values
     * 2. Merge the two lists
     */
    public Main exercise9() {
        List<Integer> list1 = this.createRandomArrayList(10);
        List<Integer> list2 = this.createRandomArrayList(10);
        List<Integer> list3 = new ArrayList<>();

        System.out.println("Exercise 9:");
        System.out.println("List 1: " + Arrays.toString(list1.toArray()));
        System.out.println("List 2: " + Arrays.toString(list2.toArray()));

        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println("Merged list: " + Arrays.toString(list3.toArray()));

        return this;
    }

    /**
     * Exercise 10: Finding Common Elements in Two Lists
     *
     * 1. Create two ArrayList of Integers with random values
     * 2. Find the common elements between the two lists
     */
    public Main exercise10() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

        System.out.println("Exercise 10:");
        System.out.println("List 1: " + Arrays.toString(list1.toArray()));
        System.out.println("List 2: " + Arrays.toString(list2.toArray()));
        list1.retainAll(list2);
        System.out.println("Common elements: " + Arrays.toString(list1.toArray()));

        return this;
    }

    /**
     * Exercise 11: Counting Occurrences of a String
     *
     * 1. Create an ArrayList of Strings with values "apple", "banana", "apple", "orange", "banana", "apple"
     * 2. Count the occurrences of "apple"
     */
    public Main exercise11() {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));

        System.out.println("Exercise 11:");
        System.out.println("List: " + Arrays.toString(list.toArray()));
        System.out.println("Occurrences: " + Collections.frequency(list, "apple"));

        return this;
    }

    /**
     * Exercise 12: Summing with a Method
     *
     * 1. Create an ArrayList of Integers with random values
     * 2. Sum all elements in the list
     */
    public int exercise12(List<Integer> list) {
        int sum = 0;

        for (int i : list) {
            sum += i;
        }

        return sum;
    }

    /**
     * Exercise 13: Calculating Average
     *
     * 1. Create an ArrayList of Integers with random values
     * 2. Calculate the average of the list
     */
    public Main exercise13(List<Integer> list) {
        int sum = this.exercise12(list);

        if (list.isEmpty()) {
            throw new IllegalArgumentException("Division by zero.");
        }

        System.out.println("Exercise 13:");
        System.out.println("List: " + Arrays.toString(list.toArray()));
        System.out.printf("Average: %s%n", sum / list.size());

        return this;
    }

    /**
     * Exercise 14: Checking for Word in List
     *
     * 1. Create an ArrayList of Strings with values "Omar", "John", "Jane", "Doe"
     * 2. Check if the list contains "Omar"
     */
    public boolean exercise14(String word, List<String> list) {
        System.out.println("Exercise 14:");
        System.out.println("List: " + Arrays.toString(list.toArray()));
        System.out.printf("Contains %s: %s%n", word, list.contains(word));

        return list.contains(word);
    }

    /**
     * Exercise 15: Counting Word Occurrences
     *
     * 1. Create an ArrayList of Strings with values "apple", "banana", "apple", "orange", "banana", "apple"
     * 2. Count the occurrences of "apple"
     */
    public Main exercise15(String word, List<String> list) {
        System.out.println("Exercise 15:");
        System.out.println("List: " + Arrays.toString(list.toArray()));
        System.out.printf("Occurrences of %s: %s%n", word, Collections.frequency(list, word));

        return this;
    }
}