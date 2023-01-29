import java.util.Scanner;

public class main {
    private double perDayPayment;
    private int noOfDays;
    private double basicSalary;
    private double allowances;
    private double epf;
    private double finalSalary;
    private double employerContribution;

    public static void main(String[] args) throws InterruptedException {
        double perDayPayment;
        int noOfDays;

        Scanner s = new Scanner(System.in); // create scanner as s
        System.out.print("Enter Per Day Payment: ");
        perDayPayment = s.nextDouble();

        System.out.print("Enter Number Of Days: ");
        noOfDays = s.nextInt();
        System.out.println();
    }

    public void calculate() throws InterruptedException {

        basicSalary = perDayPayment * noOfDays; // main thread cal the basic salary

        Thread thread2 = new Thread(() -> allowances = basicSalary * 0.05); // thread 2 cal the allowances
        thread2.join();

        Thread thread3 = new Thread(() -> { // thread 3 cal the epf
            double totalMonthlyEarnings = basicSalary + allowances;
            epf = totalMonthlyEarnings * 0.08;

            employerContribution = totalMonthlyEarnings * 0.12; // cal employer Contribution
        });
        thread3.start();
        thread3.join();

        finalSalary = basicSalary + allowances + epf; // main thread cal final Salary
        System.out.println(employerContribution);
        System.out.println(epf);
        System.out.println(finalSalary);
    }
}
