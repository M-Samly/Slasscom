public class Queue {

    private int SIZE = 10;
    private char items[] = new char[SIZE];
    private int front, rear;

    public Queue(int SIZE) {
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        //chechikg the queue is full or not
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        //chechikg the queue is empty or not 
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(char element) {
        //add to to Queue
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
        //remove value from queue
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

    //main method
    public static void main(String[] args) {
        String in =args[0];             //Commandline argivment
        boolean ans = answer(in);       //pass the commandline aegivment value into answer method
        System.out.println(ans);        //final boolean value
    }

    //boolean method call
    static boolean answer(String input) {
        Queue q = new Queue(10);                                                                //Call the Queue method
       for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {   //checking the conditions
                q.enQueue(input.charAt(i));                                                     //add to the queue structure
            } else if (input.charAt(i) == ')' && !q.isEmpty()) {
                 q.deQueue();                                                                   //remove from the queue structure 
            } else if (input.charAt(i) == '}' && !q.isEmpty()) {
                 q.deQueue();                                                                   //remove from the queue structure
            } else if (input.charAt(i) == ']' && !q.isEmpty()) {
                 q.deQueue();                                                                   //remove from the queue structure
            } else {              
                return false;                                                                   //return 
            }
        }
       return q.isEmpty();
    }
}