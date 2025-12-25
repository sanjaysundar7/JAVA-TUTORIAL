import java.util.Scanner;

class TerrinaryOperators
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The greater number is: " + (a > b ? a : b));
    }
}
