import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {
        double perDayPayment;
        int noOfDays;

        Scanner s = new Scanner(System.in); // create scanner as s
        System.out.print("Enter Per Day Payment: ");
        perDayPayment = s.nextDouble(); 

        System.out.print("Enter Number Of Days: ");
        noOfDays = s.nextInt(); 
    }
}
