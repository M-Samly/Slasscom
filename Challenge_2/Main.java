public class Main{

  /* public static void main(String[] args) {
       /* Queue q = new Queue();
        String chk = "false";
        String in = args[0];
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == '(' || in.charAt(i) == '{' || in.charAt(i) == '[') {
                q.enQueue(in.charAt(i));
            }
            else if (in.charAt(i) == ')' && !q.isEmpty()) {
                q.deQueue();
            }
            /*else if (in.charAt(i) == '}' && !q.isEmpty()) {
                 q.deQueue();
            } else if (in.charAt(i) == ']' && !q.isEmpty() ) {
                 q.deQueue();
            } else {
                chk = "false";
            }*/
           /* String in = args[0];
        boolean ans = chkLogic(in);
        System.out.println(ans);
            
        }
/*System.out.println(chk);
        // q.enQueue(in);
        q.display();
    q.deQueue();
    q.display();*/
   

   /* static boolean chkLogic(String input) {

        Queue q = new Queue(10);

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
                q.enQueue(input.charAt(i));
            }

            else if (input.charAt(i) == ')' && !q.isEmpty() ) {
                q.deQueue();
            } else if (input.charAt(i) == '}' && !q.isEmpty() ) {
                q.deQueue();
            } else if (input.charAt(i) == ']' && !q.isEmpty() ) {
                q.deQueue();
            } else {
                return false;
            }
        }

        return q.isEmpty();

    }*/

}