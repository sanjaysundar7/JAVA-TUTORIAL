import java.util.Scanner;

// class Array {
//     public static void main(String args[]) 
//     {
//         Scanner scan = new Scanner(System.in);
//         int[] score = new int[5];
//         for(int i=0; i<=4; i++) {
//             score[i] = scan.nextInt();
//         }
//         for(int i=0; i<=4; i++) {
//             System.out.print(score[i]);
//         }
//     }
// }

// class Array {
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//         for (int i=0; i<arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }c
// }

class Array {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String sym = scan.nextLine();

        for (int i=1; i<=5; i++) {
            for (int j=5; i<=j; --j) {
                System.out.print(sym);
            }
            
            System.out.println();
        }
    }
}

