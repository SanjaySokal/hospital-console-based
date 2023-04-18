import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my Hospital");
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " welcme to the hospital management system.");
        System.out.println("Please enter your case");
        String caseName = sc.next();
        System.out.println(caseName);
        System.out.println("What is your Aadhar Card Number");
        Long aadhar = sc.nextLong();
        System.out.println(aadhar);
        System.out.println("Enter date and time when you are available like (15/Aug/2023)");
        String dateTime = sc.next();
        System.out.println(dateTime);
        int caseId = (int) (Math.random() * 10000);
        int roomNo = (int) (Math.random() * 100);
        System.out.println("Hello Mr./Mrs. " + name + " your case id is " + caseId
                + " and your appointment to the doctor in room no. " + roomNo
                + " has been fixed please be available on " + dateTime + " and wear mask for safety.");
        sc.close();
    }
}