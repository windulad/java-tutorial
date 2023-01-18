import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Do you want a car: Yes / No");
        Scanner scan = new Scanner(System.in);
        String Ans1 = scan.next();

        if(Ans1.equals("Yes")){
            System.out.println("What is your favourite color: Red / Blue / Yellow");
            String Ans2 = scan.next();

            if(Ans2.equals("Red")){
                System.out.println("We have it in stock. Would you like to see it ? Yes / No");
                String Ans3 = scan.next();

                if(Ans3.equals("yes")){
                    System.out.println("Great let's check that car");
                }else{
                    System.out.println("No worries, let's check something else");
                }

            }else if(Ans2.equals("Blue")){
                System.out.println("We can order it");
            }else{
                System.out.println("We don't have it in stocks");
            }
        }else{
            System.out.println("No worries. Have a good day");
        }
    }
}