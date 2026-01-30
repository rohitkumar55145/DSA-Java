// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Input the first number:");
//         double x = sc.nextDouble();

//         System.out.print("Input the second number: ");
//         double y = sc.nextDouble();

//         System.out.print("Input the third number: ");
//         double z = sc.nextDouble();

//         System.out.print("The average value is " + average(x, y, z)+"\n");

//     }

//     public static double average(double x, double y, double z) {
//         return (x + y + z) / 3;
//     }
// }

// 2. Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Number : ");
//         int isEven = sc.nextInt();

//         if(isEven % 2 == 0) {
//             System.out.print("True");
//         } else {
//             System.out.print("False");
//         }
//     }
// }

// Solution 2: From PDF 

// import java.util.*;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num;

//         System.out.print("Enter an interger: " );
//         num = sc.nextInt();

//         if(isEven(num)) {
//             System.out.println("Number is even");
//         } else {
//             System.out.println("Number is odd");
//         }
//     }

//     public static boolean isEven(int number) {
//         if(number % 2 == 0) {
//             return true;
//         }
//         else {
//             return false;
//         }
//     }
// }

// 3. Write a Java program to check if a number is a ;olinadrome in Java? (121 is a palindrome 321 is not) 
// A number is called a palindrome if the number is equal to the reverse of a number e.g/ 121 is a palindrome beacause the reverse of 121 is 121 itself. On the other hand 321 is not an palindrome because the reverse of 321 is 123, which is not equal to 321. 

// import java.util.Scanner;

// public class Solution {
//     public static void main(String args[]) {
//         System.out.println("Please Enter a number : ");
//         Scanner sc = new Scanner(System.in);
//         int palindrome = sc.nextInt();

//         if(isPalindrome(palindrome)) {
//             System.out.println("Number : " + palindrome + " is a palindrome");
//         } else {
//             System.out.println("Number : " + palindrome + " is not a palindrome ");
//         }
//     }

//     public static boolean isPalindrome(int number) {
//         int palindrome = number; // copied number into variable
//         int reverse = 0;

//         while(palindrome != 0) {
//             int remainder = palindrome % 10;
//             reverse = reverse * 10 + remainder;
//             palindrome = palindrome / 10;
//         }

//         // if original and the reverse of number is equal means 
//         // number is palindrome in Java

//         if(number == reverse) {
//             return true;
//         }
//         return false;
//     }
// }

// 4. READ & CODE EXDERCISE
// Search about (Google) & use the following methods of the Math class in Java
// a. Math.min()
// b. Math.max()
// c. Math.sqrt()
// d. Math.pow()
// e. Math.avg()
// f. Math.abs()

// public class Solution {
//     public static void main(String[] args) {
//         int num1 s= 16;
//         int num2 = 25;
//         int minInt = Math.min(num1, num2); // return 16
//         int maxInt = Math.max(num1, num2); // return 25
//         double sqrtInt = Math.sqrt(num1); // return 4
//         double powInt = Math.pow(2, 3); // return 8
//         // double avgInt = Math.avg(2, 4); // return 
//         // int absInt = Math.abs(num1); // return 10

//         System.out.println("Minumum of " + num1 + " and " + num2 + " is: " + minInt );
//         System.out.println("Maxium is " + maxInt);
//         System.out.println("Sqrt is " + sqrtInt);
//         System.out.println("pow is " + powInt);
//         // System.out.println("Avg is " + (avgInt/2));
//         // System.out.println("abs is" + absInt);

//     }

    
// }


// public class Solution {
//     public static void main(String[] args) {
//         int intValue = -10;
//         long longValue = -1234567890L;
//         float floatValue = -5.75f;
//         double doubleValue = -12.345;

//         System.out.println("Absolute of intValue: " + Math.abs(intValue));
//         System.out.println("Absolute of longValue: " + Math.abs(longValue));
//         System.out.println("Absolute of floatValue: " + Math.abs(floatValue));
//         System.out.println("Absolute of doubleValue: " + Math.abs(doubleValue));
//     }
// }

// 5. Write a Java method to compute the sum of the digits in an integer.

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }

        return sumOfDigits;
    }
}
