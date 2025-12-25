import java.util.Scanner;

public class School {

    String passorfail(int marks) {
        if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scan.nextInt();
        School school = new School();
        String result = school.passorfail(marks);
        System.out.println("You have: " + result);
        scan.close();

    }
}