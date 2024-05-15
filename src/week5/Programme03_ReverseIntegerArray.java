package week5;

import java.util.Arrays;

/**
 *  3. Write a Java program to reverse an array of integer values.
 */
public class Programme03_ReverseIntegerArray {
    public int[] reverseIntArray(int[] arr){
        int[] result = new int[arr.length];
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            result[j]=arr[i];
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testData = {501,322,1,65,49,72,6,13,-11,48,-11,23,40,0,23};
        Programme03_ReverseIntegerArray array = new Programme03_ReverseIntegerArray();
        System.out.println("Original array: "+ Arrays.toString(testData));
        System.out.println("Reversed array: "+Arrays.toString(array.reverseIntArray(testData)));
    }
}
