package week5;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme11_compareTwoArraylist {
    public void compareArrayList(){
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("ArrayList 1 = "+c1);
        System.out.println("ArrayList 2 = "+c2);

        if(c1.size()==c2.size()){
            if(c1.equals(c2)){
                System.out.println("Both arraylist are identical.");
            }else{
                System.out.println("Both arraylist are same in size but not equal in contents and sequence.");
            }
        }else{
            System.out.println("Both arraylists are not same.");
        }
    }

    public static void main(String[] args) {
        Programme11_compareTwoArraylist comp = new Programme11_compareTwoArraylist();
        comp.compareArrayList();
    }
}
