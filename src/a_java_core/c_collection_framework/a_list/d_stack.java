package c_collection_framework.a_list;

import java.util.Stack;

public class d_stack {

  public static void main(String[] args) {
    // Creating a Stack of Integer type
    Stack<Integer> stack = new Stack<>();

    // Pushing elements onto the stack
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);

    // Printing the stack
    System.out.println("Stack: " + stack);

    // Peeking the top element
    System.out.println("Top element (peek): " + stack.peek()); // 40

    // Popping an element from the stack
    System.out.println("Popped element: " + stack.pop()); // 40

    // Checking the stack after popping
    System.out.println("Stack after pop: " + stack);

    // Checking if the stack is empty
    System.out.println("Is the stack empty? " + stack.isEmpty()); // false

    // Searching for an element (position from the top)
    System.out.println("Position of 20: " + stack.search(20)); // 2 (from top)
  }
}
