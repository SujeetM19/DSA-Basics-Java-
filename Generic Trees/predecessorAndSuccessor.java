// Predecessor And Successor Of An Element

// 1. You are given a partially written GenericTree class.
// 2. You are required to find the preorder predecessor and successor of a given element. 


// Sample Input
// 24
// 10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
// -120
// Sample Output
// Predecessor = 110
// Successor = 90





import java.io.*;
import java.util.*;

public class Main {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  static Node predecessor;
  static Node successor;
  static ArrayList<Node> elem = new ArrayList<>();
  static int idx;
  static int count = 0;
  
  public static void predecessorAndSuccessor(Node node, int data) {
    if(node.data == data){
        idx = count;
    }
    
    elem.add(node);
    count++;
    
    for(Node child: node.children){
        predecessorAndSuccessor(child, data);
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    predecessor = null;
    successor = null;
    predecessorAndSuccessor(root, data);
    
    if(idx == 0){
        successor = elem.get(idx+1);
    }
    else if(idx == elem.size() - 1){
        predecessor = elem.get(idx - 1);
    }
    else{
        predecessor = elem.get(idx - 1);
        successor = elem.get(idx+1);
    }
    
    
    if(predecessor == null){
      System.out.println("Predecessor = Not found");
    } else {
      System.out.println("Predecessor = " + predecessor.data);
    }

    if(successor == null){
      System.out.println("Successor = Not found");
    } else {
      System.out.println("Successor = " + successor.data);
    }
  }

}

