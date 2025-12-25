import java.util.Scanner;

public class Find {

    void evenorodd(int number) {
        if (number%2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        Find find = new Find();
        find.evenorodd(num);
        scan.close();
    }
}