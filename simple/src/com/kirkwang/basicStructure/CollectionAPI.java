package com.kirkwang.basicStructure;

import java.util.*;

/**
 * Created by amp on 9/21/2015.
 */
public class CollectionAPI {

    public static void main(String[] args) {
        Set hashSet = new HashSet();
        List fruitsList = new ArrayList();

        Collections.addAll(fruitsList, "Apples", "Oranges", "Banana");
        Collections.addAll(hashSet, "cherry", "watermelon", "apple");

        Collections.sort(fruitsList, Comparator.naturalOrder());
        Collections.sort(fruitsList, Comparator.reverseOrder());
        //Collections.sort(hashSet); Set can't be sorted

        fruitsList.forEach(System.out::println);
        System.out.println();
        hashSet.forEach(System.out::println);
        System.out.println();

        DequeueList();
        System.out.println(Collections.binarySearch(fruitsList, "Apples"));
        checkedCollection();
        fill_frequency_Method();
        sychronized();
    }

    public static void sychronized() {
        List fruitsList = new ArrayList();

        Collections.addAll(fruitsList, "Apples", "Oranges", "Banana");

        Collection<String> synchronizedCollection = Collections.synchronizedCollection(fruitsList);
        List<String> synchronizedList = Collections.synchronizedList(fruitsList);
        List<String> EMPTY_LIST = Collections.EMPTY_LIST;
        System.out.println("this is sychronized block ");
        fruitsList.forEach(System.out::println);

    }

    public static void fill_frequency_Method() {
        List vegetables = new ArrayList();
        Collections.addAll(vegetables, "Potato", "Cabbage");
        vegetables.forEach(System.out::println);
        int counter = 0;
        Collections.fill(vegetables,
                "filled with dummy data"); //fill will cover up every thing with dummy datejjj
        vegetables.forEach(System.out::println);
        System.out.println(Collections.frequency(vegetables, "Cabbage"));//print 0 // this is no cabbage
    }

    public static void DequeueList() {
        Deque<String> deque = new LinkedList<String>();
        deque.addFirst("apple");
        deque.addFirst("banana");
        deque.addFirst("orange");

        Queue<String> queue = Collections.asLifoQueue(deque);
        System.out.println(" dequeue pull " + queue.poll());
        System.out.println(" dequeue pull " + queue.poll());
        System.out.println(" dequeue pull " + queue.poll());

    }

    public static void checkedCollection() {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, "one", "two", "three", "four");
        Collection<String> checkedList = Collections.checkedCollection(list, String.class);
        System.out.println("Checked list content: " + checkedList);
//we can add any type of element to list
        list.add(null);
//we cannot add any type of elements to chkList, it's checkecCollecion doing so
//throws ClassCastException
        // checkedList.add(10);
    }
}
