import java.util.Scanner;

public class Main {

    private String fName = "";
    private String lName = "";
    public static void main(String args[]) {
        details();
    }

    private static void details() {
        Scanner sc = new Scanner(System.in);
        
        String lName = "";
        System.out.println("Enter First Name : ");
        System.out.println("Enter Last Name : ");
        lName = sc.next();

        System.out.println("Name : "+fName+" "+lName);
    }
}