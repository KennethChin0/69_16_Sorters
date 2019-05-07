import java.util.ArrayList;

public class Insertion_Sort {
    public static void main(String[] commandLine) {
        ArrayList<String> unsorted = new ArrayList<String>();
        unsorted.add("S");
        unsorted.add("A");
        unsorted.add("P");
        unsorted.add("K");
        unsorted.add("D");
        unsorted.add("M");
        unsorted.add("P");

        System.out.println(unsorted); //expecting [S, A, P, K, D, M, P]
        insertionSort(unsorted);
        System.out.println(unsorted); //expecting [A, D, K, M, P, P, S]
    }

    private static <T extends Comparable<T>> void insertionSort(ArrayList<T> list) {
        for(int elementToInsert = 1;
            elementToInsert < list.size();
            insert1(list,elementToInsert),
            elementToInsert++
            ) {
                // System.out.println("    dbg: "
                    // + "after inserting element " + elementToInsert
                    // + " elements: " + list
                    // );
            }
    }

    private static <T extends Comparable<T>> void insert1(ArrayList<T> list, int numSorted) {
        T valueToInsert = list.get(numSorted);
        boolean inserted = false;
        for(int indexToCompare = numSorted - 1;
            !inserted && indexToCompare > -1;
            indexToCompare--
            ) {
                if(indexToCompare == 0 && valueToInsert.compareTo(list.get(0)) < 0) {
                    list.set(1, list.get(0));
                    list.set(0, valueToInsert);
                    inserted = true;
                }
                else {
                    if (valueToInsert.compareTo(list.get(indexToCompare)) < 0) {
                        list.set(indexToCompare+1, list.get(indexToCompare));
                    }
                    else {
                        list.set(indexToCompare+1, valueToInsert);
                        inserted = true;
                    }
                }
        }
    }
}
