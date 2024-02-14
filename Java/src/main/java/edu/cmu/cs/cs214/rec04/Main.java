package edu.cmu.cs.cs214.rec04;

/**
 * Main class for Recitation 5. This can be used as sandbox to experiment in.
 * @author Nora Shoemaker
 *
 */
public class Main {

    public static void main(String[] args) {

        /** 
         * This is a sandbox to experiment in.
         * Uncomment the following code to play with your implementation 
         * Select all and (CTRL + /) or (COMMAND + /)
         * Feel free to write more to test your implementation. 
         * */

        IntegerList list1;
        SortedIntList list2;

        list1 = new DelegationSortedIntList();
        list2 = new InheritanceSortedIntList();

        // add 5 elements to our first list.
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        printList(list1);
        System.out.println(list1.getTotalAdded());

        // add 2 elements to a second list.
        list2.add(3);
        list2.add(0);


        // add the first list (5 elements) to our second list (2 elements).
        list2.addAll(list1);

        printList(list2);
        System.out.println(list2.getTotalAdded());
    }

    /**
     * A helper function that prints out the contents of an IntegerList.
     * @param list IntegerList to be printed out.
     */
    private static void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}
