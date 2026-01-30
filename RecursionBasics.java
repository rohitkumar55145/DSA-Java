// public class RecursionBasics {
//     public static void printDec(int n) {
//         if(n == 1) {
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printDec(n - 1);
//     }

//     public static void main(String args[]) {
//         int n = 10;
//         printDec(n);
//     }
// }

// public class RecursionBasics {
//     public static void printInc(int n) {
//         if(n == 1) {
//             System.out.print(n + " ");
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n + " ");
//     }

//     public static void main(String args[]) {
//         int n = 10;
//         printInc(n);
//     }
// }

// Problem 3 

// public class RecursionBasics {
//     public static int fact(int n) {
//         if(n == 0) {
//             return 1;
//         }
//         int fnm1 = fact(n-1);
//         int fn = n * fact(n-1);
//         return fn;
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(fact(n));
//     }
// }

// Problem 4 
// public class RecursionBasics {
//     public static int calcSum(int n) {
//         if(n == 1) {
//             return 1;
//         }
//         int Snm1 = calcSum(n-1);
//         int Sn = n + Snm1;
//         return Sn;
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(calcSum(n));
//     }
// }

// Problem 5 
// public class RecursionBasics {
//     //calculate nth term in fibonacci
//     public static int fib(int n) {
//         if(n == 0 || n == 1) {
//             return n;
//         }
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(fib(5));
//     }
// }

//                                   Problem 6

// public class RecursionBasics {
//     public static boolean isSorted(int arr[], int i) {
//         if(i == arr.length-1) {
//             return true;
//         }

//         if(arr[i] > arr[i+1]) {
//             return false;
//         }
        
//         return isSorted(arr, i+1);
//     }

//     public static void main(String args[]) {
//         int arr[] = {5};
//         System.out.println(isSorted(arr, 0));
//     }

// }

// Problem 7 

// public class RecursionBasics {
//     public static int firstOccurence(int arr[], int key, int i) {
//         if(i == arr.length) {
//             return -1;
//         }
//         if(arr[i] == key) {
//             return i;
//         }

//         return firstOccurence(arr, key, i+1);
//     }

//     public static void main(String args[]) {
//         int arr[] = {8, 3, 6, 5, 10, 2, 5, 3};
//         System.out.println(firstOccurence(arr, 5, 0));
//     }
// }

// Problem 8 

// public class RecursionBasics {
//     public static int lastOccurence(int arr[], int key, int i) {
//         if(i == arr.length) {
//             return -1;
//         }
//         int isFound = lastOccurence(arr, key, i+1);
//         if(isFound == -1 && arr[i] == key) {
//             return i;
//         }

//         return isFound;
//     }

//     public static void main(String args[]) {
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         System.out.println(lastOccurence(arr, 5, 0));
//     }
// }

// Problem 9 

// public class RecursionBasics {
//     public static int power(int x, int n) {
//         if(n == 0) {
//             return 1;
//         }
//         // int xnm1 = power(x, n-1);
//         // int xn = x * xnm1;
//         // return xn;

//         return x * power(x, n-1);
//     }
//     public static void main(String args[]) {
//         System.out.println(power(2, 10));
//     }
// }

// Problem 10 

// public class RecursionBasics {
//     public static int optimizedPower(int a, int n) { //O(logn)
//         if(n == 0) {
//             return 1;
//         }
//         int halfPower = optimizedPower(a, n/2);
//         int halfPowerSq = halfPower * halfPower;

//         // n is odd
//         if(n % 2 != 0) {
//             halfPowerSq = a * halfPowerSq;
//         }

//         return halfPowerSq;
//     }

//     public static void main(String[] args) {
//         int a = 2; 
//         int n = 10;
//         System.out.println(optimizedPower(a, n));
//     }
// }

// Problem 11 
// public class RecursionBasics { 
//     public static int tilingProblem(int n) { // 2 x n (floor size)
//         //base case
//         if( n == 0 || n == 1) {
//             return 1;
//         }

//         //kaam
//         //vertical choice
//         int fnm1 = tilingProblem(n-1);

//         //horizontal choice
//         int fnm2 = tilingProblem(n-2);

//         int totWays = fnm1 + fnm2;
//         return totWays;
//     }

//     public static void main(String args[]) {
//         System.out.println(tilingProblem(4));
//     }
// }

// public class RecursionBasics {
//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
//         if(idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }

//         //kaam
//         char currChar = str.charAt(idx);
//         if(map[currChar-'a'] == true) { // Error
//             //duplicate
//             removeDuplicates(str, idx+1, newStr, map);
//         } else {
//             map[currChar-'a'] = true;
//             removeDuplicates(str, idx+1, newStr.append(currChar), map); // Error
//         }
//     } 

//     public static void main(String args[]) {
//         String str = "appnnacollege";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
//  }


//  public class RecursionBasics {
//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
//         if (idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }

//         // work
//         char currChar = str.charAt(idx);
//         if (map[currChar - 'a']) {
//             // duplicate
//             removeDuplicates(str, idx + 1, newStr, map);
//         } else {
//             map[currChar - 'a'] = true;
//             newStr.append(currChar);
//             removeDuplicates(str, idx + 1, newStr, map);
//         }
//     }

//     public static void main(String args[]) {
//         String str = "appnnacollege";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }



// Problem 13 

// public class RecursionBasics {
//     public static int friendsPairing(int n) {
//         if(n == 1 || n == 2) {
//             return n;
//         }
//         //choice
//         //single
//         // int fnm1 = friendsPairing(n-1);

//         // //pair
//         // int fnm2 = friendsPairing(n-2);
//         // int pairWays = (n-1) * fnm2;

//         // //toWays
//         // int totWays = fnm1 + pairWays;
//         // return totWays;
//         return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
//     }

//     public static void main(String args[]) {
//         System.out.println(friendsPairing(3));
//     }
// }


// Problem 14 

// public class RecursionBasics {
//     public static void printBinStrings(int n, int lastPlace, String str) {
//         //base case
//         if(n == 0) {
//             System.out.println(str);
//             return;
//         }

//         //kaam
//         printBinStrings(n-1, 0, str+"0");

//         if(lastPlace == 0) {
//             printBinStrings(n-1, 1, str+"1");
//         }
//      } 

//      public static void main(String args[]) {
//         printBinStrings(3, 0, "");
//      }
// }

// RECURSION BASIC SOLUTION 
// Q1. 
// public class RecursionBasics {
//     public static void allOccurences(int arr[], int key, int i) {
//         if(i == arr.length) {
//             return;
//         }

//         if(arr[i] == key) {
//             System.out.print(i+ " ");
//         }
//         allOccurences(arr, key, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {3, 2, 4, 5, 6, 7, 2, 2};
//         int key = 2;
//         allOccurences(arr, key, 0);
//         System.out.println();
//     }
// }

// Q2. 

// public class RecursionBasics {

//     static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

//     public static void printDigits(int number) {
//         if(number == 0) {
//             return;
//         }

//         int lastDigit = number%10;
//         printDigits(number/10);
//         System.out.print(digits[lastDigit]+ " ");
//     }

//     public static void main(String[] args) {
//         printDigits(1234);
//         System.out.println();
//     }
// }


// Q3. 

// public class RecursionBasics {
//     public static int length(String  str) {
//         if(str.length() == 0) {
//             return 0;
//         }

//         return length(str.substring(1)) + 1;

//     }
//     public static void main(String[] args) {
//         String str = "abcede";
//         System.out.println(length(str));
//     }
//  }


// Q4

// public class RecursionBasics {
//     public static int countSubstrs(String str, int i, int j, int n) {
//         if (n == 1) {
//             return 1;
//         }
//         if (n <= 0) {
//             return 0;
//         }

//         int res = countSubstrs(str, i + 1, j, n - 1) +
//                 countSubstrs(str, i, j - 1, n - 1) - 
//                 countSubstrs(str, i + 1, j - 1, n - 2);

//         if (str.charAt(i) == str.charAt(j)) {
//             res++;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         String str = "abcab";
//         int n = str.length();
//         System.out.print(countSubstrs(str, 0, n-1, n));
//     }
// }


// Q5. 

public class RecursionBasics {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");

    }
}

 
