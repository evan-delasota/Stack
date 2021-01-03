class Stack {
  private final int max = 1000;
  int stackArray[] = new int[max];
  private int top = 0;

  Stack() { top = -1; }

  boolean isEmpty() { return (top < 0); }
  public int size() { return top; }

  boolean push(int x) {
    if (size() == (max - 1)) {
      throw new StackOverflowError();
    } else {
      stackArray[++top] = x;
      System.out.println(x + " has been pushed onto the stack.\n");
      return true;
    }

  }

  int pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack Underflow\n\n");
    } else {
      int x = stackArray[top--];
      return x;
    }

  }

  int peek() {
    if (isEmpty()) {
      throw new RuntimeException("Stack Underflow\n\n");
    } else {
      return stackArray[top];
    }

  }

  void displayTop() {
    System.out.println(peek() + " is at the top of the stack.\n");
  }


}