package week5;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme07_TestArrayListEmpty {

    //method to check if the arraylist is empty.
    public static boolean isArrayListEmpty(ArrayList<Integer> arl){
        return arl.isEmpty();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(2);
        arr1.add(53);
        arr1.add(40);
        arr1.add(13);
        arr1.add(253);
        arr1.add(1153);
        arr1.add(503);
        System.out.println(arr1);
        System.out.println("Returns "+isArrayListEmpty(arr1)+" ArrayList is not empty. It has "+arr1.size()+" elements.");
        System.out.println("Now emptying the array list...");

        //method for clearing/emptying the arraylist.
        arr1.clear();
        System.out.println("Returns "+isArrayListEmpty(arr1)+" ArrayList is Empty. It has "+arr1.size()+" elements.");
    }
}
