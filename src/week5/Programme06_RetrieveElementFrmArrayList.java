package week5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme06_RetrieveElementFrmArrayList {
    ArrayList<Integer> arrayList = new ArrayList<>();

    Programme06_RetrieveElementFrmArrayList(){
        arrayList.add(53);
        arrayList.add(1953);
        arrayList.add(5371);
        arrayList.add(5283);
        arrayList.add(5);
        arrayList.add(22);
        arrayList.add(-11);
    }

    public int pickIndexedElementfromArrayList(int index){
        return arrayList.get(index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Programme06_RetrieveElementFrmArrayList obj = new Programme06_RetrieveElementFrmArrayList();
        System.out.println("Displaying the Array list content:");
        System.out.println(obj.arrayList);
        int size = obj.arrayList.size();
        while(true){
            System.out.println("Enter the index number until "+size+" : ");
            int i = scanner.nextInt();
            if(i<size && i>=0){
                System.out.println("The element available on index "+i+" is "+obj.pickIndexedElementfromArrayList(i));
            }else{
                System.out.println("Invalid index.");
            }
            System.out.println("Try again?\n (Y=yes or press another character key to exit)");
            char ch = scanner.next().charAt(0);
            if(ch !='Y' && ch!='y'){
                break;
            }
        }
        scanner.close();
    }
}