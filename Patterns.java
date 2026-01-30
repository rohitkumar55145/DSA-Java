// public class Patterns {

//     public static void hollow_rectangle(int totRows, int totCols) {
//         //outer loop
//         for(int i=1; i<=totRows; i++) {
//             //inner - columns
//             for(int j=1; j<=totCols; j++) {
//                 //cell - (i,j)
//                 if(i == 1 || i == totRows || j == 1 || j == totCols) {
//                     //boundary cells
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }
//     }
    
//     public static void main(String args[]) {
//         hollow_rectangle(4, 5);
//     }
// }

//                           3. INVERTED & ROTATED HALF PYRAMID 

// import java.util.*;
  
// public class Patterns {
//     public static void inverted_rotated_half_pyramid(int n) {
//     //outer
//     for(int i=1; i<=n; i++) {
//         //spaces
//         for(int j=i; j<=n-1; j++) {
//             System.out.print(" ");
//         }

//         // stars
//         for(int j=1; j<=i; j++) {
//             System.out.print("*");
//         }

//         System.out.println();
//     }    
// }

//     public static void main(String args[]) {
//         inverted_rotated_half_pyramid(4);
//     }

// }

// 4. Inverted Half Pyramid Pattern with Numbers 

// import java.util.*;

// public class Patterns {
//     public static void inverted_half_pyramid_withNumbers(int n) {
//         for(int i=1; i<=n; i++) {
//             //inner - numbers
//             for(int j=1; j<=n-i+1; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         inverted_half_pyramid_withNumbers(5);
//     }
// }

// 5. Floyd's Triangle Pattern

// import java.util.*;

// public class Patterns {
//     public static void floyds_triangle(int n) {
//         //outer
//         int counter = 1;
//         for(int i=1; i<=n; i++) {
//             //inner - how many times will counter be printed
//             for(int j=1; j<=i; j++) {
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         floyds_triangle(4);
//     }
// }

// 6. (0-1) Triangle Pattern 

// import java.util.*;

// public class Patterns {

//     public static void zero_one_triangle(int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 if( (i+j) % 2 == 0) {
//                     System.out.print("1");
//                 } else {
//                     System.out.print("0");
//                 }
//             }

//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         zero_one_triangle(5);
//     }
// }

//                           7. Butterfly Pattern 

// import java.util.*;

// public class Patterns {
//     public static void butterfly(int n) {
//         //1st half
//         for(int i=1; i<=n; i++) {
//             //stars - i
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             } 

//             //spaces - 2*(n-i)
//             for(int j=1; j<=2*(n-i); j++) {
//                 System.out.print(" ");
//             }

//             //stars - i
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         //2nd Half
//         for(int i=n; i>=1; i--) {
//             //stars - i
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }

//             //spaces - 2*(n-i)
//             for(int j=1; j<=2*(n-i); j++) {
//                 System.out.print(" ");
//             }

//             //stars - i
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println(); 
//         }
//     }

//     public static void main(String args[]) {
//         butterfly(10);
//     }
// }

//                       8. Solid Rhombus Pattern 

// import java.util.*;

// public class Patterns {
//     public static void solid_rhombus(int n) {
//         for(int i=1; i<=n; i++) {
//             //spaces
//             for(int j=1; j<=(n-i); j++) {
//                 System.out.print(" ");
//             }

//             //stars 
//             for(int j=1; j<=n; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         solid_rhombus(5);
//     }
// }

// 9. Hollow Rhombus Pattern 

// import java.util.*;

// public class Patterns {
//     public static void hollow_rhombus(int n) {
//         for(int i=1; i<=n; i++) {
//             //spaces
//             for(int j=1; j<=(n-i); j++) {
//                 System.out.print(" ");
//             }

//             //hollow rectangle - Stars
//             for(int j=1; j<=n; j++) {
//                 if(i == 1 || i == n || j == 1 || j == n) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }

//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         hollow_rhombus(5);
//     }
// }

// 10. Diamond Pattern 

// 

//                                  Bonus Lecture 
// Number Pyramid
    //     1
    //    2 2
    //   3 3 3
    //  4 4 4 4 
    // 5 5 5 5 5 

// import java.util.*;

// public class Patterns {
 
//     public static void numberPyramid(int n) {
//     //outer loop
//     for(int i=1; i<=n; i++) {
//         //spaces
//         for(int j=1; j<=n-i; j++) {
//             System.out.print(" ");
//         }

//         //numbers
//         for(int j=1; j<=i; j++) {
//             System.out.print(i + " ");
//         }

//         System.out.println();
//     }
// }

//     public static void main(String args[]) {
//         numberPyramid(9);
//     }
// }

//                       Palindromic Pattern with Numbers 

import java.util.*;

public class Patterns {
    public static void palindromicPatternwithNums(int n) {
        //outer loop
        for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
            System.out.print(" ");
           }

           //descending
           for(int j=i; j>=1; j--) {
            System.out.print(j);
           }

           //ascending
           for(int j=2; j<=i; j++) {
            System.out.print(j);
           }

           System.out.println();
        }
    }

    public static void main(String args[]) {
        palindromicPatternwithNums(5);
    }
}













