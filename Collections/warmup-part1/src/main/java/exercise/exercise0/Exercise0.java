package exercise.exercise0;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 *
 * Exercise 0: Create a List (ArrayList or LinkedList), add elements to it and print all of them using ListIterator
 *             for loop and foreach loop.
 *
 */
public class Exercise0 {

    public Exercise0(){

    }

    public void iterateThroughList(){

        // TODO Exercise #0 a) Create a list (ArrayList or LinkedList) and add elements to it
        // TODO Exercise #0 a) Don't forget to specify the type of the list (Integer, String etc.)

        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("ceva0");
        myArrayList.add("ceva1");
        myArrayList.add("ceva2");
        myArrayList.add("ceva3");

        // TODO Exercise #0 b) Iterate through the list using ListIterator and print all its elements
        ListIterator<String> iterator1 = myArrayList.listIterator();

        // TODO Exercise #0 c) Iterate through the list using classic for loop and print all its elements
        for (int i=0; i<myArrayList.size(); i++){
            System.out.println(myArrayList.get(i));
        }

        // TODO Exercise #0 d) Iterate through the list using foreach loop and print all its elements
        for (String myrrayListElement: myArrayList ){
            System.out.println(myrrayListElement);
        }

    }

    public static void main(String[] args) {
        // TODO Exercise #0 e) Create a new instance of Exercise0 class and call the iterateThroughList() method
        Exercise0 e = new Exercise0();
        e.iterateThroughList();

    }
}
