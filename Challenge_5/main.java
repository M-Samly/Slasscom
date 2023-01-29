import java.util.Scanner;

public class main {
    private double perDayPay;
    private int noOfDay;
    private double basicSal;
    private double allowances;
    private double epf;
    private double finalSal;
    private double employerContribution;

    public static void main(String[] args) throws InterruptedException {
        double perDayPay;
        int noOfDay;

        Scanner s = new Scanner(System.in); // create scanner as s
        System.out.print("Enter Per Day Payment: ");
        perDayPay = s.nextDouble();

        System.out.print("Enter Number Of Days: ");
        noOfDay = s.nextInt();
        System.out.println();
        main cal = new main();
        cal.calculate(perDayPay, noOfDay);
    }

    public void calculate(double perDayPay, int noOfDay) throws InterruptedException {

        basicSal = perDayPay * noOfDay; // main thread cal the basic salary

        Thread thread2 = new Thread(() -> allowances = basicSal * 0.05); // thread 2 cal the allowances
        thread2.join();

        Thread thread3 = new Thread(() -> { // thread 3 cal the epf
            double totalMonthlyEarnings = basicSal + allowances;
            epf = totalMonthlyEarnings * 0.08;

            employerContribution = totalMonthlyEarnings * 0.12; // cal employer Contribution
        });
        thread3.start();
        thread3.join();

        finalSal = basicSal + allowances + epf; // main thread cal final Salary
        System.out.println(employerContribution);
        System.out.println(epf);
        System.out.println(finalSal);
    }
    
}
