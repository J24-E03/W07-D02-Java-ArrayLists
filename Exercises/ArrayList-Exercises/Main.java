package org.example;

import com.sun.source.doctree.SummaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Itelator;



public class Main {


    public static void countFrequencies(ArrayList<String> Occurrences)
    {
        // hashmap to store the frequency of element
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : Occurrences) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {

        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        // Traverse through the first list
        for (T element : list) {

            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {

                newList.add(element);
            }
        }
        return newList;
    }

    public static int sumNumbers(ArrayList<Integer> numbersList){
        int sum = 0;
        for(int i = 0; i<numbersList.size(); i++){
            sum+=numbersList.get(i);
        }
        return sum;
    }

    public static String reverseString(String s) {

        //Converting the string into a character array
        char c[] = s.toCharArray();
        String reverse = "";

        //For loop to reverse a string
        for (int i = c.length - 1; i >= 0; i--) {
            reverse += c[i];
        }
        return reverse;
    }

    public static void main(String[] args) {

        //                              ---Exercise 1---

        ArrayList<String> myHouse = new ArrayList<>();
        myHouse.add("room1");
        myHouse.add("room2");
        myHouse.add("room3");
        myHouse.add("room4");
        myHouse.add("room5");
        myHouse.add("room6");
        myHouse.add("room7");
        myHouse.add("kitchen");
        myHouse.add("bathroom1");
        myHouse.add("bathroom2");

        System.out.println(myHouse);

        myHouse.remove(2);

        System.out.println(myHouse);

        myHouse.set(4, "play-room");

        System.out.println(myHouse);

        //                             ---Exercise 2---

        ArrayList<String> fruitList = new ArrayList<>(Arrays.asList("Apple", "Peach", "Banana", "Mango", "Pear", "Watermelon"));

        System.out.println(fruitList.contains("Apple"));
        System.out.println(fruitList.indexOf("Banana"));

        if (fruitList.contains("Banana")) {
            System.out.println("it's index");

        } else {
            System.out.printf("Not found");
        }

        //                              ---Exercise 3---

        List<Integer> numbers = Arrays.asList(2, 3, 4, 1, 0, -2, -45, -70, 80, 99, 45, 87, 33, 91, 22, 16, 73, 40, 93);

        List<Integer> oddNumbers = numbers.stream()
                .filter(number -> number % 2 == 1)
                .collect(Collectors.toList());

        System.out.println(oddNumbers);

        //                              ---Exercise 4---

        List<Integer> numberos = Arrays.asList(22, 44, 66, 88, 111, 333, 555, 777, 999);

        System.out.println(reverseString(numberos.toString()));


        //                              ---Exercise 5---

        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(sumNumbers(numbersList));

        //                              ---Exercise 6---

// Get the ArrayList with duplicate values
        ArrayList<Integer>
                list = new ArrayList<>(
                Arrays
                        .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                + list);

        // Remove duplicates
        ArrayList<Integer>
                newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);

        //                              ---Exercise 7---


        ArrayList<String> carsList = new ArrayList<String>();

        // adding elements to the ArrayList
        carsList.add("Volkswagen");
        carsList.add("Toyota");
        carsList.add("Porsche");
        carsList.add("Ferrari");
        carsList.add("Mercedes-Benz");
        carsList.add("Audi");
        carsList.add("Rolls-Royce");
        carsList.add("BMW");

        // printing the unsorted ArrayList
        System.out.println("Before Sorting: "+ carsList);

        // Sorting ArrayList in ascending Order
        Collections.sort(carsList);

        // printing the sorted ArrayList
        System.out.println("After Sorting: "+ carsList);

//                                      ---Exercise 8---

        ArrayList<Integer> findMax = new ArrayList<>(Arrays.asList(22, 44, 66, 88, 111, 333, 555, 777, 999));

        System.out.println(Collections.max(findMax));

//                                      ---Exercise 9---

        ArrayList<String> mergingList1 = new ArrayList<>(Arrays.asList("To be"));
        ArrayList<String> mergingList2 = new ArrayList<>(Arrays.asList("or not to be"));
        mergingList1.addAll(mergingList2);
        System.out.println(mergingList1);

//                                      ---Exercise 10---

        // create ArrayList list1
        ArrayList<String> list1 = new ArrayList<String>();

        // Add values in ArrayList
        list1.add("Yo");
        list1.add("Ma");
        list1.add("Heart");


        // print list 1
        System.out.println("List1: " + list1);

        // Create ArrayList list2
        ArrayList<String> list2 = new ArrayList<String>();

        // Add values in ArrayList
        list2.add("Yo");
        list2.add("Ma");
        list2.add("Soul");

        // print list 2
        System.out.println("List2: " + list2);

        // Find the common elements
        list1.retainAll(list2);

        // print list 1
        System.out.println("Common elements: " + list1);

//                                      ---Exercise 11---

        ArrayList<String> Occurrences = new ArrayList<String>(Arrays.asList("apple"));
        countFrequencies(Occurrences);

//                                      ---Exercise 12---
        ArrayList<Integer> Summing = new ArrayList<>();
        Summing.add(11);
        Summing.add(22);
        Summing.add(33);
        Summing.add(44);
        Summing.add(55);

        // Calculate the sum of elements
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum: " + sum);


//                                      ---Exercise 13---

        // Calculate the average of elements
        double average = (double)sum / list.size();
        System.out.println("Average: " + average);

//                                      ---Exercise 14---




    }



}