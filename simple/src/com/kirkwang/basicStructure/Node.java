package com.kirkwang.basicStructure;

/**
 * Created by amp on 9/18/2015.
 */
@Deprecated //incomplete
public class Node {

  private Node right;
  private Node left;
  private int nodeValue;


  public Node(int nodeValue) {
    this.nodeValue = nodeValue;
  }

  public Node leftNode() {
    return left;
  }

  public Node rightNode() {
    return right;
  }

  public int getNodeValue() {
    return nodeValue;
  }

  public int setNodeValue(int inValue) {
    return nodeValue = inValue;
  }
}
