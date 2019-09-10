import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50.
    // Display those values on the screen, and then prompt the user for an integer.
    // Search through the ArrayList, and if the item is present, say so.
    // It is not necessary to display anything if the value was not found.
    // If the item is in the ArrayList multiple times, it's okay if the program prints the message more than once.
    public static void main(String[] args) {
        //ArrayList<int[]> arl=new ArrayList<int[]>();
        //ArrayList<Integer> gradeArrayLst = new ArrayList<Integer>();
        //int a1[]={1,2,3};
        //arl.add(0,a1);
        //System.out.println("Arraylist contains:"+arl.get(0));
        int randomInt = 0;
        Random rnd = new Random();
        ArrayList<Integer> numArray = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        Integer testInt = 0;

        for (int i = 0; i < 100; i++) {
            randomInt = rnd.nextInt(50) + 1;
            numArray.add(randomInt);
        }
        //intList.contains(-1); //returns false
        //intList.contains(3); //returns true

        System.out.println("The ArrayList of Random Numbers: " + numArray);

        while (true) {
            System.out.print("Enter a search number betwen 1 and 50:");
            testInt = sc.nextInt();
            sc.nextLine();

            if (numArray.contains(testInt)){
                System.out.print("The number that you selected: " + testInt + " does exist in the array list");
            }
            else{
                System.out.print("The number that you selected: " + testInt + " does NOT exist in the array list");
            }

            System.out.println("Press (q) to quit or any other key to continue");
            String contin = sc.nextLine();
            if (contin.startsWith("q"))
            {
                break;
            }
        }
    }
}
