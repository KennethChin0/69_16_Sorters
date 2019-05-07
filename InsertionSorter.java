/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
      super(usersData);
        // your code here, if necessary
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
      for(int elementToInsert = 1; elementToInsert < elements.size(); elementToInsert ++) {
        insert(elementToInsert);
        System.out.println("    dbg: "
            + "after inserting element " + elementToInsert
            + " elements: " + elements
            );
      }
        // your code here
    }

    public void insert(int numSorted) {
        String compareString = elements.get(numSorted);
        boolean check = false;
        for (int indexToCompare = numSorted-1; check == false; indexToCompare--){
        if (indexToCompare >= 0 && elements.get(indexToCompare).compareTo(compareString) > 0)
            elements.set(indexToCompare + 1, elements.get(indexToCompare));

        else {elements.set(indexToCompare + 1, compareString); check = true;}

        }
      }

}
