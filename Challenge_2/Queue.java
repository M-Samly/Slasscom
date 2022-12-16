public class Queue {

    int SIZE = 10;
    char items[] = new char[SIZE];
    int front, rear;

    public Queue(int SIZE) {
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(char element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
        }
    }

    public char deQueue() {
        char element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return 0;
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front++;
            }
            return (element);
        }
    }

    public void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + "  ");
            }
        }
    }

    public static void main(String[] args) {
             String in =args[0];
             
        boolean ans = chkLogic(in);
        System.out.println(ans);


    }

    static boolean chkLogic(String input) {
        Queue q = new Queue(10);
       for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
                q.enQueue(input.charAt(i));
            } else if (input.charAt(i) == ')' && !q.isEmpty()) {
                 q.deQueue();
            } else if (input.charAt(i) == '}' && !q.isEmpty()) {
                 q.deQueue();
            } else if (input.charAt(i) == ']' && !q.isEmpty()) {
                 q.deQueue();
            } else {              
                return false;
            }
        }
       return q.isEmpty();
    }
}