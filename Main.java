class Main {
  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push(20);
    stack.push(10);
    stack.displayTop();

    System.out.println(stack.pop() + " has been popped from the stack.\n");

    stack.displayTop();
  }
}