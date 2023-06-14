import java.util.Scanner;

class DSA {
    static final int MAX = 10;
    int queue[] = new int[MAX];
    int front = -1;
    int rear = -1;

    void insertElement() {
        if ((front == 0 && rear == MAX - 1) || (front == rear + 1)) {
            System.out.println("\nQueue Overflow Occurred");
        } else {
            int num;
            System.out.print("\nEnter the number to be inserted: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            scanner.close();
            if (front == -1 && rear == -1) {
                front = rear = 0;
                queue[rear] = num;
            } else if (rear == MAX - 1 && front != 0) {
                rear = 0;
                queue[rear] = num;
            } else {
                rear++;
                queue[rear] = num;
            }
        }
    }

    void deleteElement() {
        if (front == -1) {
            System.out.println("\nUnderflow");
        } else {
            int element = queue[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                if (front == MAX - 1) {
                    front = 0;
                } else {
                    front++;
                }
                System.out.println("\nThe deleted element is: " + element);
            }
        }
    }

    void displayQueue() {
        if (front == -1) {
            System.out.println("\nNo elements to display");
        } else {
            System.out.println("\nThe queue elements are:");
            if (rear >= front) {
                for (int i = front; i <= rear; i++) {
                    System.out.print("\t" + queue[i]);
                }
            } else {
                for (int i = front; i < MAX; i++) {
                    System.out.print("\t" + queue[i]);
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print("\t" + queue[i]);
                }
            }
        }
    }

    public static void main(String args[]) {
        int option;
        System.out.println(">>> Java program to implement queue operations <<<");
        DSA queue = new DSA();
        do {
            System.out.println("\n\n1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            scanner.close();
            switch (option) {
                case 1:
                    queue.insertElement();
                    break;
                case 2:
                    queue.deleteElement();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("\nInvalid option");
            }
        } while (option != 4);
    }
}
