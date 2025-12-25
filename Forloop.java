import java.util.Scanner;
/*
class Forloop
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for (int i=a; i<=b; i=i+1)
        {
            System.out.println(i);
        }
    }
}
*/

///////////////////////////////////////////////////////
/*
class Forloop
{
    public static void main(String args[])
    {
        int oddcount = 0;
        for (int i=1; i<=10; i=i+1)
        {
            if (i % 2 == 1)
            {
                oddcount = oddcount + 1;
                System.out.println(i);
            }
        }
        System.out.println("total odd count : " + oddcount);
    }
}
*/
/////////////////////////////////////////////////////////////////////////////

class Forloop
{
    public static void main(String args[])
    {
        System.out.println("Numbers divisible by 3 and 5 between 1 to 100 are: ");
        int count = 0;
        int notcount = 0;
        for (int i=1; i<=100; i=i+1)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                count = count + 1;
                System.out.println(i);
            } else
            {
                notcount = notcount + 1;
            }
        }
        System.out.println("total count : " + count);
        System.out.println("total not count : " + notcount);
    }
}