package week5;

import java.util.HashSet;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme08_FilterNumWithinRange {
    HashSet<Integer> hs = new HashSet<>();

    // printing numbers within the range.
    public void numbersWithinRange(int minNum, int maxNum){
        for(Integer i: hs){
            if(i>=minNum && i<=maxNum){
                System.out.print(i+", ");
            }
        }
    }
    // storing numbers in a set.
    public void storeNumInSet(int a){
        hs.add(a);
    }

    public static void main(String[] args) {
        int[] num = {24,4,32,7,50,8,20,53};
        Programme08_FilterNumWithinRange rng = new Programme08_FilterNumWithinRange();
        for(int i: num){
            rng.storeNumInSet(i);
        }
        System.out.println("Original set: "+rng.hs);
        System.out.println("Printing numbers between 1 and 10.");
        rng.numbersWithinRange(1,10);
    }
}
