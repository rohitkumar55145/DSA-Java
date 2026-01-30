// import java.util.*;

// public class BitManipulation {
    
//     public static void main(String args[]) {
//         System.out.println((5 & 6));
//     }
// }

// // Binary OR | 
// import java.util.*;

// public class BitManipulation {
//     public static void main(String args[]) {
//         System.out.println(5 | 6);
//     }
// }

// // Binary XOR | 
// import java.util.*;

// public class BitManipulation {
//     public static void main(String args[]) {
//         System.out.println(5 ^ 6);
//     }
// } 

// 7. Binary l's Complement 

// import java.util.*;

// public class BitManipulation {
//     public static void main(String args[]) {
//         System.out.println(~0);
//     }
// }

// 8. 

// import java.util.*;

// public class BitManipulation {
//     public static void main(String args[]) {
//         System.out.println(5<<2);
//     }
// }

// 9. 

// import java.util.*;

// public class BitManipulation {
    
//     public static void main(String args[]) {
//         System.out.println((6>>1));
//     }
// }

// Question 1 

// import java.util.*;

// public class BitManipulation {
//     public static void oddOrEven(int n){
//         int bitMask =  1;
//         if(  (n & bitMask) == 0) {
//             //even number
//             System.out.println("even number");
//         } else {
//             System.out.println("odd number");
//         }
//     }

//     public static void main(String args[]) {
//         oddOrEven(3);
//         oddOrEven(11);
//         oddOrEven(14);
//     }
// }

// 11. 

// import java.util.*;

// public class BitManipulation {
//     public static int getIthBit(int n, int i) {
//         int bitMask = 1<<i;
//         if((n & bitMask) ==0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }

//     public static void main(String args[]) {
//         System.out.println(getIthBit(10,2));
//     }
// }

// 12. 

// import java.util.*;

// public class BitManipulation {
//     public static int setIthBit(int n, int i) {
//         int bitMask = 1<<i;
//         return n | bitMask;
//     }

//     public static void main(String args[]) {
//         System.out.println(setIthBit(10,2));
//     }
// }

// 13. 
// import java.util.*;

// public class BitManipulation {
//     public static int clearIthBit(int n, int i) {
//         int bitMask = ~(1<<i);
//         return n & bitMask;
//     }

//     public static void main(String args[]) {
//         System.out.println(clearIthBit(10, 1));
//     }
// }

// 14. 
// import java.util.*;

// public class BitManipulation {
//     // public static int setIthBit(int n, int i) {
//     //     int bitMask = 1<<i;
//     //     return n | bitMask;
//     // }

//     public static int clearIthBit(int n, int i) {
//         int bitMask = ~(1<<i);
//         return n & bitMask;
//     }

//     public static int updateIthBit(int n, int i, int newBit) {
//         // if(newBit == 0) {
//         //     return clearIthBit(n, i);
//         // } else {
//         //     return setIthBit(n, i);  
//         // }

//         n = clearIthBit(n, i);
//         int BitMask = newBit<<i;
//         return n | BitMask;
//     }
 
//     public static void main(String args[]) {
//          System.out.println(updateIthBit(10, 2, 1));
//     }

// }

// 15. 

// import java.util.*;

// public class BitManipulation {
//     public static int clearIBits(int n, int i) {
//         int bitMask = (~0)<<i;
//         return n & bitMask;
//     }

//     public static void main(String args[]) {
//         System.out.println(clearIBits(15, 2));
//     }
// }

// 16. 

// import java.util.*;

// public class BitManipulation {
//     public static int clearBitsinRange(int n, int i, int j) {
//         int a = ((~0)<<(j+1));
//         int b = (1<<i)-1;
//         int bitMask = a | b;
//         return n & bitMask;
//     }

//     public static void main(String args[]) {
//         System.out.println(clearBitsinRange(10, 2, 4));
//     }
// }

// import java.util.*;

// public class BitManipulation {
//     public static boolean isPowerOfTwo(int n) {
//         return (n&(n-1)) == 0;
//     }

//     public static void main(String args[]) {
//         System.out.println(isPowerOfTwo(8));
//     }
// }


// Question 3 

// import java.util.*;

// public class BitManipulation {
//     public static int countSetBits(int n) {
//         int count = 0;
//         while(n > 0) {
//             if((n & 1) != 0)  { //check out LSB
//                 count++;
//             }
//             n = n>>1; 
//         }
//         return count;
//     }

//     public static void main(String args[]) {
//         System.out.println(countSetBits(10));
//     }
// }

// 19. 

// import java.util.*;

// public class BitManipulation {
//     public static int fastExpo(int a, int n) {
//         int ans = 1;

//         while(n > 0) {
//             if((n & 1) != 0) { //check LSB
//                 ans = ans * a;
//             }
//             a = a * a;
//             n = n>>1;
//         }

//         return ans;
//     }

//     public static void main(String args[]) {
//         System.out.println(fastExpo(5,3));
//     }
// }

// Solution 2

// import java.util.*;

// public class BitManipulation {
//     public static void main(String[] args) {
//         int x = 3, y = 4;
//         System.out.println("Before swap: x = " + x + " and y = " + y);
//         //swap using xor
//         x = x ^ y;
//         y = x ^ y;
//         x = x ^ y;
//         System.out.println("After swap: x = " + x + " and y = " + y);
//     }
// }

// Question 3. 

// import java.util.*;

// public class BitManipulation {
//     public static void main(String[] args) {
//         int x = 6;
//         System.out.println(x + " + " + 1 + " is " + -~x);
//         x = -4;
//         System.out.println(x + " + " + 1 + " is " + -~x);
//         x = 0;
//         System.out.println(x + " + " + 1 + " is " + -~x);
//     }
// }

// Question 4. 

import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
