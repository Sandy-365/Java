/*
 * take an i/p from the user and tell wether the given i/p is odd or even
 */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        // String ans = ((i%2) == 0 ? "Even" : "Odd"); way1
        // String ans = ((i&1) == 0 ? "Even" : "Odd"); way2
        String ans = ((i^1) == i+1 ? "Even" : "Odd"); //way3
        System.out.println("the given number is "+ans);
        sc.close();
    }
}
