/*
    chapter 18.3 (implement the greatest common using recursion)
    the gcd(m,n) can also be defined recursively as followed:

      * If m % n is 0, gcd(m, n) is n.
      * Otherwise, gcd(m, n) is gcd(n, m % n)

    Write a recursive method to find the GCD. Write a test program that prompts the
    user to enter two integers and displays their GCD.

    Big O notation:
    O(n) = Θ(log(n))

@Author(s) Grant Trotman & Khalid Hindawi

*/

package com.khalidgrant;

import java.util.*;

public class ch18_3 {

  public static void main(String[] args) {
    int m, n, gcd;
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your first number");
    m = input.nextInt();
    System.out.println("Please enter your second number");
    n = input.nextInt();

    System.out.println("The GCD of " + m + " and " + n + " is " + gcd(m, n));

  }

  public static int gcd(int m, int n) {
    if (m % n == 0) {
      return n;
    }
    return gcd(n, m % n);
  }
}
