// public class JavaBasics {
//     public static void main(String arg[]){
//         System.out.print("Hello World\n"); // line ka space
//         System.out.print("Hello World\n"); // line ka space
//         System.out.print("Hello World\n"); // line  ka space
//     }
// }

// public class JavaBasics {
//     public static void main(String arg[]) {
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }
//boilerplate code

// public class JavaBasics {
//     public static void main(String args[]) {
//         byte b = 8;
//         System.out.println(b);
//         char ch = 'a';
//         System.out.println(ch);
//         boolean var = true;
//         float price = 10.5;
//         int number = 25;
//         //long
//         //double
//         short n = 240;
//     }
// }

// import java.util.*;

// public class JavaBasics {
//     public static void main(String arg[]) {
//         short a = 5;
//         byte b = 25;
//         char c = 'c';
//         byte bt = (byte) (a + b + c);
//         System.out.println(bt);
//     }
// }

// import java.util.*;

// public class JavaBasics {
//     public static void main(String arg[]) {
//         int a = 10;
//         float b = 20.25f;
//         long c = 25;
//         double d = 30;
//         double ans = a + b + c + d;
//         System.out.println(ans);
//     }
// }

// Solution write by me

// public class JavaBasics {
//     public static void main(String arg[]) {
//         int a = 4;
//         int b = 6;
//         int c = 8;
//         int d = a + b + c;
//         System.out.println((int) d/3 );
//     }
// }

// import java.util.*;

// Average of 3 numbers
// public class Solution {
//     public static void main(String arg[]) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();

//         int average = (A + B + C) / 3;

//         System.out.println("average is :" + average);
//     }
// }

// Solution write by ME

// import java.util.*;

// public class AreaOfSqu {
//     public static void main(String arg[]) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();

//         int Area = (A * A);

//         System.out.println("Area of Square " + Area);
//     }
// }

// import java.util.*;

// public class Cost {
//     public static void main(float arg[]) {
//         Scanner sc = new Scanner(System.in);

//         float Pencil = sc.nextInt();

//         float Pen = sc.nextInt();

//         float Eraser = sc.nextInt();

//         float totalCost = (Pencil + Pen + Eraser);
        

//         System.out.println("Total cost of all Items " + totalCost);
//     }
// }

// import java.util.*;

// public class Solution {
//     public static void main(float arg[]) {
//         byte b = 4;
//         char c = 'a';
//         short s = 512;
//         int i = 1000;
//         float f = 3.14f;
//         double d = 99.9954;

//         double result = (f * b) + (i % c) - (d * s);
//         System.out.println(result);
//     }
// }

// Print if a number is odd or even

// import java.util.*;

// public class JavaBasics {
//     public static void main(String arg[]) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if(number % 2 == 0) {
//             System.out.println("EVEN");
//         } else {
//             System.out.println("ODD");
//         }
//     }
// }


// CHECK IF A STUDENT WILL PASS OR FAIL

// import java.util.*;

// public class JavaBasics {
//     public static void main(String arg[]) {
//         int marks = 67;

//         String reportCard = marks >= 33 ? "PASS" : "FAIL";
//         System.out.println(reportCard);


//     }
// }

// SWITCH STATEMENT

// import java.util.*;

// public class JavaBasics {

//     public static void main(String args[]) {
//         int number = 3;
//         switch(number) {
//             case 1 : System.out.println("samosa");
//                         break;
//             case 2 : System.out.println("burger");
//                         break;
//             case 3 : System.out.println("mango shake");
//                         break;
//             default : System.out.println("we wake up");
//         }
//     }
// }

// CHECK NUMBER IS POSTIVE OR NEGATIVE


import java.util.*;

// public class JavaBasics {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int number = sc.nextInt();

//         if(number > 0) {
//             System.out.println("Number is Positive");
//         } else if (number < 0) {
//             System.out.println("Number is Negative");
//         } 
        
//         else {
//             System.out.println("Number is Zero");
//         }
//     }
// }

// Finish the following code so that it prints You have a fever if your temperature
 // is above 100 and otherwise prints You don't have a fever 

// import java.util.*;

// public class JavaBasics {

//     public static void main(String[] args) {
//         double temp = 103.5;

//         if(temp > 100) {
//             System.out.println("You have a fever. ");
//         } else if (temp < 100) {
//             System.out.println("You don't have a fever.");
//         }
//     }
// }

// Write a Java program to input week number(1-7) and print day of week name
// using switch case.

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int week = sc.nextInt();

//         switch(week) {
//             case 1: System.out.println("Monday");
//                 break;
//             case 2: System.out.println("Tuesday");
//                 break;
//             case 3: System.out.println("Wednesday");
//                 break;
//             case 4: System.out.println("Thursday");
//                 break;
//             case 5: System.out.println("Friday");
//                 break;
//             case 6: System.out.println("Saturday");
//                 break;
//             case 7: System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid input! Please enter week number between (1-7)");

//         }
//     }
// }


// What will be the value of x & y in the following program:

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int a = 63, b = 36;
//         boolean x = (a < b) ? true : false;
//         int y = (a > b) ? a : b;

//         System.out.println(x);
//         System.out.println(y);

//     }
// }

// Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int year = sc.nextInt();

//         if (year % 4 == 0) {
//             System.out.println("Leap Year");
//         } else if ( year % 100 == 0) {
//             System.out.println("Leap Year");
//         } else if ( year % 400 == 0) {
//             System.out.println("Leap Year");
//         } else {
//             System.out.println("Not a Leap Year");
//         }                
//     }
// }

// import java.util.*;
// public class JavaBasics {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Input the year: ");
// int year = sc.nextInt();
// boolean x = (year % 4) == 0;
// boolean y = (year % 100) != 0;
// boolean z = ((year % 100 == 0) && (year % 400 == 0));
// if (x && (y || z)) {
// System.out.println(year + " is a leap year");
// } else {
// System.out.println(year + " is not a leap year");
// }
// }}

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int counter = 1;
//         while(counter <= 10) {
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         long startTime = System.nanoTime();
//         int counter = 1;
//         while(counter <= 10000) {
//             System.out.println(counter);
//             counter++;
//         }

//         long endTime = System.nanoTime();

//         long durationNano = endTime - startTime;

//         long durationMillis = durationNano / 10000;

//         System.out.println("Exection time:" + durationNano + " nanosecends");
//         System.out.println("Exection time:" + durationMillis + " Milliseconds");

//     }
// }

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int n = 10899;

//         while ( n > 0 ) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit + " ");
//             n = n / 10; // n/=10
//         }

//     }
// }

// Break Statement 

// import java.util.*;

// public class JavaBasics {
    
//     public static void main(String args[]) {
//         for(int i = 1; i<=5; i++) {
//             if (i == 3) {
//                 break;
//             }
//             System.out.println(i);
            
//         }
//         System.out.println("i am out of the loop");
//     }
// }


// Check if a number is prime or not 

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if(n == 2) {
//             System.out.println("n is prime");
//         } else {
//             boolean isPrime = true;
//             // for(int i=2; i<=n-1; i++) {
//             for(int i=2; i<=Math.sqrt(n); i++) {
//                 if(n % i == 0) { // n is a multiple of i (i not equal to a or n )
//                     isPrime = false;
//                 }
//             }

//             if(isPrime == true) {
//                 System.out.println("n is prime");
//             } else {
//                 System.out.println("n is not prime");
//             }
//         }
//     }
// }

// Question 1: How many times 'Hello' is printed?

// public class JavaBasics {
//     public static void main(String[] args) {
//         for(int i=0; i<5; i++) {
//             System.out.println("Hello");
//             i+=2;
//         }
//     }
// }

// Question 2: Write a program to find the factorial of any number entered by the user.

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc= new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int d = sc.nextInt();

//         int sum = (a + b + c + d);

//         System.out.println(sum);
//     }
// }


        // Solution 2:
// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;

//         do {
//             System.out.print("Enter the number ");
//             number = sc.nextInt();

//             if( number % 2 == 0) {
//                 evenSum += number;
//             } else {
//                 oddSum += number;
//             }

//             System.out.print("Do you want to continue? Press 1 for yes or 0 for no");

//             choice = sc.nextInt();
//         } while(choice ==1);

//         System.out.println("Sum of even numbers:" + evenSum);
//         System.out.println("Sum of odd numbers:" + oddSum);
//     }
// }

// 3. Write a program to find the factorial of any number entered by the user.

// Solution 3:

// import java.util.Scanner;

// public class JavaBasics {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num; // To hold number
//         int fact = 1; // To hold factorial

//         System.out.println("Enter any positive interger: ");
//         num = sc.nextInt();

//         for(int i=1; i<=num; i++) {
//             fact *= i;
//         }

//         System.out.println("Factorial: " + fact);
//     }
// }

// 4. Write a program to print the multiplication table of a num N, entered by the user.

// import java .util.Scanner;

// public class MultiplicationTable {
//     public static void printMultiplicationTable(int number) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number:");
//         int n = sc.nextInt();
//         for(int i=1; i<=10; i++) {
//             System.out.println(n + " * " + " = " + n*1);
//         }
//     }
//     public static void main (String s[]) {
//         printMultiplicationTable(5)
//     }
// }

// 5. what is wrong in the following program?

// public class JavaBasics {
//     public static void main(String args[]) {
//         for(int i = 0; i <=5; i++ ) {
//             System.out.println("i = " + i);
//         }
//         System.out.println("i after the loop = " + i);
//     }
// }

// print star 
// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         for(int line=1; line<=4; line++) {
//             // one line
//             for(int star=1; star<=line; star++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     }


// While Loop 

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int counter = 0;
//         while(counter < 100) {
//             System.out.println("Hello World!");
//             counter++;
//         }

//         System.out.println("printed HW 10x");
//     }
// }

//                      Print Number from 1 to n 

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         int counter = 1;

//         while(counter <= range) {
//             System.out.print(counter + " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }

// Print sum of first n natural numbers 
// n = 5

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;

//         int i = 1;
//         while(i <= n) {
//             sum += i;
//             i++;
//         }

//         System.out.println("sum is : " + sum);
//     }
// }

//                                      for Loop 
// for(initialisation; condition; updation) {
//     // do something
// }

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         // int i = 1;
//         for(int i=1; i<=10; i++) {
//             System.out.println("Hello World");
//         }
//     }
// }

//                           Print SQUARE pattern 

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         // for(int line=1; line<=4; line++) {
//         //     System.out.println("****");
//         // }

//         int line = 1;
//         while(line <= 4) {
//             System.out.println("****");
//             line++;
//         }
//     }
// }

//                          Reverse the given number 

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         int n = 10899;
//         int rev = 0;

//         while(n > 0) {
//             int lastDigit = n % 10;
//             rev = (rev*10) + lastDigit;
//             n = n/10;
//         }

//         System.out.println(rev);
//     }
// }


// do-while Loop

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//        int counter = 1;
//         do {
//         System.out.println("Hello World");
//         counter++;
//         }while(counter <= 10);  

//     }
// }

//                       Kepp entering numbers till user enters a multiple of 10 

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do{
//             System.out.print("enter your number : ");
//             int n = sc.nextInt();

//             if(n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         } while(true);
//     }
// }

//                      Continue Statement(to skip an iteration)

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         for(int i=1; i<=5; i++) {
//             if(i == 3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

//                      Display all numbers entered by user except multiples of 10

// import java.util.*;

// public class JavaBasics {
    
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("enter your number : ");
//             int n = sc.nextInt();

//             if(n % 10 == 0) {
//                 continue;
//             }
//             System.out.println("number was : " + n);
//         } while(true);
//     }
// }


// Print INVERTED START Pattern 

// import java.util.*;

// public class JavaBasics {
//         public static void main(String args[]) {
//                 int n = 7;
//                 for(int line=1; line<=n; line++) {
//                         for(int star=1; star<=n-line+1; star++) {
//                                 System.out.print("*");
//                         }
//                         System.out.println();
//                 }
//         }
// }

//                               Print Half-Pyramid Pattern 

// import java.util.*;

// public class JavaBasics {
//        public static void main(String args[]) {
//          int n = 4;
        
//         for(int line=1; line<=n; line++) {
//                 // numbers print
//                 for(int number=1; number<=line; number++) {
//                         System.out.print(number);
//                 }
//                 System.out.println();
//         } 
//        }
// }

//                              Print Character Patter

// import java.util.*;

// public class JavaBasics {
//         public static void main(String args[]) {
//                 int n = 4;
//                 char ch = 'A';

//                 //outer loop
//                 for(int line=1; line<=n; line++) {
//                         //inner loop
//                 for(int chars=1; chars<=line; chars++) {
//                         System.out.print(ch);
//                         ch++;
//                 }
//                 System.out.println();
//                 }
//         }
// }

//                               Functions & Methods
//                              Example 1
// import java.util.*;

// public class JavaBasics {
//         public static void printHelloWorld() {
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//                 System.out.println("Hello World");
//         }

//         public static void calculateSum() {
//                 Scanner sc = new Scanner(System.in);
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();
//                 int sum = a + b;
//                 System.out.println("Sum is : " + sum);
//         }

//         public static void main(String args[]) {
//                 calculateSum();
                
//         }
// }

//                                      Example 2

// import java.util.*;
// public class JavaBasics {

//         public static void calculateSum(int a, int b) {
//                 int sum = a + b;
//                 System.out.println("Sum is : " + sum);
//         }

//         public static void main(String args[]) {
//                  Scanner sc = new Scanner(System.in);
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();
//                 calculateSum(a, b);
                
//         }
// }

//                                              Example 3

// import java.util.*;
// public class JavaBasics {

//         public static int calculateSum(int a, int b) {
//                 int sum = a + b;
//                 return sum ;

//         }

//         public static void main(String args[]) {
//                  Scanner sc = new Scanner(System.in);
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();
//                 int sum = calculateSum(a,b);
//                 System.out.println("Sum is : " + sum);

                
//         }
// }
 

//  call by value 

// import java.util.*;

// public class JavaBasics {
//         public static void main(String args[]) {
//                 //swap - values exchange
//                 int a = 5;
//                 int b = 10;

//                 //swap
//                 int temp = a;
//                 a = b;
//                 b = temp;

//                 System.out.println("a = " + a);
//                 System.out.println("b = " + b);
//         }
// }

// Find Producct of a & b 

// import java.util.*;

//      public class JavaBasics {

//         public static int multiply(int a, int b) {
//                 int product = a * b;
//                 return product;
//         }

//         public static void main(String args[]) {
//                 int a = 3;
//                 int b = 5;
//                 int prod = multiply(a, b);
//                 System.out.println("a * b = " + prod);


//      } 
         
//        }

//  Find Factorial 

// import java.util.*;

// public class JavaBasics{
//         public static int factorial(int n) {
//                 int f = 1;

//                 for(int i=1; i<=n; i++) {
//                         f = f * i;

//                 }
//                 return f; //factroial of n
//         }

       
// }

// Find Factorial

// import java.util.*;

// public class JavaBasics{
//         public static int factorial(int n) {
//                 int f = 1;

//                 for(int i=1; i<=n; i++) {
//                         f = f * i;

//                 }
//                 return f; //factorial of n  
//         }

//         public static int binCoeff(int n, int r) {
//                 int fact_n = factorial(n);
//                 int fact_r = factorial(r);
//                 int fact_nmr = factorial(n-r);

//                 int binCoeff = fact_n / (fact_r * fact_nmr);
//                 return binCoeff;
//         }

//         public static void main(String args[]) {
//                 System.out.println(binCoeff(5,2));
//         }
// }

//                                       Functions Overloading using Parameters 

// public class JavaBasics {

//         // func to calc sum of 2 nums
//         public static int sum(int a, int b) {
//                 return a + b;
//         }

//         //func to calc sum of 3 nums
//         public static int sum(int a, int b, int c) {
//                 return a + b + c;
//         }

//         public static void main(String args[]) {
//                 System.out.println(sum(3, 5));
//                 System.out.println(sum(5, 2, 1));
//         }
// }

//                              Functions Overloading using Data Types 

// public class JavaBasics {
//         //func to calc int sum
//         public static int sum(int a, int b) {
//                 return a + b;
//         }

//         //func to cals float sum
//         public static float sum(float a, float b) {
//                 return a + b;
//         }

//         public static void main(String args[]) {
//                 System.out.println(sum(3, 5));
//                 System.out.println(sum(3.2f, 4.8f));
//         }
// }

// Check if a number is Prime or not 

// public class JavaBasics {
//         public static boolean isPrime(int n) {
//                 boolean isPrime = true;
//                 for(int i=2; i<=n-1; i++) {
//                         if(n % i ==0) { //completely dividing
//                                 isPrime = false;
//                                 break;
//                         }
//                 }

//                 return isPrime;
//         }

//         public static void main(String args[]) {
//                System.out.println(isPrime(12));
//         }
// }

//                                   (II)


// public class JavaBasics {
//         public static boolean isPrime(int n) {
//                 for(int i=2; i<=n-1; i++) {
//                         if(n % i ==0) { //completely dividing
//                                return false;
//                         }
//                 }

//                 return true;
//         }

//         public static void main(String args[]) {
//                System.out.println(isPrime(3));
//         }
// }

// Check if a number is Prime or not(Optimised)

// import java.util.*;

// public class JavaBasics {
//         public static boolean isPrime(int n) {
//                 if(n ==2) {
//                      return true;   
//                 }
//                 for(int i=2; i<=Math.sqrt(n); i++) {
//                         if(n % i == 0) {
//                                 return false;
//                         }
//                 }

//                 return true;
//         }

//         public static void main(String args[]) {
//                 System.out.println(isPrime(7));
//         }
// }

// Print all Primes i a Range 
// n = 10

// import java.util.*;

// public class JavaBasics {
//         public static boolean isPrime(int n){
//                 if(n == 2) {
//                         return true;
//                 }
//                 for(int i=2; i<=Math.sqrt(n); i++){
//                         if(n % i == 0) {
//                                 return false;
//                         }
//                 }
//                 return true;
//         }

//         public static void primeInRange(int n) {
//                 for(int i=2; i<=n; i++) {
//                         if(isPrime(i)) {
//                                 System.out.print(i+ " ");
//                         }
//                 }
//                 System.out.println();
//         }

//         public static void main(String args[ ]) {
//                 primeInRange(20); // 2 to 20
//         }
// }

//                                 Code - Binary to Decimal 

// import java.util.*;

// public class JavaBasics {
//         public static void binToDec(int binNum) {
//                 int myNum = binNum;
//                 int pow = 0;
//                 int decNum = 0;

//                 while(binNum > 0) {     
//                         int lastDigit = binNum % 10;
//                         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//                         pow++;
//                         binNum = binNum/10;
//                 }

//                 System.out.println("decimal of " + binNum + " = " + decNum);
//         }

//         public static void main(String args[]) {
//                 binToDec(101);
//         }
// }

// Code Decimal to Binary

// import java.util.*;

// public class JavaBasics {
//         public static void decToBin(int n) {
//                 int myNum = n;
//                 int pow = 0;
//                 int binNum = 0;

//                 while(n > 0) {
//                         int rem = n % 2;
//                         binNum = binNum + (rem * (int)Math.pow(10, pow));
//                         pow++;
//                         n = n/2;
//                 }

//                 System.out.println("binary from of " + myNum + " = " + binNum);

//         }

//         public static void main(String args[]) {
//                 decToBin(15);
//         }
// }

//                                              Functions Questions

// Q1 Write a Java Method to compute the average of three numbers..

import java.util.*;

public class JavaBasics {
        public static void avrg(int a, int b, int c) {
                
                int avrg = (a + b + c)/3;
                System.out.println(avrg);
        }

        public static void main(String args[]) {
                avrg(2,4,6);

        }

}








         



 












