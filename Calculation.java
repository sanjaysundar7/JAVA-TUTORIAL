/*class Calculation{
    public static void main(String args[])
    {
        int a = 0;
        int b = 3;
        int sum = a + b;
        System.out.println(sum);
    }
}
*/

////////////////////////////////////////////////////////////
/*import java.util.Scanner;

class Calculation{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A No:");
        int a = sc.nextInt();
        System.out.println("Enter A No:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);
    }
} */

////////////////////////////////////////////////////////////

/*import java.util.Scanner;
class Calculation{
    public static void main(String args[])
    {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enyter A:");
        int A = Scan.nextInt();
        System.out.println("Enyter B:");
        int B = Scan.nextInt();
        System.out.println("Enyter C:");
        int C = Scan.nextInt();

        int D = A*B*C;
        int E = A+B+C;
        int Divide = D/E;
        System.out.println("Answer :" + Divide);
    }
} */

//////////////////////////////////////////////////////////////

import java.util.Scanner;
class Calculation{
    
    public static void main(String args[])
    {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = scan.nextLine();

        System.out.println("Enter Score:");
        float score = scan.nextFloat();
        float grade = score/10;
        scan.nextLine(); // Consume the newline character
        System.out.println("Enter Department:");
        String dept = scan.nextLine();

        System.out.println("My name is " + name);
        System.out.println("My grade is " + grade);
        System.out.println("My department is " + dept);
    }
}
