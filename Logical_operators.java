import java.util.Scanner;
/*
class Logical_operators
{
    public static void main(String args[])
    {
        boolean cricket = true;
        boolean football = false;

        if (cricket || football)
        {
            System.out.println("I play Today");
        } else {
            System.out.println("I don't play Today");
        }
    }
}
*/
///////////////////////////////////////////////////////////////////////////////////
/*
class Logical_operators
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num%2 == 0)
        {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
*/
/*
class Logical_operators
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%3 == 0 && num%5 == 0) {
            System.out.println("Divisible by 3 and 5");
        } else {
            System.out.println("Not Divisible by 3 and 5");
        }
    }
}
*//*
class Logical_operators
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Score:");
        int num = scan.nextInt();

        if (num < 50) {
            System.out.println("You need to Improve");
        } 
        else if (num >= 50 && num <= 70) {
                System.out.println("Good job");
        } 
        else{
            System.out.println("Excellent performance");
        }



    }
}
*/
/*
class Logical_operators
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Marks of 5 Subjects:");
        int Subject1 = scan.nextInt();
        int Subject2 = scan.nextInt();
        int Subject3 = scan.nextInt();
        int Subject4 = scan.nextInt();
        int Subject5 = scan.nextInt();
        System.out.println("Total Marks: " + (Subject1 + Subject2 + Subject3 + Subject4 + Subject5));

        int total = Subject1 + Subject2 + Subject3 + Subject4 + Subject5;
        int average = total / 5;
        System.out.println("Average Marks: " + average);
        if (average < 35) {
            System.out.println("Additional Classes Required");
        }
        else {
            System.out.println("you are good to go");
        }
    }
}
*/
class Logical_operators
{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Salary and Age:");
        int salary = scan.nextInt();
        int age = scan.nextInt();

        if (salary >= 20000 || age <= 25) {
            System.out.println("You are Eligible for loan");
            System.out.println("Enter Loan Amount:");
            int loanAmount = scan.nextInt();
            if (loanAmount <= 500000){
                System.out.println("you are Eligible for requested loan amount");
                System.out.println("Loan Approved");
            }
            else {
                System.out.println("maximum loan amount is 500000");
            }
        } 
        else {
            System.out.println("You are not Eligible for loan");
        }
    }
}