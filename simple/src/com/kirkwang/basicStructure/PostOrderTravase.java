package com.kirkwang.basicStructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by amp on 9/18/2015.
 */
public class PostOrderTravase {

  public static void main(String... arg) {
    Set<String> treeSet = new TreeSet<String>();
    treeSet.add("a");
    treeSet.add("b");
    treeSet.add("c");

    Node aNode = new Node();
    aNode.setNodeValue(11);
    aNode.setNodeValue(3);
    aNode.setNodeValue(7);
    aNode.setNodeValue(71);
    Iterator it = treeSet.iterator();
    while (it.hasNext()) {
      Object element = it.next();
      System.out.println(element);
    }

    String[] array = (String[]) treeSet.toArray(new String[treeSet.size()]);
    Arrays.toString(array);

    String s1 = new String("hello");
    String s2 = "hello";
    String s3 = "hello";

    System.err.println(s1 == s2);
    System.err.println(s2 == s3);


  }

  void postOrder(Node root) {

    if (root == null) {
      return;
    }

    postOrder(root.leftNode());
    postOrder(root.rightNode());

    root.getNodeValue();
  }
}
