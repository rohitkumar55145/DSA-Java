// import java.util.ArrayList;

// public class StackB {
//     static class Stack {
//         static ArrayList<Integer> list = new ArrayList<>();
//         public static boolean isEmpty() {
//             return list.size() == 0;
//         }

//         //push
//         public static void push(int data) {
//             list.add(data);
//         }

//         //pop
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }
//              int top = list.get(list.size() - 1);
//              list.remove(list.size() - 1);
//              return top;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return list.get(list.size() - 1);
//         }
//     }

//     public static void main(String args[]) {
//          Stack s = new Stack();
//          s.push(1);
//          s.push(2);
//          s.push(3);

//          while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//          }
//     }
// }

// 3

// import java.util.ArrayList;

// public class StackB {
//     static class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack {
//         static Node head = null;

//         public static boolean isEmpty() {
//             return head == null;
//         }

//         //push 
//         public static void push(int data) {
//             Node newNode = new Node(data);

//             if(isEmpty()) {
//                 head = newNode;
//                 return; 
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         //pop
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             } 
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         //peek 
//         public static int peek() {
//             if(isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }

//     }

//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop(); 
//         }

//     }
// }

// 4 

// import java.util.*;

// public class StackB {
//     public static void main(String args[]) {
//         // Stack s = new Stack();
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// 5 

// import java.util.*;

// public class StackB {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtBottom(s, 4);
//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
// }

// 6 

// import java.util.*;

// public class StackB {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static String reverseString(String str) {
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while(idx < str.length()) {
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuilder result = new StringBuilder("");
//         while(!s.isEmpty()) {
//             char curr = s.pop();
//             result.append(curr);
//         }

//         return result.toString();
//     }

//     public static void main(String args[]) {
//         String str = "HelloWorld";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }

// 7 

// import java.util.*;

// public class StackB {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void reverseStack(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }

//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s,top);
//     }

//     public static void printStack(Stack<Integer> s) {
//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }

//     public static void main(String args[]) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         //3, 2, 1
//         reverseStack(s);
//         printStack(s);
//         //1, 2, 3
//     }
// }

// 8 

// import java.util.*;

// public class StackB {
//     public static void stockSpan(int stocks[], int span[]) {
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);

//         for(int i=1; i<stocks.length; i++) {
//             int currPrice = stocks[i];
//             while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
//                 s.pop();
//             }
//             if(s.isEmpty()) {
//                 span[i] = i+1;
//             } else {
//                 int prevHigh = s.peek();
//                 span[i] = i - prevHigh;
//             }

//             s.push(i);
//         }        
//     }

//     public static void main(String args[]) {
//         int stocks[] = {100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int[stocks.length];
//         stockSpan(stocks, span);

//         for(int i=0; i<span.length; i++) {
//                 System.out.println(span[i]+ " ");
//         }
//     }
// }

// 9
// 10

// import java.util.*;

// public class StackB {
//     public static void main(String args[]) { //O(n)
//         int arr[] = {6, 8, 0, 1, 3};
//         Stack<Integer> s = new Stack<>();
//         int nxtGreater[] = new int[arr.length];

//         for(int i=arr.length-1; i>=0; i--) {
//             //1 while
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }

//             //2 if-else
//             if(s.isEmpty()) {
//                 nxtGreater[i] = -1;
//             } else {
//                 nxtGreater[i] = arr[s.peek()];
//             }

//             //3 push in s
//             s.push(i);
//         }

//         for(int i=0; i<nxtGreater.length; i++) {
//             System.out.print(nxtGreater[i]+ " ");
//         }
//         System.out.println();

//         //next Greater Right
//         //next Greater Left
//         //next Smaller Right
//         //next Smaller Left
//     }
// }

// 11 
// 12 

// import java.util.*;

// public class StackB {
//     public static boolean isValid(String str) {
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++) { 
//             char ch = str.charAt(i);
            
//             if(ch == '(' || ch == '{' || ch == '[') { //opening
//                 s.push(ch);
//             } else {
//                 //closing
//                 if(s.isEmpty()) {
//                     return false;
//                 }
//                 if( (s.peek() == '(' && ch == ')') //()
//                     || (s.peek() == '{' && ch == '}') //{}
//                     || (s.peek() == '[' && ch == ']')) { //[]
//                         s.pop();
//                     } else {
//                         return false;
//                 }
//             }
//         }

//         if(s.isEmpty()) {
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void main(String args[]) {
//         String str = "({})[]"; //true
//         System.out.println(isValid(str));
//     }
// }


// 13
// 14

// import java.util.*;

// public class StackB {
//     public static boolean isDuplicate(String str) {
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);

//             //closing
//             if(ch == ')') {
//                 int count = 0;
//                 while(s.peek() != '(') {
//                     s.pop();
//                     count++;
//                 }
//                 if(count < 1) {
//                     return true; //duplicate
//                 } else {
//                     s.pop(); // opening pair
//                 }
//             } else {
//                 //opening
//                 s.push(ch);
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         //Valid String
//         String str = "((a+b))"; //true
//         String str2 = "(a-b)"; //false
//         System.out.println(isDuplicate(str));
//     }
// }

// 16 

// import java.util.*;

// public class StackB {
//     public static void maxArea(int arr[]) { //O(n) - optimized
//         int maxArea = 0;
//         int nsr[] = new int[arr.length];
//         int nsl[] = new int[arr.length];

//         //Next Smaller Right = O(n)
//         Stack<Integer> s =new Stack<>();

//         for(int i=arr.length-1; i>=0; i--) {
//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                 s.pop();
//             }
//             if(s.isEmpty()) {
//                 nsr[i] = arr.length;
//             } else {
//                 nsr[i] = s.peek();
//             }
//             s.push(i);
//         }

//         //Next Smaller Left - O(n)
//         s = new Stack<>();

//         for(int i=0; i<arr.length; i++) {
//             while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//                 s.pop();
//             }
//             if(s.isEmpty()) {
//                 nsl[i] = -1;
//             } else {
//                 nsl[i] = s.peek();  
//             }
//             s.push(i);
//         }

//         //Current Area : width = j-i-1 = nsr[i]=nsl[i]-1 - O(n)
//         for(int i=0; i<arr.length; i++) {
//             int height = arr[i];
//             int width = nsr[i] - nsl[i] - 1;
//             int currArea = height * width;
//             maxArea = Math.max(currArea, maxArea);
//         }
//         System.out.println("max area in histogram = " + maxArea);

//     }


//     public static void main(String args[]) {
//         int arr[] = {2, 1, 5, 6, 2, 3}; //heights in histogram
//         maxArea(arr);
//      }
// }

//--------------------------------------------------------------------------------------------------

//                                                   Stack Question
// Q1 

// import java.util.*;

// public class StackB {
//     public static void main(String args[]) {
//         Node one = new Node(1);
//         Node two = new Node(2);
//         Node three = new Node(3);
//         Node four = new Node(4);
//         Node five = new Node(3);
//         Node six = new Node(2);
//         Node seven = new Node(1);

//         one.ptr = two;
//         two.ptr = three;
//         three.ptr = four;
//         four.ptr = five;
//         five.ptr = six;
//         six.ptr = seven;

//         boolean condition = isPalindrome(one);
//         System.out.println("Palindrome: "+ condition);
//     }
//     static boolean isPalindrome(Node head) {

//         Node slow = head;
//         boolean ispalin = true;
//         Stack<Integer> stack = new Stack<Integer>();

//         while(slow!=null) {
//             stack.push(slow.data);
//             slow = slow.ptr;
//         }

//         while(head != null) {
//             int i = stack.pop();
//             if (head.data == i) {
//                 ispalin = true;
//             } else {
//                 ispalin = false;
//                 break;
//             }
//             head = head.ptr;
//         }
//         return ispalin;
//     }
// }

// class Node {
//     int data;
//     Node ptr;
//     Node(int d) {
//         ptr = null;
//         data = d;   
//     }
// }
// Time Complexity: O(n)
// Space Complexity: O(n)


// Q2 


// import java.util.*;
// import java.io.*;

// public class StackB {
//     public static void main(String[] args) {
//         String str = new String("/a/./b/../../c/");
//         String res = simplify(str);
//         System.out.println(res);
//     }

//     static String simplify(String A) {
//         Stack<String> st = new Stack<String>();
//         String res = "";
//         res += "/";
//         int len_A = A.length();

//         for(int i=0; i < len_A; i++) {
//             String dir = "";

//             while(i < len_A && A.charAt(i) == '/') 
//                 i++;

//             while(i < len_A && A.charAt(i) != '/')
//                 dir += A.charAt(i);
//                 i++;
//         }

//         if(dir.equals("..") == true) {
//             if(!st.empty())
//                 st.pop();
//         }

//         else if(dir.equals(".") == true)
//             continue;

//         else if(dir.length() != 0) 
//             st.push(dir);
//     }

//     Stack<String> st1 = new Stack<String>();
//     while(!st.empty()) {
//         st1.push(st.pop());
//     }

//     while(!st1.empty()) {
//         if(st1.size() != 1)
//             res += (st1.pop() + "/");
//             else {
//                 res += st1.pop();
//             }
//         return res;

//     }
// }
// Time Complexity : O(n)
// Space Complexity : O(1)

// Q3 

// import java.util.Stack;

// class StackB {
//     static String decode(String str) {
//         Stack<Integer> integerstack = new Stack<>();
//         Stack<Character> stringstack = new Stack<>();
//         String temp = "", result = "";

//         for(int i = 0; i<str.length(); i++) {
//             int count = 0;
//             if (Character.isDigit(str.charAt(i))){
//                 while(Character.isDigit(str.charAt(i))){
//                     count = count * 10 + str.charAt(i) - '0';
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

//                 if(!stringstack.empty() && stringstack.peek() == '[')
//                     stringstack.pop();

//                 for (int j=0; j<count; j++)
//                     result = result + temp;
                
//                 for(int j=0; j<result.length(); j++) 
//                     stringstack.push(result.charAt(j));

//                     result = "";
    
//             }

//             else if(str.charAt(i) == '['){
//                 if (Character.isDigit(str.charAt(i-1)))
//                     stringstack.push(str.charAt(i));
//                 else {
//                     stringstack.push(str.charAt(i));
//                     integerstack.push(1);
//                 }
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

// Q4 

import java.io.*;
import java.util.*;

class StackB {
    
    public static int maxWater(int[] height){
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;
        for(int i=0; i<n; i++) {
            while((!stack.isEmpty())
                    &&(height[stack.peek()] < height[i])) {
                        int pop_height = height[stack.peek()];
                        stack.pop();
                        if(stack.isEmpty())
                            break;
                        int distance = i - stack.peek() - 1;
                        int min_height 
                                = Math.min(height[stack.peek()],height[i]) - pop_height;
                        ans += distance * min_height;
                    }
                    stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args){
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.print(maxWater(arr));
    }
}
