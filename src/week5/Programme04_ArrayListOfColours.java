package week5;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 *  printout the collection using for each loop.
 */
public class Programme04_ArrayListOfColours {
    public void colourCollectionPrint(String[] col){
        ArrayList<String> colourList = new ArrayList<>();
        for(String shades : col){
            colourList.add(shades);
        }

        // Printing list.
        System.out.println(colourList);

        //Printing content of list.
        for(String colours: colourList){
            System.out.println(colours);
        }
    }

    public static void main(String[] args) {
        String[] colourData = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        Programme04_ArrayListOfColours listing = new Programme04_ArrayListOfColours();
        listing.colourCollectionPrint(colourData);
    }
}
