package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Java");
        arrayList.add("Selenium");
        arrayList.add("Pearl");
        arrayList.add("Ruby");
        arrayList.add("Python");

        System.out.println(arrayList.size());
        //System.out.println(arrayList.get(1));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        arrayList.remove(3);
        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        int counter = arrayList.size();
        while (counter <= arrayList.size()) {
            System.out.println(counter++);
        }

        Iterator<String> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}


