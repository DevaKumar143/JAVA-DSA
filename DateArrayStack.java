import java.util.Date;
import java.util.Scanner;

public class DateArrayStack {

    private Date[] stack;
    private int top;
    private int capacity;

    public DateArrayStack(int size) {
        stack = new Date[size];
        capacity = size;
        top = -1;
    }

    // Method to push a date onto the stack
    public void push(Date date) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        stack[++top] = date;
        System.out.println("Date pushed: " + date);
    }

    // Method to pop a date from the stack
    public Date pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        Date removedDate = stack[top--];
        System.out.println("Date popped: " + removedDate);
        return removedDate;
    }

    // Method to peek at the top date of the stack
    public Date peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
        System.out.println("Date on top: " + stack[top]);
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to traverse and display all dates in the stack
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Dates in stack:");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
    }

    // Method to search for a date in the stack
    public int search(Date date) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].equals(date)) {
                System.out.println("Date found at position: " + i);
                return i;
            }
        }
        System.out.println("Date not found in the stack.");
        return -1;
    }

    // Method to delete a date from the stack
    public void delete(Date date) {
        int index = search(date);
        if (index == -1) {
            System.out.println("Date not found. Cannot delete.");
            return;
        }
        for (int i = index; i < top; i++) {
            stack[i] = stack[i + 1];
        }
        stack[top--] = null;
        System.out.println("Date deleted: " + date);
    }

    public static void main(String[] args) {
        DateArrayStack dateStack = new DateArrayStack(10);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push Date");
            System.out.println("2. Pop Date");
            System.out.println("3. Peek Date");
            System.out.println("4. Traverse Dates");
            System.out.println("5. Search Date");
            System.out.println("6. Delete Date");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter date in milliseconds since epoch (e.g., 1672531199000): ");
                    long millis = scanner.nextLong();
                    Date date = new Date(millis);
                    dateStack.push(date);
                    break;
                case 2:
                    dateStack.pop();
                    break;
                case 3:
                    dateStack.peek();
                    break;
                case 4:
                    dateStack.traverse();
                    break;
                case 5:
                    System.out.print("Enter date in milliseconds since epoch to search (e.g., 1672531199000): ");
                    millis = scanner.nextLong();
                    date = new Date(millis);
                    dateStack.search(date);
                    break;
                case 6:
                    System.out.print("Enter date in milliseconds since epoch to delete (e.g., 1672531199000): ");
                    millis = scanner.nextLong();
                    date = new Date(millis);
                    dateStack.delete(date);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
}
