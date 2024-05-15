package week5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  5. Write a Java program to iterate through all elements in an array list using
 *  Iterater.
 */
public class Programme05_IteratingArrayList {

    public void iteratingArrayList(String[] arr){
        ArrayList<String> arl = new ArrayList<>();
        for(String s : arr){
            arl.add(s);
        }

        Iterator<String> itr = arl.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        String[] testData = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        Programme05_IteratingArrayList listing = new Programme05_IteratingArrayList();
        listing.iteratingArrayList(testData);
    }
}
