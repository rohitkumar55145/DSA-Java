// public class Classroom {
//     public static void changeArr(int arr[], int i, int val) {
//         //base case
//         if(i == arr.length) {
//             printArr(arr);
//             return;
//         }
//         //recursion
//         arr[i] = val;
//         changeArr(arr, i+1, val+1);
//         arr[i] = arr[i] - 2;
//     }

//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = new int[5];
//         changeArr(arr, 0, 1);
//         printArr(arr);
//     }
// }

// 5. 
// public class Classroom {
//     public static void findSubsets(String str, String ans, int i) {
//         //base case
//         if(i == str.length()) {
//             if(ans.length() == 0) {
//                 System.out.println("null");
//             } else {
//                 System.out.println(ans);
//             }
//             return;
//         }

//         //Yes choice
//         findSubsets(str, ans+str.charAt(i), i+1);
//         //No choice
//         findSubsets(str, ans, i+1);
//     }

//     public static void main(String args[]) {
//         String str = "abc";
//         findSubsets(str, "", 0);
//     }
// }

// 7. Finds Permutations 

// public class Classroom {
//     public static void findPermutation(String str, String ans) {
//         //base case
//         if(str.length() == 0) {
//             System.out.println(ans);
//             return;
//         }
//         //recursion - O(n * n!)
//         for(int i=0; i<str.length(); i++) {
//             char curr = str.charAt(i);
//             //"abcde" => "ab" + "de" = "abde"
//             String NewStr = str.substring(0, i) + str.substring(i+1);
//             findPermutation(NewStr, ans+curr);
//         }
//     }

//     public static void main(String args[]) {
//         String str = "abc";
//         findPermutation(str, "");
//     }
// }

// 8. N Queens - all ways 
// public class Classroom {
//     public static boolean isSafe(char board[][], int row, int col) {
//         //vertical up
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         //diag left up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         //diag right up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             } 
//         }
//         return true;
//     }


//     public static void nQueens(char board[][], int row) {
//         //base
//         if(row == board.length) {
//             printBoard(board);
//             return;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1); //function call
//                 board[row][j] = 'x'; //backtracking step
//             }
//         }
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("-----------chess board--------");
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         int n = 4;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = '.';
//             }
//         }

//         nQueens(board, 0); 
//     }
// }

// 10. Count Ways 
// public class Classroom {
//     public static boolean isSafe(char board[][], int row, int col) {
//         //vertical up
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         //diag left up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         //diag right up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             } 
//         }
//         return true;
//     }


//     public static void nQueens(char board[][], int row) {
//         //base
//         if(row == board.length) {
//             // printBoard(board);
//             count++;
//             return;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1); //function call
//                 board[row][j] = 'x'; //backtracking step
//             }
//         }
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("-----------chess board--------");
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static int count = 0;

//     public static void main(String args[]) {
//         int n = 4;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = '.';
//             }
//         }

//         nQueens(board, 0); 
//         System.out.println("total ways to solve n queens = " + count);
//     }
// }

// Print One Solution 

// public class Classroom {
//     public static boolean isSafe(char board[][], int row, int col) {
//         //vertical up
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         //diag left up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         //diag right up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             } 
//         }
//         return true;
//     }


//     public static boolean nQueens(char board[][], int row) {
//         //base
//         if(row == board.length) {
//             // printBoard(board);
//             count++;
//             return true;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 if(nQueens(board, row+1)){
//                     return true;
//                 }
//                 board[row][j] = 'x'; //backtracking step
//             }
//         }

//         return false;
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("-----------chess board--------");
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static int count = 0;

//     public static void main(String args[]) {
//         int n = 4;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = 'x';
//             }
//         }

//         if(nQueens(board, 0)) {
//             System.out.println("solution is possible");
//             printBoard(board);
//         } else {
//             System.out.println("solution is not possible");
//         }
//     }
// }

// 12. Grid Ways Code 

// public class Classroom {
//     public static int gridWays(int i, int j, int n, int m) {
//         //base case
//         if(i == n-1 && j == m-1) { //condn for last cell
//             return 1;
//         } else if(i == n || j == n) { //boundary cross condn
//             return 0;
//         }

//         int w1 = gridWays(i+1, j, n, m);
//         int w2 = gridWays(i, j+1, n, m);
//         return w1 + w2;
//     }

//     public static void main(String args[]) {
//         int n = 3, m = 3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }

// 16. Sudoku Code 

// public class Classroom {
//     public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
//         //column
//         for(int i=0; i<=8; i++) {
//             if(sudoku[i][col] == digit) {
//                 return false;
//             }
//         }

//         //row
//         for(int j=0; j<=8; j++) {
//             if(sudoku[row][j] == digit) {
//                 return false;
//             }
//         }

//         //grid
//         int sr = (row/3) * 3;
//         int sc = (col/3) * 3;
//         //3x3 grid
//         for(int i=sr; i<sr+3; i++) {
//             for(int j=sc; j<sc+3; j++) {
//                 if(sudoku[i][j] == digit) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public static boolean sudokuSolver(int sudoku[][], int row, int col) {
//         //base case
//         if(row == 9) {
//             return true;
//         }
//         //recursion
//         int nextRow = row, nextCol = col+1;
//         if(col+1 == 9) {
//             nextRow = row+1;
//             nextCol = 0;
//         }

//         if(sudoku[row][col] != 0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         for(int digit=1; digit<=9; digit++) {
//             if(isSafe(sudoku, row, col, digit)) {
//                 sudoku[row][col] = digit;
//                 if(sudokuSolver(sudoku, nextRow, nextCol)) {//soln exists
//                     return true;
//                 }
//                 sudoku[row][col] = 0;
//             }
//         }

//         return false;
//     }

//     public static void printSudoku(int sudoku[][]) {
//         for(int i=0; i<9; i++) {
//             for(int j=0; j<9; j++) {
//                 System.out.print(sudoku[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
//         {4, 9, 0, 1, 5, 7, 0, 0, 2},
//         {0, 0, 3, 0, 0, 4, 1, 9, 0},
//         {1, 8, 5, 0, 6, 0, 0, 2, 0},
//         {0, 0, 0, 0, 2, 0, 0, 6, 0},
//         {9, 6, 0, 4, 0, 5, 3, 0, 0},
//         {0, 3, 0, 0, 7, 2, 0, 0, 4},
//         {0, 4, 9, 0, 3, 0, 0, 5, 7},
//         {8, 2, 7, 0, 0, 9, 0, 1, 3} };

//         if(sudokuSolver(sudoku, 0, 0)) {
//             System.out.println("solution exists");
//             printSudoku(sudoku);
//         } else {
//             System.out.println("solution does not exist");
//         }

//     }
// }

//                              BACKTRACKING QUESTIONS 

// Q1

// public class Classroom {
//     public static void printSolution(int sol[][]) {
//         for (int i = 0; i<sol.length; i++) {
//             for (int j = 0; j<sol.length; j++) {
//                 System.out.print(" " + sol[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static boolean isSafe(int maze[][], int x, int y) {
//         // if (x, y outside maze) return false
//         return (x >= 0 && x < maze.length
//             && y >= 0 && y < maze.length && maze[x][y] == 1);
//     }

//     public static boolean solveMaze(int maze[][]) {
//         int N = maze.length;
//         int sol[][] = new int[N][N];
//         if (solveMazeUtil(maze, 0, 0, sol) == false) {
//             System.out.print("Solution doesn't exist");
//             return false;
//         }
//         printSolution(sol);
//         return true;
//     }

//     public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
//         if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
//             sol[x][y] = 1;
//             return true;
//         }

//         // Check if maze[x][y] is valid
//         if (isSafe(maze, x, y) == true) {
//             if (sol[x][y] == 1)
//             return false;
//         sol[x][y] = 1;
//         if (solveMazeUtil(maze, x + 1, y, sol))
//             return true;
//         if (solveMazeUtil(maze, x, y + 1, sol))
//             return true;
//         sol[x][y] = 0;
//         return false;
//         }

//         return false;
//     }

//     public static void main(String args[]) {
//         int maze[][] = {{ 1, 0, 0, 0},
//                         { 1, 1, 0, 1},
//                         {0, 1, 0, 0},
//                         {1, 1, 1, 1}};

//         solveMaze(maze);
//     }
// }

// Q2 

// public class Classroom {
//     final static char[][] L = {{},{}, {'a', 'b', 'c'}, {'d','e','f'}, {'g','h','i'},
//                         {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
//                         {'t','u','v'},{'w','x','y','z'}};


//     public static void letterCombinations(String D) {
//         int len = D.length(); 
//         if (len == 0) {
//             System.out.println("");
//             return;
//         }
//         bfs(0, len, new StringBuilder(), D);
//     }

//     public static void bfs(int pos, int len, StringBuilder sb, String D) {
//         if (pos == len) {
//             System.out.println(sb.toString());
//         }
//         else {
//             char[] letters = L[Character.getNumericValue(D.charAt(pos))];
//             for (int i = 0; i < letters.length; i++)
//                 bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), D);
//         }
//     }
//     public static void main(String args[]) {
//         letterCombinations("2");
//     }
// }

// Q3. 

// public class Classroom {
//     static int N = 8;

//     public static boolean isSafe(int x, int y, int sol[][]) {
//         return (x >= 0 && x < N && y >= 0 && y < N 
//                 && sol[x][y] == -1);
//     }

//     public static void printSolution(int sol[][]) {
//         for (int x = 0; x < N; x++) {
//             for (int y = 0; y < N; y++) 
//                 System.out.print(sol[x][y] + " ");
//             System.out.println();
//         }
//     }

//     public static boolean solveKT() {
//         int sol[][] = new int[8][8];
//         for (int x = 0; x < N; x++) {
//             for (int y = 0; y < N; y++)
//                 sol[x][y] = -1;

//         int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
//         int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

//         //As the Knight starts from cell(0,0)
//         sol[0][0] = 0;

//         if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
//             System.out.println("Solution does not exist");
//             return false;
//         }
//         else 
//             printSolution(sol);
//             return true;
//         }
//     }

//         public static boolean solveKTUtil(int x, int y, int movei, int sol[][],
//                                         int xMove[], int yMove[]) {
//             int k, next_x, next_y;
//             if (movei == N * N)
//                 return true;

//             for (k = 0; k < 8; k++) {
//                 next_x = x + xMove[k];
//                 next_y = y + yMove[k];
//                 if (isSafe(next_x, next_y, sol)) {
//                     sol[next_x][next_y] = movei;
//                     if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
//                             return true;
//                         else 
//                             sol[next_x][next_y]
//                                = -1; // backtracking
//                 }
//             }
//             return false;           
//         }

//     }    
//          public static void main(String args[]) {
//                 solveKT();
//          }
                     
// }


// 3.

// public class Classroom {
//     static int N = 8;

//     public static boolean isSafe(int x, int y, int sol[][]) {
//         return (x >= 0 && x < N && y >= 0 && y < N
//                 && sol[x][y] == -1);
//     }

//     public static void printSolution(int sol[][]) {
//         for (int x = 0; x < N; x++) {
//             for (int y = 0; y < N; y++)
//                 System.out.print(sol[x][y] + " ");
//             System.out.println();
//         }
//     }

//     public static boolean solveKT() {
//         int sol[][] = new int[8][8];

//         // Initialize solution matrix with -1
//         for (int x = 0; x < N; x++) {
//             for (int y = 0; y < N; y++)
//                 sol[x][y] = -1;
//         }

//         int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
//         int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

//         // Knight starts from cell (0,0)
//         sol[0][0] = 0;

//         if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
//             System.out.println("Solution does not exist");
//             return false;
//         } else {
//             printSolution(sol);
//             return true;
//         }
//     }

//     public static boolean solveKTUtil(int x, int y, int movei, int sol[][],
//                                       int xMove[], int yMove[]) {
//         int k, next_x, next_y;
//         if (movei == N * N)
//             return true;

//         for (k = 0; k < 8; k++) {
//             next_x = x + xMove[k];
//             next_y = y + yMove[k];
//             if (isSafe(next_x, next_y, sol)) {
//                 sol[next_x][next_y] = movei;
//                 if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
//                     return true;
//                 else
//                     sol[next_x][next_y] = -1; // backtracking
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         solveKT();
//     }
// }

//-------------------------------------------------------------------------------------------------------------------


// import java.util.ArrayList;

// public class Classroom {

//     public static void main(String args[]) {
//         // ClassName objectName = new ClassName();
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list2 = new ArrayList<>();
//         ArrayList<Boolean> list3 = new ArrayList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         list.add(1, 9); // O(n)

//         System.out.println(list);

//         //Get Operation - O(1)
//         int element = list.get(2);
//         System.out.println(element);

//         //Delete
//         list.remove(2);
//         System.out.println(list);

//         //Set
//         list.set(2, 10);
//         System.out.println(list);

//         //contains
//         System.out.println(list.contains(1));
//         System.out.println(list.contains(11));
//     }
// }

// import java.util.ArrayList;

// public class Classroom {

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         System.out.println(list.size());

//         //print the arraylist
//         for(int i=0; i<list.size(); i++) {
//             System.out.print(list.get(i) + " ");
//         }
//         System.out.println();
//     }
// }

// 4. 

// import java.util.ArrayList;

// public class Classroom {
//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         //Reverse print - O(n)
//         for(int i=list.size()-1; i>=0; i--) {
//             System.out.print(list.get(i) + " ");
//         }
//         System.out.println();
//     }
// }

// 5. 

// import java.util.ArrayList;

// public class ClassName {
//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(8);

//         //O(n)
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<list.size(); i++) {
//             // if(max < list.get(i)) {
//             //     max = list.get(i);
//             // }
//             max = Math.max(max, list.get(i));
//         }

//         System.out.println("max element = " + max);
//     }
// }

// 6. 
// import java.util.ArrayList;

// public class Classroom {
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);

//         int idx1 = 1, idx2 = 3;
//         System.out.println(list);
//         swap(list, idx1, idx2);
//         System.out.println(list);
//     }
// }

// 7. 

// import java.util.ArrayList;
// import java.util.Collections;

// public class Classroom {

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);

//         System.out.println(list);
//         Collections.sort(list); //ascending
//         System.out.println(list);

//         //descending
//         //Comparator - fnx login
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println(list);
        

//     }
// }

// 8. 

// import java.util.ArrayList;

// public class Classroom {
//     public static void main(String args[]) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1); list.add(2);
//         mainList.add(list);

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(3); list2.add(4);
//         mainList.add(list2);

//         for(int i=0; i<mainList.size(); i++) {
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size(); j++) {
//                 System.out.print(currList.get(j)+ " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.ArrayList;

// public class Classroom {
//     public static void main(String args[]) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();

//         for(int i=1; i<=5; i++) {
//             list1.add(i*1); //1 2 3 4 5
//             list2.add(i*2); //2 4 6 8 10
//             list3.add(i*3); //3 6 9 12 15
//         }

//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);
//         // list2.remove(3);
//         // list2.remove(2);

//         System.out.println(mainList);

//         //nested loops
//         for(int i=0; i<mainList.size(); i++) {
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size(); j++) {
//                 System.out.print(currList.get(j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// 10. 

// import java.util.ArrayList;

// public class Classroom {
//     public static int storeWater(ArrayList<Integer> height) {
//         int maxWater = 0;
//         //brute force
//         for(int i=0; i<height.size(); i++) {
//             for(int j=i+1; j<height.size(); j++) {
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j-i;
//                 int currWater = ht * width;
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         }

//         return maxWater; 
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> height = new ArrayList<>();
//         //1, 8, 6, 2, 5, 4, 8, 3, 7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7); 

//         System.out.println(storeWater(height));
//     }
// }


//2 pointer approach - O(n)
// import java.util.ArrayList;

// public class Classroom {
//     public static int storeWater(ArrayList<Integer> height) {
//         int maxWater = 0;
//         int lp = 0;
//         int rp = height.size()-1;

//         while(lp < rp) {
//             //calculate water area
//             int ht = Math.min(height.get(lp), height.get(rp));
//             int width = rp-lp;
//             int currWater = ht * width;
//             maxWater = Math.max(maxWater, currWater);

//             //update ptr
//             if(height.get(lp) < height.get(rp)) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }

//         return maxWater; 
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> height = new ArrayList<>();
//         //1, 8, 6, 2, 5, 4, 8, 3, 7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(storeWater(height));
         
//     }
// }

// 13. 

// import java.util.ArrayList;

// public class Classroom {
//     //Brute Force
//     public static boolean pairSum1(ArrayList<Integer> list, int target) {
//         for(int i=0; i<list.size(); i++) {
//             for(int j=i+1; j<list.size(); j++) {
//                 if(list.get(i) + list.get(j) == target) {
//                     return true;
//                 }
//             }
//         }

//         return false;

//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         //1, 2, 3, 4, 5, 6, 
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target = 5;
//         System.out.println(pairSum1(list, target));
//     }
// }


// 14. 

// import java.util.ArrayList;

// public class Classroom {
//     //2 pointer approach
//     public static boolean pairSum1(ArrayList<Integer> list, int target) {
//         int lp = 0;
//         int rp = list.size()-1;

//         while(lp != rp) {
//             //case 1
//             if(list.get(lp)+list.get(rp) == target) {
//                 return true;  
//             }

//             //case 2
//             if(list.get(lp)+list.get(rp) < target) {
//                 lp++;
//             } else {
//                 //case 3
//                 rp--;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         //1, 2, 3, 4, 5, 6
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target = 5;
//         System.out.println(pairSum1(list, target)); 
//     }
// }

// 16. 

// import java.util.ArrayList;

// public class Classroom {
//     //O(n)
//     public static boolean pairSum2(ArrayList<Integer> list, int target) {
//         int bp = -1;
//         int n = list.size();
//         for(int i=0; i<list.size(); i++) {
//             if(list.get(i) > list.get(i+1)) { //breaking point
//                 bp = i;
//                 break;
//             }
//         }

//         int lp = bp+1; //smallest
//         int rp = bp; //largest

//         while(lp != rp) {
//             //case1
//             if(list.get(lp) + list.get(rp) == target) {
//                 return true;
//             }

//             //case 2
//             if(list.get(lp) + list.get(rp) < target) {
//                 lp = (lp+1) % n;
//             } else {
//                 //case3
//                 rp = (n+rp-1) % n;
//             }
//         }

//         return false;
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         //11, 15, 6, 8, 9, 10 - Sorted & Rotated
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(8);
//         list.add(9);
//         list.add(10);
//         int target = 16;
//         System.out.println(pairSum2(list, target));
//     }
// }

//-----------------------------------------------------------------------------------------------------
// Q1 
// import java.util.ArrayList;

// public class Classroom {
//     public boolean isMonotonic(ArrayList<Integer> A) {
//         boolean inc = true;
//         boolean dec = true;
//         for (int i=0; i<A.size()-1; i++) {
//             if (A.get(i) > A.get(i+1))
//             inc = false;
//         if (A.get(i) < A.get(i+1))
//             dec = false;
//         }

//         return inc || dec;
//     }

//     public static void main(String[] args) {
//         Classroom obj = new Classroom();

//         // Example 1: Increasing
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(2);
//         list.add(3);
//         System.out.println(obj.isMonotonic(list)); // true
//     }    
// } 

// Q2 

// import java.util.ArrayList;
// import java.util.Collections;

// public class Classroom {
//     public ArrayList<Integer> findLonely(ArrayList<Integer> list) {
//         Collections.sort(list);
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i=1; i < list.size()-1; i++) {
//             if (list.get(i-1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i+1)) {
//                 list.add(list.get(i));
//             }
//         }
//         if (list.size() == 1) {
//             list.add(list.get(0));
//         }
//         if (list.size() > 1) {
//             if (list.get(0) + 1 < list.get(1)) {
//                 list.add(list.get(0));
//             }
//             if (list.get(list.size()-2) + 1 < list.get(list.size()-1)) {
//                 list.add(list.get(list.size()-1));
//             }
//         }
//         return list;
//     }

//     public static void main(String[] args) {
//         Classroom obj = new Classroom();

//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(10);
//         list.add(6);
//         list.add(5);
//         list.add(8);

//         ArrayList<Integer> lonely = obj.findLonely(list);
//         System.out.println(lonely); 
//         // Expected output: [8, 10]
//     }
// }

// Q3 

// import java.util.ArrayList;

// public class Classroom {
//     public static int mostFrequent(ArrayList<Integer> list, int key) {
//         int[]result = new int[1000];

//         for(int i=0; i<list.size()-1; i++) {
//             if(list.get(i) == key) {
//                 result[list.get(i+1)-1]++;
//             }
//         }

//         int max = Integer.MIN_VALUE;
//         int ans = 0;

//         for(int i=0; i<1000; i++) {
//             if(result[i] > max) {
//                 max = result[i];
//                 ans = i+1;
//             }
//         }
//         return ans;
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(100);
//         list.add(200);
//         list.add(1);
//         list.add(100);
//         int key = 1;
//         System.out.println(mostFrequent(list, key));
//     }   
// }

// Q4 

// import java.util.ArrayList;

// public class Classroom {
//     public static ArrayList<Integer> beautifulArray(int n) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         ans.add(1);

//         for(int i=2; i<=n; i++) {
//             ArrayList<Integer>temp=new ArrayList<>();
//             for(Integer e:ans) {
//                 if(2*e<=n)temp.add(e*2);
//             }
//             for(Integer e:ans) {
//                 if(2*e-1<=n)temp.add(e*2-1);
//             }

//             ans = temp;
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         ArrayList<Integer> list = beautifulArray(n);

//         System.out.println(beautifulArray(n));

//     }
// }

// Approach 2 

// import java.util.ArrayList;

// public class Classroom {
//     public static  ArrayList<Integer> beautifulArray(int n) {
//         ArrayList<Integer> res = new ArrayList<>();
//         divideConque(1, 1, res, n);
//         return res;
//     }

//     private static void divideConque(int start, int increment, ArrayList<Integer> res, int n) {
//         if (start + increment > n) {
//             res.add(start);
//             return;
//         }
//         divideConque(start, 2 * increment, res, n);
//         divideConque(start + increment, 2 * increment, res, n);
//     }

//     public static void main(String args[]) {
//         int n = 4;
//         ArrayList<Integer> list = beautifulArray(n);
//         System.out.println(beautifulArray(n));
//     }
// }

//-----------------------------------------------------------------------------------------------

// import java.util.LinkedList;
// // import java.util.LinkedList;


// public class Classroom {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;

//     // addFirst
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//      public void print() {
//         if(head == null) {
//             System.out.println("LL is empty");
//             return;  
//         }
//         Node temp = head;
//         while(temp != null) {
//             System.out.print(temp.data+"->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     private Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow; //mid node
//     }

//     private Node merge(Node head1, Node head2) {
//         Node mergedLL = new Node(-1);
//         Node temp = mergedLL;

//         while(head1 != null && head2 != null) {
//             if(head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }
//         }

//         while(head1 != null) {
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }

//         while(head2 != null) {
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }

//         return mergedLL.next;
//     }

//     public Node mergeSort(Node head) {
//         if(head == null || head.next == null) {
//             return head;
//         }

//         //find mid
//         Node mid = getMid();
//         //left & right MS
//         Node rightHead = mid.next;
//         mid.next = null;
//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);

//         //merge
//         return merge(newLeft, newRight);
//     }

//     public static void main(String args[]) {
//         // LinkedList ll = new LinkedList();
//         LinkedList<Integer> ll = new LinkedList<>();
//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);
//         //5->4->3->2->1

//         ll.print();
//         ll.head = ll.mergeSort(ll.head);
//         ll.print();

//     }
// }


// 9. New Code 

// public class LinkedList {
//      public static class Node {
//         int data; 
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;

//     public static boolean isCycle() { //Floy's CFA
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next; //+1
//             fast = fast.next.next; //+2
//             if(slow == fast) {
//                 return true;  //cycle exists
//             }
//         }

//         return false; //cycle doesn't exist
//     }

//     public static void removeCycle() {
//         //detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;
//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast == slow) {
//                 cycle = true;
//                 break;
//             }
//         }
//         if(cycle == false) {
//             return;
//         }

//         //find meeting point
//         slow = head;
//         Node prev = null; //last node
//         while(slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         //remove cycle -> last.next = null
//         prev.next = null;
//     }

//     private Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow; //mid node 
//     }

//     private Node merge(Node head1, Node head2) {
//         Node mergedLL = new Node(-1);
//         Node temp = mergedLL;

//         while(head1 != null && head2 != null) {
//             if(head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }
//         }

//         while(head1 != null) {
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }

//         while(head2 != null) {
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }

//         return mergeLL.next;   
//     }

//     public Node mergeSort(Node head) {
//         if(head == null || head.next == null) {
//             return head;
//         }
//         //find mid
//         Node mid = getMid(head);
//         //left & right MS
//         Node rightHead = mid.next;
//         mid.next = null;
//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);

//         //merge
//         return merge(newLeft, newRight);
//     }



//     public static void main(String args[]) {
//         LinkedList ll = new LinkedList();
//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);
//         //5->4->3->2->1

//         ll.print();
//         ll.head =  ll.mergeSort(ll.head);
//         ll.print();

//         //O(nlogn)
//     }
// }




// import java.util.*;

// public class StackB {
//     public static void main(String[] args) {
//         String str = new String("/a/./b/../../c/");
//         String res = simplify(str);
//         System.out.println(res);
//     }

//     static String simplify(String path) {
//         Stack<String> st = new Stack<String>();
//         String[] dirs = path.split("/");
//         for (String dir : dirs) {
//             if (dir.equals("") || dir.equals(".")) {
//                 continue;
//             } else if (dir.equals("..")) {
//                 if (!st.isEmpty())
//                     st.pop();
//             } else {
//                 st.push(dir);
//             }
//         }

//         StringBuilder res = new StringBuilder();
//         for (String dir : st) {
//             res.append("/");
//             res.append(dir);
//         }
//         if (res.length() == 0)
//             return "/";
//         return res.toString();
//     }
// }


// Microsoft 

// import java.util.*;
// import java.io.*;

// public class StackB {
//     public static void main(String[] args) {
//         String str = "/a/./b/../../c/";
//         String res = simplify(str);
//         System.out.println(res);
//     }

//     static String simplify(String A) {
//         Stack<String> st = new Stack<>();
//         String res = "/";
//         int len_A = A.length();

//         for (int i = 0; i < len_A; ) {
//             String dir = "";

//             // Skip multiple slashes
//             while (i < len_A && A.charAt(i) == '/') 
//                 i++;

//             // Extract directory name
//             while (i < len_A && A.charAt(i) != '/') 
//                 dir += A.charAt(i++);

//             if (dir.equals("..")) {
//                 if (!st.empty())
//                     st.pop();
//             } else if (!dir.equals(".") && dir.length() != 0) {
//                 st.push(dir);
//             }
//         }

//         Stack<String> st1 = new Stack<>();
//         while (!st.empty()) {
//             st1.push(st.pop());
//         }

//         while (!st1.empty()) {
//             res += st1.pop();
//             if (!st1.empty())
//                 res += "/";
//         }

//         return res;
//     }
// }

// 9 

// public class Classroom {
//     static class Node {
//         int data;
//         Node left;
//         Node right;
        
//         public Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     public static Node createMirror(Node root) { //O(n)
//         if(root == null) {
//             return null;
//         }

//         Node leftMirror = createMirror(root.left);
//         Node rightMirror = createMirror(root.right);

//         root.left = rightMirror;
//         root.right = leftMirror;
//         return root;
//     } 

//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }
    

    

//     public static void main(String args[]) {
//          /*
//                        8
//                       / \
//                      5   10
//                     / \   \
//                    3   6   11
//          */
//        Node root = new Node(8);
//        root.left = new Node(5);
//        root.right = new Node(10);
//        root.left.left = new Node(3);
//        root.left.right = new Node(6);
//        root.right.right = new Node(11); 

//         /*
//                        8
//                       / \
//                      10  5
//                     / \   \
//                    11  6   3
//                    Mirror BST
//          */

//         root = createMirror(root);
//         preorder(root);
//     }
// }

//===============================================================================================
//                                                      Binary Search Trees(Part 2)

// 1 

// public class Classroom {
//     static class Node {
//         int data;
//         Node left;
//         Node right;
        
//         public Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }
    

//     public static Node createBST(int arr[], int st, int end) {
//         if(st > end) {
//             return null;
//         }
//         int mid = (st+end)/2;
//         Node root = new Node(arr[mid]);
//         root.left = createBST(arr, st, mid-1);
//         root.right = createBST(arr, mid+1, end);
//         return root;
//     }

    

//     public static void main(String args[]) {
//         int arr[] = {3, 5, 6, 8, 10, 11, 12};
//          /*
//                         8
//                       /   \
//                      5     11
//                     / \    / \
//                    3   6  10 12
//                 expected BST
//          */
      
//          Node root = createBST(arr, 0, arr.length-1);
//          preorder(root);
//     }
// }

// 2 

// import java.util.*;
// import java.util.ArrayList;

// public class Classroom {
//     static class Node {
//         int data;
//         Node left;
//         Node right;
        
//         public Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }
    

//     public static void getInorder(Node root, ArrayList<Integer> inorder) {
//         if(root == null) {
//             return;
//         }
        
//         getInorder(root.left, inorder);
//         inorder.add(root.data);
//         getInorder(root.right, inorder);
//     }

//     public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
//         if(st > end) {
//             return null;
//         }

//         int mid = (st + end) / 2;
//         Node root = new Node(inorder.get(mid));
//         root.left = createBST(inorder, st, mid - 1);
//         root.right = createBST(inorder, mid + 1, end);
//         return root;
//     }

//     public static Node balanceBST(Node root) { //O(n) 
//         //inorder seq - O(n)
//         ArrayList<Integer> inorder = new ArrayList<>();
//         getInorder(root, inorder);


//         //sorted inorder -> balanced BST - O(n)
//         root = createBST(inorder, 0, inorder.size()-1);
//         return root;    
//     }
    

//     public static void main(String args[]) {
//         int arr[] = {3, 5, 6, 8, 10, 11, 12};
//          /*
//                         8
//                       /   \
//                      6     10
//                     /        \
//                    5          11
//                   /            \
//                  3              12
//                 given BST
//          */
//         Node root = new Node(8);
//         root.left = new Node(6);
//         root.left.left = new Node(5);
//         root.left.left.left = new Node(3);

//         root.right = new Node(10);
//         root.right.right = new Node(11);
//         root.right.right.right = new Node(12);

//         /*
//                         8
//                       /   \
//                      5     11
//                     / \    / \
//                    3   6   10 12  
//                 expected BST
//          */

//         root = balanceBST(root);
//         preorder(root);
//     }
// }

// 3
// 4

// public class Classroom {
//     static class Node {
//         int data;
//         Node left;
//         Node right;
        
//         public Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     static class Info {
//         boolean isBST;
//         int size;
//         int min;
//         int max;

//         public Info(boolean isBST, int size, int min, int max) {
//             this.isBST = isBST;
//             this.size = size;
//             this.min = min;
//             this.max = max;
//         }
//     }

//     public static int maxBST = 0;

//     public static Info largestBST(Node root) {
//         if(root == null) {
//             return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
//         }
//         Info leftInfo = largestBST(root.left);
//         Info rightInfo = largestBST(root.right);

//         int size = leftInfo.size + rightInfo.size + 1;
//         int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
//         int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

//         if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
//             return new Info(false, size, min, max);
//         }

//         if(leftInfo.isBST && rightInfo.isBST) {
//             maxBST = Math.max(maxBST, size);
//             return new Info(true, size, min, max);
//         }

//         return new Info(false, size, min, max);
//     }

//     public static void main(String args[]) {
//          /*
//                         50
//                       /    \
//                      30     60
//                     / \     / \
//                    5   20  45  70
//                                / \
//                               65  80
//                 given BST
//          */
//         Node root = new Node(50);
//         root.left = new Node(30);
//         root.left.left = new Node(5);
//         root.left.right = new Node(20);

//         root.right = new Node(60);
//         root.right.left = new Node(45);
//         root.right.right = new Node(70);
//         root.right.right.left = new Node(65);
//         root.right.right.right = new Node(80);

//         /*   
//                              60
//                             / \
//                            45  70
//                                / \
//                               65  80
//                 expected BST : size = 5
//          */

//         Info info = largestBST(root);
//         System.out.println("largest BST size = " + maxBST);

        
//     }
// }


// 5 

// import java.util.ArrayList;

// public class ClassName {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     public static void getInorder(Node root, ArrayList<Integer> arr) {
//         if(root == null) {
//             return;
//         }

//         getInorder(root.left, arr);
//         arr.add(root.data);
//         getInorder(root.right, arr);
//     }

//     public static Node createBST(ArrayList<Integer> arr, int st, int end) {
//         if(st > end) {
//             return null;
//         }
//         int mid = (st+end)/2;
//         Node root = new Node(arr.get(mid));
//         root.left = createBST(arr, st, mid-1) ;    
//         root.right = createBST(arr, mid+1, end);
//         return root;
//     }

//     public static Node mergeBSTs(Node root1, Node root2) {
//         //step1
//         ArrayList<Integer> arr1 = new ArrayList<>();
//         getInorder(root1, arr1);

//         //step 2
//         ArrayList<Integer> arr2 = new ArrayList<>();
//         getInorder(root2, arr2);

//         //merge
//         int i=0, j=0;
//         ArrayList<Integer> finalArr = new ArrayList<>();
//         while(i<arr1.size() && j<arr2.size()) {{
//             if(arr1.get(i) <= arr2.get(j)) {
//                 finalArr.add(arr1.get(i));
//                 i++;
//             } else {
//                 finalArr.add(arr2.get(j));
//                 j++;
//             }
//         }}

//         while(i<arr1.size()) {
//             finalArr.add(arr1.get(i));
//             i++;
//         }

//         while(j<arr2.size()) {
//             finalArr.add(arr2.get(j));
//             j++;
//         }

//         //sorted AL -> balanced BST
//         return createBST(finalArr, 0, finalArr.size()-1);
//     }

//     public static void preorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         System.out.print(root.data+" ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void main(String args[]) {
//         /*
//                 2
//                / \
//               1   4
//               BST1       
//         */
//         Node root1 = new Node(2);
//         root1.left = new Node(1);
//         root1.right = new Node(4);

//         /*
//                 9
//                / \
//               3   12
//               BST2      
//         */
//        Node root2 = new Node(9);
//        root2.left = new Node(3);
//        root2.right = new Node(12);

//        /*
//                 3
//               /   \
//              1     9
//               \   /  \
//                2 4   12
//               final ans : BST    
//         */
//        Node root = mergeBSTs(root1, root2);
//        preorder(root);
//     }
// }


// import java.util.PriorityQueue;
// import java.util.*;

// public class Classroom {
//     public static void main(String args[]) {
//         // 1, 2, 3, 4, 5 
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(3); //O(logn)
//         pq.add(4);
//         pq.add(1);
//         pq.add(7);

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek()); //O(1)
//             pq.remove(); //O(logn)
//         }
//     }
// }


// 2
// 3


// import java.util.PriorityQueue;
// import java.util.*;

// public class Classroom {
//     static class Student implements Comparable<Student> {
//         String name;
//         int rank;

//         public Student(String name, int rank) {
//             this.name = name;
//             this.rank = rank;
//         }

//         @Override
//         public int compareTo(Student s2) {
//             return this.rank - s2.rank;
//         }
//     }

//     public static void main(String args[]) {
//         // 1, 2, 3, 4, 5 
//         PriorityQueue<Student> pq = new PriorityQueue<>();

//         pq.add(new Student("A", 4)); //O(logn)
//         pq.add(new Student("B", 5)); 
//         pq.add(new Student("C", 2)); 
//         pq.add(new Student("D", 1)); 
      

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek().name + " ->"+ pq.peek().rank); //O(1)
//             pq.remove(); //O(logn)
//         }
//     }
// }

// 6 

// import java.util.*;

// public class Classroom {

//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data) {
//             //add at last idx
//             arr.add(data);

//             int x = arr.size()-1; //x is child index
//             int par = (x-1)/2; // par index

//             while(arr.get(x) < arr.get(par)) {
//                 //swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);
//             }

//         }
//     }

//     public static void main(String args[]) {

//     }
// }

// 7 

// import java.util.*;

// public class Classroom {

//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data) {
//             //add at last idx
//             arr.add(data);

//             int x = arr.size()-1; //x is child index
//             int par = (x-1)/2; // par index

//             while(arr.get(x) < arr.get(par)) {
//                 //swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);
//             }
//         }
//         public int peek() {
//             return arr.get(index: 0);
//         }
//     }

//     public static void main(String args[]) {

//     }
// }


// 8 


// import java.util.*;
// import java.util.ArrayList;

// public class Classroom {

//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data) {
//             //add at last idx
//             arr.add(data);

//             int x = arr.size()-1; //x is child index
//             int par = (x-1)/2; // par index

//             while(x > 0 && arr.get (x) < arr.get(par)) {
//                 //swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x-1)/2;
//             }
//         }
//         public int peek() {
//             return arr.get(0);
//         }

//         private void heapify(int i) {
//             int left = 2*i+1;
//             int right = 2*i+2;
//             int minIdx = i;

//             if(left < arr.size() && arr.get(left) < arr.get(minIdx)) {
//                 minIdx = left;
//             }

//             if(right < arr.size() && arr.get(right) < arr.get(minIdx)) {
//                 minIdx = right;
//             }


//             if(minIdx != i) {
//                 //swap
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx));
//                 arr.set(minIdx, temp);

//                 heapify(minIdx);
//             }
//         }

//         public int remove() {
//             int data = arr.get(0);

//             //step1 - swap first & last
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size() -1));
//             arr.set(arr.size() -1, temp);

//             //step - delete last
//             arr.remove(arr.size() -1);

//             //step 3 - heapify
//             if (!arr.isEmpty()) heapify(0);

//             return data;
//         }

//         public boolean isEmpty() {
//             return arr.size() == 0;
//         }
//     }

//     public static void main(String args[]) {
//         Heap h = new Heap();
//         h.add(3);
//         h.add(4);
//         h.add(1);
//         h.add(5);

//         while(!h.isEmpty()) {
//             System.out.println(h.peek());
//             h.remove();
//         }
//     }
// }


// 9 

// import java.util.*;

// public class Classroom {

//     public static void heapify(int arr[], int i, int size) {
//         int left = 2*i+1;
//         int right = 2*i+2;
//         int maxIdx = i;

//         if(left < size && arr[left] > arr[maxIdx]) {
//             maxIdx = left;
//         }

//         if(right < size && arr[right] > arr[maxIdx]) {
//             maxIdx = right;
//         }

//         if(maxIdx != i) {
//             //swap
//             int temp = arr[i];
//             arr[i] = arr[maxIdx];
//             arr[maxIdx] = temp;

//             heapify(arr, maxIdx, size);
//         }
//     }

//     public static void heapSort(int arr[]) { //O(n*logn)
//         //step1 - build maxHeap
//         int n = arr.length;
//         for(int i=n/2; i>=0; i--) {
//             heapify(arr, i, n); 
//         }

//         //step2 - push largest at end
//         for(int i=n-1; i>0; i--) {
//             //swap (largest-first with last)
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr, 0, i);
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = {1, 2, 4, 5, 3};
//         heapSort(arr);

//         //print 
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
// }

// 10 

// import java.util.*;

// public class Classroom {
//     static class Point implements Comparable<Point> {
//         int x;
//         int y;
//         int distSq;
//         int idx;

//         public Point(int x, int y, int distSq, int idx) {
//             this.x = x;
//             this.y = y;
//             this.distSq = distSq;
//             this.idx = idx;
//         }

//         @Override 
//         public int compareTo(Point p2) {
//             return this.distSq - p2.distSq;
//         }
//     }

//     public static void main(String args[]) {
//         int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
//         int k = 2;

//         PriorityQueue<Point> pq = new PriorityQueue<>();
//         for(int i = 0; i<pts.length; i++) {
//             int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
//             pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
//         }

//         //nearest K cars
//         for(int i=0; i<k; i++) {
//             System.out.println("C"+ pq.remove().idx);
//         }
//     }
// }
    
// 11 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int ropes[] = {2, 3, 3, 4, 6};

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i=0; i<ropes.length; i++) {
//             pq.add(ropes[i]);
//         }

//         int cost = 0;
//         while(pq.size() > 1) {
//             int min = pq.remove();
//             int min2 = pq.remove();
//             cost += min + min2;
//             pq.add(min+min2);
//         }

//         System.out.println("cost of connecting n ropes = " + cost);
//     }
// }

// 12 

// import java.util.*;

// public class Classroom {
//     static class Row implements Comparable<Row> {
//         int soldiers;
//         int idx;

//         public Row(int soldiers, int idx) {
//             this.soldiers = soldiers;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Row r2) {
//             if(this.soldiers == r2.soldiers) {
//                 return this.idx - r2.idx;
//             } else {
//                 return this.soldiers - r2.soldiers;
//             }
//         }
//     }

//     public static void  main(String args[]) {
//         int army[][] = {{1, 0, 0, 0},
//                         {1, 1, 1, 1},
//                         {1, 0, 0, 0},
//                         {1, 0, 0, 0}};

//         int k=2;

//         PriorityQueue<Row> pq = new PriorityQueue<>();

//         for(int i=0; i<army.length; i++) {
//             int count = 0;
//             for(int j=0; j<army[0].length; j++) {
//                 count += army[i][j] == 1 ? 1 : 0;
//             }
//             pq.add(new Row(count, i));
//         }

//         for(int i=0; i<k; i++) {
//             System.out.println("R"+ pq.remove().idx);
//         }
//     }
// }

//=================================================================  

// 13 

// import java.util.*;

// public class Classroom {
//     static class Pair implements Comparable<Pair> {
//         int val;
//         int idx;

//         public Pair(int val, int idx) {
//             this.val = val;
//             this.idx = idx;
//         }

//         @Override 
//         public int compareTo(Pair p2) {
//             //ascending
//             //return this.val - p2.val;
//             //descending
//             return p2.val - this.val;
//         }
//     }

//     public static void main(String args[]) { //O(nlogk)
//         int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
//         int k = 3; //window size
//         int res[] = new int[arr.length-k+1]; //n-k+1

//         PriorityQueue<Pair> pq = new PriorityQueue<>();

//         //1st window
//         for(int i=0; i<k; i++) {
//             pq.add(new Pair(arr[i], i));
//         }

//         res[0] = pq.peek().val;

//         for(int i=k; i<arr.length; i++) {
//             while(pq.size() > 0 && pq.peek().idx <= (i-k)) {
//                 pq.remove();
//             }

//             pq.add(new Pair(arr[i], i));
//             res[i-k+1] = pq.peek().val;
//         }

//         //print result
//         for(int i=0; i<res.length; i++) {
//             System.out.print(res[i]+ " ");
//         }
//     }
// }

//------------------------------------------------------------------------------------------------------------------------

// Heap Questions 

// 1 

// import java.io.*;
// import java.util.*;
// import java.util.ArrayList;

// class Classroom {
//     static PriorityQueue<Integer> min;
//     static int k;

//     static List<Integer> getAllKthNumber(int arr[]) {
//         List<Integer> list = new ArrayList<>();
//         for(int val: arr) {
//             if(min.size() < k) 
//                 min.add(val);
//             else {
//                 if(val > min.peek()) {
//                     min.poll();
//                     min.add(val);
//                 }
//             }

//             if(min.size() >= k) 
//                 list.add(min.peek());
//             else    
//                 list.add(-1);
//         }
//         return list;
//     }

//     public static void main(String[] args) {
//         min = new PriorityQueue<>();
//         k = 4;
//         int arr[] = {1, 2, 3, 4, 5, 6};
//         List<Integer> res = getAllKthNumber(arr);
//         for(int x: res)
//         System.out.print(x+ " ");
//     } 
// }

// 2 

// import java.io.*;
// import java.util.*;
// import java.util.LinkedList;

// class Classroom {
//     public static void minTime(int arr[], int N, int K) {
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[N+1];
//         int time = 0;
//         for(int i=0; i< K; i++) {
//             q.add(arr[i]);
//             vis[arr[i]] = true;
//         }

//         while(q.size() > 0) {
//             for(int i =0; i< q.size(); i++) {
//                 int curr = q.poll();
//                 if(curr - 1 >=  1 &&
//                     !vis[curr - 1]){
//                         vis[curr - 1] = true;
//                         q.add(curr - 1);
//                     }

//                     if(curr + 1 <= N && 
//                         !vis[curr + 1]) {
//                             vis[curr + 1] = true;
//                             q.add(curr + 1);
//                         }
//             }
//             time++;
//         }
//         System.out.println(time - 1);
//     }

//     public static void main(String[] args) {
//         int N = 6;
//         int arr[] = {2,6};
//         int K = arr.length;
//         minTime(arr, N,K);
//     }
// }
// Time Complexity : O(n)
// Space Complexity : O(n)


// 3 

// import java.util.Stack;

// class Classroom { 
//     static String decode(String str) {
//         Stack<Integer> integerstack = new Stack<>();
//         Stack<Character> stringstack = new Stack<>();
//         String temp = "", result = "";

//         for(int i = 0; i < str.length(); i++) {
//             int count = 0;

//             if(Character.isDigit(str.charAt(i))){
//                 while(Character.isDigit(str.charAt(i))) {
//                     count = count * 10 + (str.charAt(i) - '0');
//                     i++;
//                 }
//                 i--;
//                 integerstack.push(count);
//             }

//             else if(str.charAt(i) == ']'){
//                 temp = "";
//                 count = 0;
//                 if(!integerstack.isEmpty()) {
//                     count = integerstack.peek();
//                     integerstack.pop();
//                 }

//                 while(!stringstack.isEmpty() && stringstack.peek() != '['){
//                     temp = stringstack.peek() + temp;
//                     stringstack.pop();
//                 }

//                 if(!stringstack.isEmpty() && stringstack.peek() == '[')
//                     stringstack.pop();

//                 for(int j = 0; j<count; j++)
//                     result = result + temp;

//                 for(int j=0; j<result.length(); j++)
//                     stringstack.push(result.charAt(j));
//                     result = "";
//             }

//             else if(str.charAt(i) == '[') {
//                 if(Character.isDigit(str.charAt(i-1)))
//                     stringstack.push(str.charAt(i));

//                     else {
//                         stringstack.push(str.charAt(i));
//                         integerstack.push(1);
//                     }
//             }
//             else 
//                 stringstack.push(str.charAt(i));
//         }
//         while(!stringstack.isEmpty()){
//             result = stringstack.peek() + result;
//             stringstack.pop();
//         }
//         return result;
//     }
//     public static void main(String args[]) {
//         String str = "3[b2[ca]]";
//         System.out.println(decode(str));
//     }
// }
// Time Complexity : O(n2logn)
// Space Complexity : O(n2)

// 4 

// import java.util.*;
// import java.io.*;
// import java.util.ArrayList;

// class Classroom {
//     static int minops(ArrayList<Integer> nums){
//         int sum = 0;
//         for(int i = 0; i < nums.size(); i++) {
//             sum += nums.get(i);
//         }

//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//         for(int i = 0; i<nums.size(); i++) {
//             pq.add(-nums.get(i));
//         }

//         double temp = sum;
//         int cnt = 0;
//         while(temp > sum / 2) {
//             int x = -pq.peek();
//             pq.remove();
//             temp -= Math.ceil(x * 1.0/2);
//             pq.add(x/2);
//             cnt++;
//         }
//         return cnt;
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> nums = new ArrayList<Integer>(
//             List.of(
//                 4,6,3,9,10,2
//             )
//         );
//         int count = minops(nums);
//         System.out.println(count);
//     }
// }
// Time Complexity : O(nlogn)
// Space Complexity : O(n)

// 5 

// import java.util.*;

// class Node {
//     int data;
//     Node next;

//     Node(int key){
//         data = key;
//         next = null;
//     }
// }

// class NodeComparator implements Comparator<Node> {
//     public int compare(Node k1, Node k2) {
//         if(k1.data > k2.data)
//             return 1;
//         else if(k1.data < k2.data)
//             return -1;
//         return 0;
//     }
// }

// class Classroom {
//     static Node mergeKList(Node[] arr, int K){
//         PriorityQueue<Node> queue = new PriorityQueue<>(new NodeComparator());
//         Node at[] = new Node[K];
//         Node head = new Node(0);
//         Node last = head;
//         for(int i = 0; i< K; i++) {
//             if(arr[i] != null){
//                 queue.add(arr[i]);
//             }
//         }
//         if(queue.isEmpty())
//             return null;
//         while(!queue.isEmpty()){
//             Node curr = queue.poll();
//             last.next = curr;
//             last = last.next;
//             if(curr.next != null) {
//                 queue.add(curr.next);
//             }
//         }
//         return head.next;
//     }
//     public static void printList(Node node){
//         while(node != null){
//             System.out.print(node.data+ " ");
//             node = node.next;
//         }
//     }

//     public static void main(String[] args){
//         int N = 3;
//         Node[] a = new Node[N];
//         Node head1 = new Node(1);
//         a[0] = head1;
//         head1.next = new Node(3);
//         head1.next.next = new Node(5);
//         head1.next.next.next = new Node(7);

//         Node head2 = new Node(2);
//         a[1] = head2;
//         head2.next = new Node(4);
//         head2.next.next = new Node(6);
//         head2.next.next.next = new Node(8);

//         Node head3 = new Node(0);
//         a[2] = head3;
//         head3.next = new Node(9);
//         head3.next.next = new Node(10);
//         head3.next.next.next = new Node(11);

//         Node res = mergeKList(a, N);

//         if(res != null)
//             printList(res);
//         System.out.println();

//     }
// }

// 3 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         //Create
//         HashMap<String, Integer> hm = new HashMap<>();

//         //Insert
//         hm.put( "India", 100);
//         hm.put("China", 150);
//         hm.put("US", 50);

//         System.out.println(hm);

//         //Get - O(1)
//         int population = hm.get( "India");
//         System.out.println(population);

//         System.out.println(hm.get("Indonesia"));

//         //ContainsKey - O(1)
//         System.out.println(hm.containsKey("India")); //true
//         System.out.println(hm.containsKey("Indonesia")); //false

//         //Remove
//         System.out.println(hm.remove("China"));
//         System.out.println(hm);

//         //Size
//         System.out.println(hm.size());

//         //Is Empty
//         hm.clear();
//         System.out.println(hm.isEmpty());
//     }
// }

// 4 

// import java.util.*;

// public class Classroom {
//     public static void main(String args[]) {
//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("US", 50);
//         hm.put("Indonesia", 6);
//         hm.put("Nepal", 5);

//         //Iterate
//         Set<String> keys = hm.keySet();
//         System.out.println(keys);

//         for(String k : keys) {
//             System.out.println("key=" + k + ",value=" + hm.get(k));
//         }
//     }
// }

// 6 

// import java.util.*;

// public class HashMapCode {
//     static class HashMap<K, V> { //gereric
//         private class Node {
//             K key;
//             V value;
            
//             public Node(K key, V value) {
//                 this.key = key;
//                 this.value = value;
//             }
//         }

//         private int n; //n
//         private int N;
//         private LinkedList<Node>[] buckets; //N = buckets.length

//         @SuppressWarnings("unchecked")
//         public HashMap() {
//             this.N = 4;     
//             this.buckets = new LinkedList[4];
//             for(int i=0; i<4; i++) {
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }

//         private int hashFunction(K key) {
//             int hc = key.hashCode();
//             return Math.abs(hc) % N;
//         }

//         private int SearchInLL(K key, int bi) {
//             LinkedList<Node> ll = buckets[bi];
//             // int di = 0;

//             for(int i=0; i<ll.size(); i++) {
//                 Node node = ll.get(i);
//                 if(node.key.equals(key)) {
//                     return i;
//                 }
                
//             }
//             return -1;
//         }

//         private void rehash() {
//             LinkedList<Node> oldBuck[] = buckets;
//             N = 2*N;
//             buckets = new LinkedList[N];
//             for(int i=0; i<buckets.length; i++) {
//                 buckets[i] = new LinkedList<>();
//             }


//             n = 0;
//             //nodes -> add in bucket
//             for(int i=0; i<oldBuck.length; i++) {
//                 LinkedList<Node> ll = oldBuck[i];
//                 for(int j=0; j<ll.size(); j++) {
//                     Node node = ll.remove();
//                     put(node.key, node.value);
//                 }
//             }
//         }
 
//         public void put(K key, V value) {
//             int bi = hashFunction(key); //0 to 3
//             int di = SearchInLL(key); // valid; -1
//         }

//         if(di != -1) {
//             Node node = buckets[bi].get(di);
//             node.value = value;
//         } else {
//             buckets[bi].add(new Node(key, value));
//             n++;
//         }

//         double lambda = (double)n/N;
//         if(lambda > 2.0) {
//             rehash();
//         }
//     } 

//     public boolean containsKey(K key) { //O(1)
//         int bi = hashFunction(key);
//         int di = SearchInLL(key, bi);

//         if(di != -1) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public V remove(K key) { //O(1)
//         int bi = hashFunction(key);
//         int di = SearchInLL(key, bi);

//         if(di != -1) {
//             Node node = buckets[bi].get(di);
//             return node.value;
//         } else {
//             return null;
//         }
//     }

//     public V get(K key) {
//         int bi = hashFunction(key);
//         int di = SearchInLL(key, bi);

//         if(di != -1) {
//             Node node = buckets[bi].get[di];
//             return node.value;
//         } else {
//             return null;
//         }
//     }

//     public ArrayList<K> keySet() {
//         ArrayList<K> keys = new ArrayList<>();

//         for(int i=0; i<buckets.length; i++) {
//             LinkedList<Node> ll = buckets[i];
//             for(Node node : ll) {
//                 keys.add(node.key);
//             }
//         }
//         return keys;
//     }

//     public boolean isEmpty() {
//         return n == 0;
//     }



//     public static void main(String args[]) {
//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("US", 50);
//         hm.put("Nepal", 5);

//         ArrayList<String> keys = hm.keySet();
//         for(String key: keys) {
//             System.out.println(keys);
//         }

//         System.out.println(hm.get("India"));
//         System.out.println(hm.remove("India"));
//         System.out.println(hm.get("India"));
//     }
// } 

// 8 

// import java.util.*;

// public class Classroom {
//     public static void main(String args[]) {
//         LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
//         lhm.put("India", 100);
//         lhm.put("China", 150);
//         lhm.put("US", 50);

//         System.out.println(lhm);
//     }
// }

// 9 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         TreeMap<String, Integer> tm = new TreeMap<>();
//         tm.put("India", 100);
//         tm.put("China", 150);
//         tm.put("US", 50);

//         System.out.println(tm);
//     }
// }

// 10 

// import java.util.*;

// public class Classroom {
//     public static void main(String args[]) {
//         int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<arr.length; i++) {
//             if(map.containsKey(arr[i])) {
//                 map.put(arr[i], map.get(arr[i]) + 1);
//             } else {
//                 map.put(arr[i], 1);
//             }
//         }

//         Set<Integer> keySet = map.keySet();
//         for (Integer key : keySet) {
//             if(map.get(key) > arr.length/3) {
//                     System.out.println(key);
//             }
//         }
//     }
// }


//              Second method


// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<arr.length; i++) {
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);    
//         }

//         for (Integer key : map.keySet()) {
//             if(map.get(key) > arr.length/3) {
//                     System.out.println(key);
//             }
//         }
//     }
// }

// 11 

// import java.util.*;

// public class Classroom {
//     public static boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) {
//             return false;
//         }

//         HashMap<Character, Integer> map = new HashMap<>();

//         for(int i=0; i<s.length(); i++) {
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         for(int i=0; i<t.length(); i++) {
//         char ch = t.charAt(i);
//             if(map.get(ch) != null) {
//                 if(map.get(ch) == 1) {
//                     map.remove(ch);
//                 } else {
//                     map.put(ch, map.get(ch) - 1);
//                 }
//             } else {
//                     return false;
//             }
//         }
//         return map.isEmpty();
//     }

    
//     public static void main(String args[]) {
//         String s = "race"; //O(n)
//         String t = "care";

//         System.out.println(isAnagram(s, t));

//     }
// }

// 12 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         HashSet<Integer> set = new HashSet<>();

//         set.add(1);
//         set.add(2);
//         set.add(4);
//         set.add(2);
//         set.add(1);

//         System.out.println(set);
//         set.clear();
//         System.out.println(set.size());
//         System.out.println(set.isEmpty());
       

//         if(set.contains(2)) {
//             System.out.println("set contains 2");
//         }
//         if(set.contains(3)) {
//             System.out.println("set contains 3");
//         }
//     }
// }

// 13 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         HashSet<String> cities = new HashSet<>();
//         cities.add("Delhi");
//         cities.add("Mumbai");
//         cities.add("Noida");
//         cities.add("Bengaluru");

//         // Iterator it = cities.iterator();
//         // while(it.hasNext()) {
//         //     System.out.println(it.next());
//         // }

//         for(String city : cities) {
//             System.out.println(city);
//         }
//     }
// }

// 14 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         // HashSet<String> cities = new HashSet<>();
//         // cities.add("Delhi");
//         // cities.add("Mumbai");
//         // cities.add("Noida");
//         // cities.add("Bengaluru");

//         // System.out.println(cities);

//         LinkedHashSet<String> lhs = new LinkedHashSet<>();
//         lhs.add("Delhi");
//         lhs.add("Mumbai");
//         lhs.add("Noida");
//         lhs.add("Bengaluru");

//         System.out.println(lhs);

        

//     }
// }


// 15 


// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         // HashSet<String> cities = new HashSet<>();
//         // cities.add("Delhi");
//         // cities.add("Mumbai");
//         // cities.add("Noida");
//         // cities.add("Bengaluru");

//         // System.out.println(cities);

//         // LinkedHashSet<String> lhs = new LinkedHashSet<>();
//         // lhs.add("Delhi");
//         // lhs.add("Mumbai");
//         // lhs.add("Noida");
//         // lhs.add("Bengaluru");

//         // System.out.println(lhs);

//         TreeSet<String> ts = new TreeSet<>();
//         ts.add("Delhi");
//         ts.add("Mumbai");
//         ts.add("Noida");
//         ts.add("Bengaluru");

//         System.out.println(ts);

        

//     }
// }

// 16 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 3, 1};
//         HashSet<Integer> set = new HashSet<>();

//         for(int i=0; i<num.length; i++) {
//             set.add(num[i]);
//         }

//         System.out.println("ans = " + set.size());
//     }
// }

// 17 

// import java.util.*;

// public class Classroom {
//     public static void main(String args[]) {
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};
//         HashSet<Integer> set = new HashSet<>();

//         //union
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         for(int i=0; i<arr2.length; i++) {
//             set.add(arr2[i]);
//         }

//         System.out.println("union = "+ set.size());

//         //intersection
//         set.clear();
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         int count = 0;
//         for(int i=0; i<arr2.length; i++) {
//             if(set.contains(arr2[i])) {
//                 count++;
//                 set.remove(arr2[i]);
//             }
//         }

//         System.out.println("intersection = " + count)
//     }
// }

// 18 

// import java.util.*;

// public class Classroom {
//     public static String getStart(HashMap<String, String> tickets) {
//         HashMap<String, String> revMap = new HashMap<>();

//         for(String key : tickets.keySet()) {
//             revMap.put(tickets.get(key), key);
//         }

//         for(String key : tickets.keySet()) {
//             if(!revMap.containsKey(key)) {
//                 return key; //starting point
//             }
//         }
        
//         return null;

//     }

//     public static void main(String args[]) { //O(n)
//         HashMap<String, String> tickets = new HashMap<>();
//         tickets.put("Chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "Chennai");
//         tickets.put("Delhi", "Goa");

//         String start = getStart(tickets);
//         System.out.print(start);
//         for(String key : tickets.keySet()) {
//             System.out.print(" -> " + tickets.get(start));
//             start = tickets.get(start);
//         }

//         System.out.println();
        

//     }
// }

// 19 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
//         HashMap<Integer, Integer> map = new HashMap<>();
//         //(sum, idx)

//         int sum = 0;
//         int len = 0;

//         for(int j=0; j<arr.length; j++) {
//             sum += arr[j];
//             if(map.containsKey(sum)) {
//                 len = Math.max(len, j-map.get(sum));
//             } else {
//                 map.put(sum , j);
//             }
//         }

//         System.out.println("largest subarray with sum as 0 => " + len);
//     }
// }

// 20 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int arr[] = {10, 2, -2, -20, 10};
//         int k = -10;

//         HashMap<Integer, Integer> map = new HashMap<>();
//         //(sum , count)
//         map.put(0, 1);

//         int sum = 0;
//         int ans = 0;

//         for(int j=0; j<arr.length; j++) { //O(n)
//             sum += arr[j]; //sum(j)
//             if(map.containsKey(sum-k)) {
//                 ans += map.get(sum-k);
//             }
//             map.put(sum, map.getOrDefault(sum, 0) + 1 );
//         }

//         System.out.println(ans);
//     }
// }


//                                          HASHING QUESTIONS

// Q1 

// import java.util.*;

// class Classroom {
//     static class Node {
//         int data;
//         int hd;
//         Node left, right;

//         public Node(int key) {
//             this.data = key;
//             this.hd = Integer.MAX_VALUE;
//             this.left = this.right = null;
//         }
//     }

//     public static void bottomViewHelper(Node root, int curr, int hd, TreeMap<Integer, int[]> m) {
//         if(root == null)
//         return;

//         // If node for a particular HD is not present, add to the map.
//         if(!m.containsKey(hd)) {
//             m.put(hd, new int[]{root.data, curr});
//         }

//         // Compare height for already
//         // present node at similar horizontal
//         // distance
//         else {
//             int[] p = m.get(hd);
//             if(p[1] <= curr) {
//                 p[1] = curr;
//                 p[0] = root.data;
//             }
//             m.put(hd, p);
//         }

//         // call for left subtree
//         bottomViewHelper(root.left, curr + 1, hd - 1, m);

//         // call for right subtree
//         bottomViewHelper(root.right, curr + 1, hd + 1, m);
//     }

//     public static void printBottomView(Node root) {
//         // Map to store Horizontal Distance, Height and Data.
//         TreeMap<Integer, int[]> m = new TreeMap<>();

//         bottomViewHelper(root, 0, 0, m);

//         // Prints the values stored by printBottomViewUtil()
//         for(int val[] : m.values())
//         {
//             System.out.print(val[0] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Node root = new Node(20);
//         root.left = new Node(8);
//         root.right = new Node(22);
//         root.left.left = new Node(5);
//         root.left.right = new Node(3);
//         root.right.left = new Node(4);
//         root.right.right = new Node(25);
//         root.left.right.left = new Node(10);
//         root.left.right.right = new Node(14);

//         System.out.println("Bottom view of the given binary tree:");
//         printBottomView(root);
//     }
// }

// Q2 


// import java.util.*;

// public class Classroom {

//     public static int[] twoSum(int[] arr, int target) {
//         Map<Integer, Integer> visited = new HashMap<>();

//         for(int i=0; i<arr.length; i++) {
//             //diff = given taget - number given at ith index
//             int diff = target - arr[i];

//             // check if found difference is present in the MAP list
//             if(visited.containsKey(diff)) {
//                 //if difference in map matches with the ith index element in array
//                 return new int[] { visited.get(diff)};
         
//             }
//             //add arr element in map to match with future element if forms a pair 
//             visited.put(arr[i], i);
//         }
//         // if no matches are found
//         return new int[] {};
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 7, 11, 15};
//         int target = 9;

//         int[] result = twoSum(arr, target);

//         if(result.length == 0) {
//             System.out.println("No pair found!");
//         } else {
//             System.out.println("Indexes: " + result[0] + "," + result[1]);
//             System.out.println("Values: " + arr[result[0]] + "," + arr[result[1]]);
//         }
//     }
// }

// Q2


// import java.util.*;

// public class Classroom {

//     public static int[] twoSum(int[] arr, int target) {
//         HashMap<Integer, Integer> visited = new HashMap<>();

//         for(int i = 0; i < arr.length; i++) {
//             int diff = target - arr[i];

//             if(visited.containsKey(diff)) {
//                 return new int[] { visited.get(diff), i };
//             }

//             visited.put(arr[i], i);
//         }

//         return new int[] {}; // no pair found
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 7, 11, 15};
//         int target = 9;

//         int[] result = twoSum(arr, target);

//         if(result.length == 0) {
//             System.out.println("No pair found!");
//         } else {
//             System.out.println("Indexes: " + result[0] + ", " + result[1]);
//             System.out.println("Values: " + arr[result[0]] + ", " + arr[result[1]]);
//         }
//     }
// }

// Q3

// import java.util.*;

// public class Classroom {

//     public String frequencySort(String s) {

//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i=0; i<s.length(); ++i)
//             map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

//             PriorityQueue<Map.Entry<Character, Integer>> pq = 
//                 new PriorityQueue<>((a,b)) -> a.getValue() - b.getValue() 
//                                             ? a.getKey() - b.getKey() 
//                                             : b.getValue() - a.getValue();
//                 );

//                 for(Map.Entry<Character, Integer> e:map.entrySet()) pq.add(e);
//                 StringBuilder res = new StringBuilder();
//                 while(pq.size() != 0) {

//                     char ch = pq.poll().getKey();
//                     int val = map.get(ch);
//                     while(val != 0) {
//                         res.append(ch);
//                         val--;
//                     }
//                 }
//                 return res.toString();
//     }

//     public static void main(String[] args){
//         HashMap a = new HashMap();
//         System.out.println(c.frequencySort("tree"));
//         System.out.println(c.frequencySort("cccaaa"));
//         System.out.println(c.frequencySort("Aabb"));
//     }
// }


// import java.util.*;

// public class Classroom {

//     public String frequencySort(String s) {

//         // Step 1: Frequency map
//         HashMap<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < s.length(); ++i) {
//             map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
//         }

//         // Step 2: Max-Heap based on frequency, then alphabetical order
//         PriorityQueue<Map.Entry<Character, Integer>> pq =
//                 new PriorityQueue<>((a, b) -> 
//                     a.getValue().equals(b.getValue())
//                     ? a.getKey() - b.getKey()
//                     : b.getValue() - a.getValue()
//                 );

//         // Add all entries to PQ
//         pq.addAll(map.entrySet());

//         // Step 3: Build the result string
//         StringBuilder res = new StringBuilder();
//         while (!pq.isEmpty()) {
//             Map.Entry<Character, Integer> entry = pq.poll();

//             char ch = entry.getKey();
//             int freq = entry.getValue();

//             // append character freq times
//             while (freq-- > 0) {
//                 res.append(ch);
//             }
//         }

//         return res.toString();
//     }

//     // Optional Main Method for Testing
//     public static void main(String[] args) {
//         Classroom c = new Classroom();
//         System.out.println(c.frequencySort("tree"));  
//         System.out.println(c.frequencySort("cccaaa")); 
//         System.out.println(c.frequencySort("Aabb"));
//     }
// }


 //3

// public class Classroom {
//     static class Node {
//         Node children[] = new Node[26];
//         boolean eow = false;

//         Node() {

//         }
//     }

//     public static void main(String args[]) {
//         String words[] = {"the", "a", "there", "their", "any", "thee"};
//     }
// }

// 4

// public class Classroom {
//     static class Node {
//         Node children[] = new Node[26];
//         boolean eow = false;

//         Node() {
//             for(int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) { //O(L)
//         Node curr = root;
//         for(int level=0; level<word.length(); level++) {
//             int idx = word.charAt(level) - 'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }

//         curr.eow = true;
//     }

//     public static void main(String args[]) {
//         String words[] = {"the", "a",  "there", "any", "thee"};
//         for(int i=0; i<words.length; i++) {
//             insert(words[i]);
//         }
//     }
// }


// 5 

// public class Classroom {

//     static class Node {
//         Node[] children = new Node[26];
//         boolean eow = false;

//         Node() {
//             for (int i = 0; i< 26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for(int level=0; level<word.length(); level++) {
//             int idx = word.charAt(level) - 'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }

//         curr.eow = true;
//     }

//     public static boolean search(String key) {
//         Node curr = root;
//         for(int level=0; level<key.length(); level++) {
//             int idx = key.charAt(level) - 'a';
//             if(curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow == true;
//     }

//     public static void main(String args[]) {
//         String words[] = {"the", "a", "three", "any", "thee"};
//         for(int i=0; i<words.length; i++) {
//             insert(words[i]);
//         }

//         System.out.println(search("thee"));
//         System.out.println(search("thor"));
//     }
// }

// 6 

// public class Classroom {
//     static class Node {
//         Node children[] = new Node[26]; //'a' - 'z'
//         boolean eow = false;

//         public Node() {
//             for(int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for(int level=0; level<word.length(); level++) {
//             int idx = word.charAt(level) - 'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }

//         curr.eow = true;
//     }

//     public static boolean search(String key) {
//         Node curr = root;
//         for(int level=0; level<key.length(); level++) {
//             int idx = key.charAt(level) - 'a';
//             if(curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow;
//     }

//     public static boolean wordBreak(String key) {
//         if(key.length() == 0) {
//             return true;
//         }
//         for(int i=1; i<key.length(); i++) {
//             if(search(key.substring(0, i)) && 
//                 wordBreak(key.substring(i))) {
//                     return true;
//                 }
//         }

//         return false;
//     }

//     public static void main(String args[]) {
//         String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
//         for(int i=0; i<arr.length; i++) {
//             insert(arr[i]);
//         }

//         String key = "i";
//         System.out.println(wordBreak(key));
//     }
// } 




// code by chatgpt 
 
// 6

// public class Classroom {
//     static class Node {
//         Node children[] = new Node[26];
//         boolean eow = false;

//         public Node() {
//             for(int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for(int level = 0; level < word.length(); level++) {
//             int idx = word.charAt(level) - 'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String key) {
//         Node curr = root;
//         for (int level = 0; level < key.length(); level++) {
//             int idx = key.charAt(level) - 'a';
//             if (curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow;  
//     }

//     public static boolean wordBreak(String key) {
//         if (key.length() == 0) {
//             return true;
//         }

//         for (int i = 1; i <= key.length(); i++) { // FIXED
//             if (search(key.substring(0, i)) &&
//                 wordBreak(key.substring(i))) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
//         for (int i = 0; i < arr.length; i++) {
//             insert(arr[i]);
//         }

//         String key = "ilikesamsung";
//         System.out.println(wordBreak(key));
//     }
// }


// 7 

// public class Classroom {
//      static class Node {
//         Node[] children = new Node[26];
//         boolean eow = false;
//         int freq;

//         public Node() {
//             for(int i=0; i<children.length; i++) {
//                 children[i] = null;
//             }
//             freq = 1;
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for(int i=0; i<word.length(); i++) {
//             int idx = word.charAt(i)-'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             } else {
//                 curr.children[idx].freq++;
//             }

//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static void findPrefix(Node root, String ans, int idx) { // O(L) logest word
//         if(root == null) {
//             return;
//         }

//         if(root.freq == 1) {
//             System.out.println(ans);
//             return;
//         }

//         for(int i=0; i<root.children.length; i++) {
//             if(root.children[i] != null) {
//                 findPrefix(root.children[i], ans+(char)(i+'a'));
//             }
//         }
//     }
 
//     public static void main(String args[]) {
//         String arr[] = {"zebra", "dog", "duck", "dove"};
//         for(int i=0; i<arr.length; i++) {
//             insert(arr[i]);
//         }
//     }
// }



// chatgpt 
//----------------------------------------
// 7 


// public class Classroom {
//     static class Node {                      // make Node static
//         Node[] children = new Node[26];
//         boolean eow = false;
//         int freq;

//         public Node() {
//             for (int i = 0; i < children.length; i++) {
//                 children[i] = null;
//             }
//             freq = 0;                        // start at 0, increment on use
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for (int i = 0; i < word.length(); i++) {
//             int idx = word.charAt(i) - 'a';
//             if (curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             // always increment freq for the child node (created or existing)
//             curr.children[idx].freq++;
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     // recursively prints unique prefixes (when node.freq == 1)
//     public static void findPrefix(Node node, String ans) {
//         if (node == null) return;

//         if (node.freq == 1) {
//             System.out.println(ans);
//             return;
//         }

//         for (int i = 0; i < node.children.length; i++) {
//             if (node.children[i] != null) {
//                 findPrefix(node.children[i], ans + (char) (i + 'a'));
//             }
//         }
//     }

//     public static void main(String[] args) {
//         String arr[] = {"zebra", "dog", "duck", "dove"};
//         for (String s : arr) {
//             insert(s);
//         }
//         // print unique prefixes for all words in trie
//         findPrefix(root, "");
//     }
// }


// 8 

// public class Classroom {
//     static class Node {
//         Node[] children = new Node[26];
//         boolean eow;

//         public Node() {
//             for (int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) { //O(n)
//         int level = 0;
//         int len = word.length();
//         int idx = 0;

//         Node curr = root;
//         for(; level<len; level++) {
//             idx = word.charAt(level)-'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];           
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String key) { //O(n)
//         int level = 0;
//         int len = key.length();
//         int idx = 0;

//         Node curr = root;
//         for(; level<len; level++) {
//             idx = key.charAt(level)-'a';
//             if(curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow == true;
//     }

//     public static boolean startsWith(String prefix) {
//         Node curr = root;

//         for(int i=0; i<prefix.length(); i++) {
//             int idx = prefix.charAt(i) - 'a';
//             if(curr.children[idx] == null) {
//                 return false;
//             }

//             curr = curr.children[idx];
//         }
//         return true;
//     }

//     public static void main(String args[]) {
//         String words[] = {"apple", "app", "mango", "man", "woman"};
//         String prefix1 = "app"; //ture
//         String prefix2 = "moon"; //false

//         for(int i=0; i<words.length; i++) {
//             insert(words[i]);
//         }

//         System.out.println(startsWith(prefix1));
//         System.out.println(startsWith(prefix2));
//     }
// }

// 9 

// public class Classroom {
//     static class Node {
//         Node[] children = new Node[26];
//         boolean eow;

//         public Node() {
//             for (int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) { //O(n)
//         int level = 0;
//         int len = word.length();
//         int idx = 0;

//         Node curr = root;
//         for(; level<len; level++) {
//             idx = word.charAt(level)-'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String key) { //O(n)
//         int level = 0;
//         int len = key.length();
//         int idx = 0;

//         Node curr = root;
//         for(; level<len; level++) {
//             idx = key.charAt(level)-'a';
//             if(curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow == true;
//     }

//     public static int countNodes(Node root){
//         if(root == null) {
//             return 0;
//         }
        
//         int count = 0;
//         for(int i=0; i<26; i++) {
//             if(root.children[i] != null) {
//                 count+= countNodes(root.children[i]);
//             }
//         }

//         return count+1;
//     }

//     public static void main(String args[]) {
//         String str = "ababa"; // ans = 10

//         //suffix -> insert in trie
//         for(int i=0; i<str.length(); i++) {
//             String suffix = str.substring(i);
//             insert(suffix);
//         }

//         System.out.println(countNodes(root));
//     }
// }

// 10 

// public class Classroom {
//     static class Node {
//         Node[] children = new Node[26];
//         boolean eow;

//         public Node() {
//             for (int i=0; i<26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) { //O(n)
//         int level = 0;
//         int len = word.length();
//         int idx = 0;

//         Node curr = root;
//         for(; level<len; level++) {
//             idx = word.charAt(level)-'a';
//             if(curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String key) { //O(n)
//         int level = 0;
//         int len = key.length();
//         int idx = 0;
//          Node curr = root;
//          for(; level<len; level++) {
//             idx = key.charAt(level)-'a';
//             if(curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//          }
//          return curr.eow == true;
//     }

//     public static String ans = "";

//     public static void longestWord(Node root, StringBuilder temp) {
//         if(root == null) {
//             return;
//         }

//         for(int i=0; i<26; i++) {
//             if(root.children[i] != null && root.children[i].eow == true) {
//                 char ch = (char)(i+'a');
//                 temp.append(ch);
//                 if(temp.length() > ans.length()) {
//                     ans = temp.toString();
//                 }
//                 longestWord(root.children[i], temp);
//                 temp.deleteCharAt(temp.length()-1); //backtrack
//             }
//         }
//     }


//     public static void main(String args[]) {
//         String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

//         for(int i=0; i<words.length; i++) {
//             insert(words[i]);
//         }
//         longestWord(root, new StringBuilder(""));

//         System.out.println(ans);

//     }
// }

//-----------------------------------------------------------------------------------

// Tries Questions 
 
// 1


// public class TrieNode {
//     List<String> data;
//     TrieNode[] children;
//     boolean isEnd;

//     TrieNode() {
//         data = new ArrayList<>();
//         children = new TrieNode[26];
//         isEnd = false;
//     }
// }

// class Classroom {
//     static TrieNode root;
//     List<List<String>> ans;

//     public List<List<String>> groupAnagrams(String[] strs) {
//         ans = new ArrayList<>();
//         root = new TrieNode();

//         for(String word: strs) {
//             build(word);
//         }

//         dfs(root);
//         return ans;
//     }

//     public void build(String s) {
//         TrieNode temp = root;

//         char[] word = s.toCharArray();
//         Arrays.sort(word);

//         for(char c: word) {
//             TrieNode child = temp.children[c-'a'];
//             if(child == null) temp.children[c-'a'] = new TrieNode();
//             temp = temp.children[c-'a'];
//         }
//         temp.isEnd = true;
//         temp.data.add(s);
//     }

//     public void dfs(TrieNode rt) {
//         if(rt.isEnd) {
//             ans.add(rt.data);
//         }

//         for(int i=0; i<26; i++) {
//             if(rt.children[i] != null){
//              dfs(rt.children[i]);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Classroom c = new Classroom();
//         String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

//         List<List<String>> groups = c.groupAnagrams(words);
//         System.out.println(groups);
//     }
// }

// Q2 

// import java.util.*;
// import java.util.ArrayList;

// public class TrieNode {
//     List<String> data;
//     TrieNode[] children;
//     boolean isEnd;

//     TrieNode() {
//         data = new ArrayList<>();
//         children = new TrieNode[26];
//         isEnd = false;
//     }
// }

// class Classroom {
//     static TrieNode root;
//     List<List<String>> ans;

//     public List<List<String>> groupAnagrams(String[] strs) {
//         ans = new ArrayList<>();
//         root = new TrieNode();

//         // Insert each word into the Trie
//         for (String word : strs) {
//             build(word);
//         }

//         // Collect results
//         dfs(root);
//         return ans;
//     }

//     // Insert sorted characters of the word into trie
//     public void build(String s) {
//         TrieNode temp = root;

//         char[] word = s.toCharArray();
//         Arrays.sort(word);  // ensures anagrams land at the same node

//         for (char c : word) {
//             int idx = c - 'a';
//             if (temp.children[idx] == null) {
//                 temp.children[idx] = new TrieNode();
//             }
//             temp = temp.children[idx];
//         }

//         // End of word
//         temp.isEnd = true;
//         temp.data.add(s);
//     }

//     // DFS traversal to collect grouped anagrams
//     public void dfs(TrieNode rt) {
//         if (rt == null) return;

//         if (rt.isEnd) {
//             ans.add(rt.data);
//         }

//         for (int i = 0; i < 26; i++) {
//             if (rt.children[i] != null) {
//                 dfs(rt.children[i]);
//             }
//         }
//     }

//     // For testing
//     public static void main(String[] args) {
//         Classroom c = new Classroom();
//         String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

//         List<List<String>> groups = c.groupAnagrams(words);
//         System.out.println(groups);
//     }
// }

// Q2 

// import java.util.*;

// class Solution {
//     private static class Node {
//         private char data;
//         private String word;
//         private boolean isEnd;
//         private Node[] children;

//         public Node(char data) {
//             this.data = data;
//             this.word = null;
//             this.isEnd = false;
//             this.children = new Node[26];
//         }
//     }

//     private Node root = new Node('/');
//     private String ans = "";

//     private void insert(String word) {
//         Node curr = this.root;
//         for(int i=0; i<word.length(); i++) {
//             int childIdx = word.charAt(i) - 'a';
//             if(curr.children[childIdx] == null) {
//                 curr.children[childIdx] = new Node(word.charAt(i));
//             }
//             curr = curr.children[childIdx];
//         }
//         curr.isEnd = true;
//         curr.word = word;
//     }

//     private void dfs (Node node) {
//         if(node == null) {
//             return;
//         }
//         if (node.word != null) {
//             if(node.word.length() > ans.length()) { // ||
//                 ans = node.word;
//             } else if (node.word.length() == ans.length() && node.word.compareTo(ans) < 0) {
//                 ans = node.word;
//             }
//         }
//         for (Node child : node.children) {
//             if(child != null && child.word != null) {
//                 dfs(child);
//             }
//         }
//     }

//     public String longestWord(String[] words) {
//         for(String word : words) {
//             insert(word);
//         }
//         Node curr = this.root;
//         dfs(curr);
//         return ans;
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         String[] words = {"w", "wo", "wor", "worl", "world"};
//         String output = sol.longestWord(words);
//         System.out.println(output);
//     }
// }


// 5 

// import java.util.*;
// import java.util.ArrayList;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }

//     }
//     public static void main(String args[]) {
//         /*
//                         (5)
//                     0--------1
//                             / \
//                         (1)/   \ (3)
//                           /     \
//                           2 ---- 3
//                           |   (1)
//                       (2) |
//                           |
//                           4
//         */
//        int V = 5;
//        ArrayList<Edge>[] graph = new ArrayList[V]; // null -> empty arrarlist

//        for(int i=0; i<V; i++) {
//             graph[i] = new ArrayList<>();
//        }

//        //0 - vertex
//        graph[0].add(new Edge(0, 1, 5));

//        //1 vertex
//        graph[1].add(new Edge(1, 0, 5));
//        graph[1].add(new Edge(1, 2, 1));
//        graph[1].add(new Edge(1, 3, 3));

//        //2 vertex
//        graph[2].add(new Edge(2, 1, 1));
//        graph[2].add(new Edge(2, 3, 1));
//        graph[2].add(new Edge(2, 4, 2));

//        //3 vertex
//        graph[3].add(new Edge(3, 1, 3));
//        graph[3].add(new Edge(3, 2, 1));

//        //4 vertex
//        graph[4].add(new Edge(4, 2, 2)); 

//        //2's neighbors
//        for(int i = 0; i < graph[2].size(); i++) {
//             Edge e = graph[2].get(i); //src, dest, wt   
//             System.out.println(e.dest);
//        }

//     }
// }



// 6 

// import java.util.*;
// import java.util.ArrayList;
// import java.util.LinkedList;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge>[] graph) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));

//         graph[6].add(new Edge(6, 5, 1));
//     }

//     public static void bfs(ArrayList<Edge>[] graph) {
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[graph.length];
//         q.add(0); //source = 0
        

//         while(!q.isEmpty()) {
//             int curr = q.remove();

//             if(!vis[curr]) { //visit curr
//                 System.out.print(curr+" ");
//                 vis[curr] = true;
//                 for(int i=0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }

//             }
//         }
//     }



//     public static void main(String args[]) {
//         /*
//             1 --- 3
//            /      | \ 
//           0       |  5 -- 6
//           \       | /
//             2 --- 4
//         */
        

//        int V  = 7;
//        ArrayList<Edge>[] graph = new ArrayList[V];
//        createGraph(graph);
//        bfs(graph);
//     }
// }

// 7 

// import java.util.*;
// import java.util.ArrayList;
// import java.util.LinkedList;


// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         graph[1].add(new Edge(1, 0, 0));
//         graph[1].add(new Edge(1, 3, 1));

//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1)); 

//         graph[6].add(new Edge(6, 5, 1));
//     }

//     public static void bfs(ArrayList<Edge>[] graph) { //O(V+E)
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[graph.length];
//         q.add(0); //source = 0

//         while(!q.isEmpty()) {
//             int curr = q.remove();

//             if(!vis[curr]) { //visit curr
//                 System.out.println(curr+" ");
//                 vis[curr] = true;
//                 for(int i=0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
//         //visit
//         System.out.print(curr+ " ");
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(!vis[e.dest]) {
//                 dfs(graph, e.dest, vis);
//             }
//         }

//     }

//     public static void main(String args[]) {
//           /*
// //             1 --- 3
// //            /      | \ 
// //           0       |  5 -- 6
// //           \       | /
// //             2 --- 4
// //         */
        
//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         dfs(graph, 0, new boolean[V]);
//     }
// }

// 8 

// import java.util.*;
// import java.util.ArrayList;
// import java.util.LinkedList;


// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     static void createGraph(ArrayList<Edge>[] graph) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         graph[1].add(new Edge(1, 0, 0));
//         graph[1].add(new Edge(1, 3, 1));

//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1)); 

//         graph[6].add(new Edge(6, 5, 1));
//     }

    
//     //O(V+E)
//     public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {
//         if(src == dest) {
//             return true;
//         }

//         vis[src] = true;

//         for(int i=0; i<graph[src].size(); i++) {
//             Edge e = graph[src].get(i);
//             // e.dest = neighbour
//             if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
//                 return true;
//             }
//         }
//         return false;   
//     }

//     public static void main(String args[]) {
//           /*
// //             1 --- 3
// //            /      | \ 
// //           0       |  5 -- 6
// //           \       | /
// //             2 --- 4
// //         */
        
//         int V = 7;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
         
//         System.out.println(hasPath(graph, 0, 6, new boolean[V]));
//     }
// }


// Graps (Part 2)

// 1

// import java.util.*;
// import java.util.ArrayList;
// import java.util.LinkedList;


// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         graph[1].add(new Edge(1, 0, 0));
//         graph[1].add(new Edge(1, 3, 1));

//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1)); 

//         graph[6].add(new Edge(6, 5, 1));
//     }

//     public static void bfs(ArrayList<Egge>[] graph) {
//         boolean vis[] = new boolean[graph.length];
//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 bfsUtil(graph, vis);
//             }
//         }
//     }

//     public static void bfsUtil(ArrayList<Edge>[] graph) { //O(V+E)
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[graph.length];
//         q.add(0); //source = 0

//         while(!q.isEmpty()) {
//             int curr = q.remove();

//             if(!vis[curr]) { //visit curr
//                 System.out.println(curr+" ");
//                 vis[curr] = true;
//                 for(int i=0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     public static void dfs(ArrayList<Edge>[] graph) {
//         boolean vis[] = new boolean[graph.length];
//         for(int i=0; i<graph.length; i++) {
//             dfsUtil(graph, i, vis);
//         }
//     }

//     public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
//         //visit
//         System.out.print(curr+ " ");
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(!vis[e.dest]) {
//                 dfs(graph, e.dest, vis);
//             }
//         }

//     }

//     public static void main(String args[]) {
//           /*
// //             1 --- 3
// //            /      | \ 
// //           0       |  5 -- 6
// //           \       | /
// //             2 --- 4
// //         */
        
//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         dfs(graph, 0, new boolean[V]);
//     }
// }

// 3

// import java.util.*;
// import java.util.ArrayList;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }
//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));
        
//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 0));
//         graph[3].add(new Edge(3, 4));

//         graph[4].add(new Edge(4, 3));
//     }

//     public static boolean detectCycle(ArrayList<Edge>[] graph) {
//         boolean vis[] = new boolean [graph.length];

//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 if(detectCycleUtil(graph, vis, i, -1)) {
//                     return true;
//                     //cycle exists in one of the parts 
//                 }
//             }
//         }
//         return false;
//     }

//     public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             //case3
//             if(!vis[e.dest] && detectCycleUtil(graph, vis, e.dest, curr)) {
//                 return true;
//             }
//             //case1
//             else if(vis[e.dest] && e.dest != par) {
//                 return true;
//             }
//             //case 2 -> do nothing -> continue
//         }
        
//         return false;
//     }

//     public static void main(String arps[]) {
//          /*
//                  0-------3
//                 /|       |
//               /  |       |
//              1   |       |
//               \  |       4
//                \ |
//                  2 
                 
//          */
//         int V = 5;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         System.out.println(detectCycle(graph));
//     }
// }

// 04

// import java.util.*;
// import java.util.LinkedList;
// import java.util.ArrayList;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//     }

//     //O(V+E)
//     public static boolean isBipartite(ArrayList<Edge>[] graph) {
//         int col[] = new int[graph.length];
//         for(int i=0; i<col.length; i++) {
//             col[i] = -1; //no color
//         }

//         Queue<Integer> q = new LinkedList<>();

//         for(int i=0; i<graph.length; i++) {
//             if(col[i] == -1) { //BFS
//                 q.add(i);
//                 col[i] = 0; //yellow
//                 while(!q.isEmpty()) {
//                     int curr = q.remove();
//                     for(int j=0; j<graph[curr].size(); j++) {
//                         Edge e = graph[curr].get(j); //e.dest
//                         if(col[e.dest] == -1) {
//                             int nextCol = col[curr] == 0 ? 1 : 0;
//                             col[e.dest] = nextCol;
//                             q.add(e.dest);
//                         } else if(col[e.dest] == col[curr]) {
//                             return false; //NOT bipartite
//                         }
//                     }
//                 }
//             }
//         }
//         return true;
//      }

//     public static void main(String args[]) {
//         /* 
//                 0 ------ 2
//                /        /  
//               /        /
//              1        4
//               \      /
//                \    /
//                   3
//                   FALSE
//         */

//        int V = 5;
//        ArrayList<Edge> graph[] = new ArrayList[V];
//        createGraph(graph);
//        System.out.println(isBipartite(graph));

//     }
// }

// 05 

// import java.util.*;
// import java.util.ArrayList;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) { //TRUE - cycle
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));

//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 0));   
//     }

//     public static boolean isCycle(ArrayList<Edge>[] graph) {
//         boolean vis[] = new boolean[graph.length];
//         boolean stack[] = new boolean[graph.length];

//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 if(isCycleUtil(graph, i, vis, stack)) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
//         vis[curr] = true;
//         stack[curr] = true;

        

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(stack[e.dest]) {
//                 return true;
//             }
//             if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
//                 return true;
//             }
//         }
//         stack[curr] = false;
//         return false;
//     }

//      @SuppressWarnings("unchecked")

//     public static void main(String args[]) {
//         int V = 4;
//         ArrayList<Edge> graph[]  = new ArrayList[V];
//         createGraph(graph);
//         System.out.println(isCycle(graph));
//     } 

// }

// 7 


import java.util.*;
import java.util.ArrayList;

public class Classroom {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) { //TRUE - cycle
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));   
        graph[5].add(new Edge(5, 2));   
    }

    public static void topSort(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                topSortUtil(graph, i, vis, s); //modified dfs
            }
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                topSortUtil(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

     @SuppressWarnings("unchecked")

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[]  = new ArrayList[V];
        createGraph(graph);

        topSort(graph);
    } 

}


