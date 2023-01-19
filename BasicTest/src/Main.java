import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to test");
        System.out.println("Q1: What is 2 + 2 in letters ?");
        String ans1 = scan.next();

        while (!ans1.equals("four")){
            System.out.println("Try again!");
            System.out.println("Q1: What is 2 + 2 in letters ?");
            ans1 = scan.next();
        }

        System.out.println("Correct answer!");
        System.out.println("Q2: Where is Toronto ?");
        String ans2 = scan.next();

        while (!ans2.equals("Canada")){
            System.out.println("Try again!");
            System.out.println("Q2: Where is Toronto ?");
            ans2 = scan.next();
        }

        System.out.println("Correct! You passed the exam!");
    }
}