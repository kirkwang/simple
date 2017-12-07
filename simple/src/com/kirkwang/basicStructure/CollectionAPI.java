package com.kirkwang.basicStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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
    fruitsList.forEach(System.out::println);

  }

  public static void fill_frequency_Method() {
    List vegetables = new ArrayList();
    Collections.addAll(vegetables, "Potato", "Cabbage");
    int counter = 0;
    Collections.fill(vegetables, "filled with dummy data");
    vegetables.forEach(System.out::println);
    System.out.println(Collections.frequency(vegetables, "Cabbage"));

  }

  public static void DequeueList() {
    Deque deque = new LinkedList();
    deque.addFirst("apple");
    deque.addFirst("banana");
    deque.addFirst("orange");

    Queue queue = Collections.asLifoQueue(deque);
    System.out.println(" dequeue pull " + queue.poll());
    System.out.println(" dequeue pull " + queue.poll());
    System.out.println(" dequeue pull " + queue.poll());

  }

  public static void checkedCollection() {
    List list = new ArrayList();
    Collections.addAll(list, "one", "two", "three", "four");
    Collection checkedList = Collections.checkedCollection(list, String.class);
    System.out.println("Checked list content: " + checkedList);
//we can add any type of element to list
    list.add(null);
//we cannot add any type of elements to chkList, it's checkecCollecion doing so
//throws ClassCastException
    // checkedList.add(10);
  }
}
