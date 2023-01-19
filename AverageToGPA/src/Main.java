import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("How many courses you had this year?");
        Scanner scan = new Scanner(System.in);
        //variable declarations
        int x = scan.nextInt();
        double[] num_courses = new double[x];
        double sum = 0;
        //input marks for subjects
        for(int i = 0; i < num_courses.length; i++){
            System.out.println("Enter marks for course " + (i + 1) + " : ");
            num_courses[i] = scan.nextDouble();
        }
        //calculate sum of marks
        for(int i = 0; i < num_courses.length; i++){
            sum += num_courses[i];
        }
        double average = sum/num_courses.length;
        //output grade
        if(average > 90){
            System.out.println("A");
        }else if(90 >= average && average > 80){
            System.out.println("B");
        }else if(80 >= average && average > 70){
            System.out.println("C");
        }else if(70 >= average && average > 60){
            System.out.println("D");
        }else if(average < 60){
            System.out.println("Fail");
        }else{
            System.out.println("Try again");
        }
    }
}