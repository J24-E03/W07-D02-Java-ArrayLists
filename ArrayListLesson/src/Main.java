import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

//        lessonCodeBasics();
//        collectionsMethods();




    }

    public static void collectionsMethods(){
        ArrayList<Integer> myNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> mySecondNumbers = new ArrayList<>(Arrays.asList(100,200,3,4,5,6,7,8,9,10));

        myNumbers.remove(2);
        myNumbers.set(0,5000);
        System.out.println(myNumbers);

        ArrayList<Integer> reversedInts = new ArrayList<>();

        for(int i = myNumbers.size()-1; i>-1; i--){
            reversedInts.add(myNumbers.get(i));
        }

        System.out.println(reversedInts);

//        Reverses arraylist
        Collections.reverse(myNumbers);
        System.out.println(myNumbers);

//        sorts arrayList
        Collections.sort(myNumbers);
        System.out.println(myNumbers);

//        reverse sort
        Collections.sort(myNumbers,Collections.reverseOrder());
        myNumbers.sort(Collections.reverseOrder());
        System.out.println(myNumbers);

        System.out.println(Collections.max(myNumbers));


//        retain ONLY the commond values between the two arraylists
        myNumbers.retainAll(mySecondNumbers);

        System.out.println(myNumbers);

        Collections.shuffle(mySecondNumbers);
        System.out.println(mySecondNumbers);

//        returns true if we have NO elements in common in our arraylists
        System.out.println(Collections.disjoint(mySecondNumbers,myNumbers));

        System.out.println(myNumbers);

//        frequency of element in my arraylist
        System.out.println(Collections.frequency(myNumbers,10));

        ArrayList<String> myStudents1 = new ArrayList<>(Arrays.asList("Hasan","Maryam"));
        ArrayList<String> myStudents2 = new ArrayList<>(Arrays.asList("Mihai","Kathrin","Kai","Hasan","Kathrin"));


        System.out.println(Collections.disjoint(myStudents1,myStudents2));

//        replaces the value in the arraylist with new value
        Collections.replaceAll(myStudents1,"Hasan","Martine");

        Collections.replaceAll(myStudents2,"Kathrin","Another value");

        System.out.println(myStudents1);

        System.out.println(myStudents2);

    }


    public static void lessonCodeBasics(){

        int[] myNumbers = new int[5];

        String myStudent = "Martine";

        System.out.println(Arrays.toString(myNumbers));

        myNumbers[0] = 10;
        System.out.println(myNumbers[0]);

        System.out.println(Arrays.toString(myNumbers));

//      In Java arrays are FIXED size


//      Create an arraylist

//      New arraylist of name myStudents that is a type of Strings
        ArrayList<String> myStudents = new ArrayList<>();

        myStudents.add("Kai");
        myStudents.add("Martine");

        System.out.println(myStudents);

//        returns  the length of the arraylist
        System.out.println(myStudents.size());

        System.out.println(myStudents.get(0));

//      creating an arraylist and initializing the values
        ArrayList<String> newStudents = new ArrayList<>(Arrays.asList("Aron","Kathrin","Maryam"));

        System.out.println(newStudents);

        newStudents.set(0,"Hasan");

        System.out.println(newStudents);

        newStudents.clear();
        System.out.println(newStudents);

        newStudents.addAll(Arrays.asList("Marcel","Paul","Sumayya"));

        System.out.println(newStudents);

        ArrayList<String> shoppingList1 = new ArrayList<>(Arrays.asList("Chicken","Water"));

        ArrayList<String> shoppingList2 = new ArrayList<>(Arrays.asList("Cheese","Soda","Water"));

        shoppingList1.addAll(shoppingList2);

        System.out.println(shoppingList1);

        System.out.println(shoppingList1.contains("Chips"));

        System.out.println(shoppingList1.indexOf("Water"));
        System.out.println(shoppingList1.lastIndexOf("Water"));

        shoppingList1.remove(0);

        System.out.println(shoppingList1);

        shoppingList1.remove("Cheese");

        System.out.println(shoppingList1);

//      Generics only take classes
//      Generics only take non-primitive data types
        ArrayList<Integer> myNumbersArrayList = new ArrayList<>();

        myNumbersArrayList.add(100);
        myNumbersArrayList.add(200);
        myNumbersArrayList.add(500);

        System.out.println(myNumbersArrayList);


//      Looping through arraylist

        for(int i =0; i<myNumbers.length;i++){
            System.out.println(myNumbers[i]);
        }

        for(int i=0; i<myNumbersArrayList.size();i++){
            System.out.println(myNumbersArrayList.get(i));
        }

        for(int oneNumber : myNumbersArrayList){
            System.out.println(oneNumber + " is being printed by enhanced for loop");
        }

        boolean isPopulated = !myNumbersArrayList.isEmpty();
        System.out.println(isPopulated);

    }


//    public static ArrayList<String> newMethod(ArrayList<String> names){
//
//    }


}