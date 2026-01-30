// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }

//         public static boolean isEmpty() {
//             return rear == -1;
//         }

//         //add
//         public static void add(int data) {
//             if(rear == size-1) {
//                 System.out.println("queue is full");
//                 return;
//             }

//             rear = rear + 1;
//             arr[rear] = data;
//         }

//         //remove 
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int front = arr[0];
//             for(int i=0; i<rear; i++) {
//                 arr[i] = arr[i+1];
//             }
//             rear = rear - 1;
//             return front;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             return arr[0];
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }

//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         public static boolean isFull() {
//             return (rear+1)% size == front;
//         }

//         //add
//         public static void add(int data) {
//             if(rear == size-1) {
//                 System.out.println("queue is full");
//                 return;
//             }
//             if(front == -1) {
//                 front = 0;
//             }

//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         //remove
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int result = arr[front];

//             //last el delete
//             if(rear == front) {
//                 rear = front = -1;
//             } else {
//                 front = (front + 1) % size;
//             }
//             return result;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             return arr[front];
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

//         // 1 2 3
//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// 4. 

// public class QueueB {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         //add
//         public static void add(int data) {
//             Node newNode = new Node(data);
//             if(head == null) {
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }

//         //remove
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int front = head.data;
//             //single element
//             if(tail == head) {
//                 tail = head = null;
//             } else {
//                 head = head.next;
//             }
//             return front;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }
            
//             return head.data;
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// 5 

// import java.util.*;
// import java.util.LinkedList;

// public class QueueB {

//     public static void main(String args[]) {
//         // Queue<Integer> q = new LinkedList<>(); //ArrayDeque
//         Queue<Integer> q = new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// 6 

// import java.util.*;

// public class QueueB {
//     static class Queue {
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         //add - O(n)
//         public static void add(int data) {
//             while(!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while(!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         //remove
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("queue empty");
//                 return -1;
//             }

//             return s1.pop();
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("queue empty");
//                 return -1;
//             }

//             return s1.peek();
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

// 7 

// import java.util.*;  
// import java.util.LinkedList;

// public class QueueB {
//     static class Stack {
//         static Queue <Integer> q1 = new LinkedList<>();
//         static Queue <Integer> q2 = new LinkedList<>();

//         public static boolean isEmpty() {
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         public static void push(int data) {
//             if(!q1.isEmpty()) {
//                 q1.add(data);
//             } else {
//                 q2.add(data);
//             }
//         }

//         public static int pop() {
//             if(isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top = -1;

//             //case 1
//             if(!q1.isEmpty()) {
//                 while(!q1.isEmpty()) {
//                     top = q1.remove();
//                     if(q1.isEmpty()) {
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             } else { //case2
//                 while(!q2.isEmpty()) {
//                     top = q2.remove();
//                     if(q2.isEmpty()) {
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }

//         public static int peek() {
//              if(isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top = -1;

//              //case 1
//             if(!q1.isEmpty()) {
//                 while(!q1.isEmpty()) {
//                     top = q1.remove();
//                     q2.add(top);
//                 }
//             } else { //case2
//                 while(!q2.isEmpty()) {
//                     top = q2.remove(); 
//                     q1.add(top);
//                 }
//             }
//             return top;
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

// 8 

// import java.util.*;
// import java.util.LinkedList;

// public class QueueB {
//     public static void printNonRepeating(String str) {
//         int freq[] = new int[26]; //'a'-'z'
//         Queue<Character> q = new LinkedList<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;

//             while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
//                 q.remove();
//             }

//             if(q.isEmpty()) {
//                 System.out.print(-1+" ");
//             } else {
//                 System.out.print(q.peek()+" ");
//             }
//         }
//         System.out.println();

//     }

//     public static void main(String args[]) {
//         String str = "aabccxb";
//         printNonRepeating(str);
//     }
// }

// 9 

// import java.util.*;
// import java.util.LinkedList;

// public class QueueB {
//     public static void interLeave(Queue<Integer> q) {
//         Queue<Integer> firstHalf = new LinkedList<>();
//         int size = q.size();

//         for(int i=0; i<size/2; i++) {
//             firstHalf.add(q.remove());
//         }

//         while(!firstHalf.isEmpty()) {
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }
//     }

//     public static void main(String args[]) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);

//         interLeave(q);
//         //print Q
//         while(!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println();
//     }
// }

// 10 

// import java.util.*;
// import java.util.LinkedList;

// public class QueueB {
//     public static void reverse(Queue<Integer> q) {
//         Stack<Integer> s = new Stack<>();

//         while(!q.isEmpty()) {
//             s.push(q.remove());
//         }

//         while(!s.isEmpty()) {
//             q.add(s.pop());
//         }
//     }

//     public static void main(String args[]) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         reverse(q);

//         //print Q
//         while(!q.isEmpty()) {
//             System.out.print(q.remove()+" ");
//         }
//         System.out.println();
//     }
// }

// 11 

// import java.util.*;
// import java.util.LinkedList;

// public class QueueB {

//     public static void main(String args[]) {
//         Deque<Integer> deque = new LinkedList<>();
//         deque.addFirst(1); //1
//         deque.addFirst(2); //2 1
//         deque.addLast(3); //2 1 3
//         deque.addLast(4); //2 1 3 4
//         System.out.println(deque);
//         deque.removeLast();
//         System.out.println(deque);
//         // deque.removeFirst();
//         // System.out.println(deque);

//         System.out.println("first el = " + deque.getFirst());
//         System.out.println("last el = " + deque.getLast());
//     }
// }

// 12 
// 13

// import java.util.Deque;
// import java.util.LinkedList;

// public class QueueB {
//     static class Stack {
//         Deque<Integer> deque = new LinkedList<>();

//         public void push(int data) {
//             deque.addLast(data);
//         }

//         public int pop() {
//             return deque.removeLast();
//         }

//         public int peek() {
//             return deque.getLast();
//         }
//     }

//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         System.out.println("peek = "+ s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//     }
// }

// 14

// import java.util.Deque;
// import java.util.LinkedList;

// public class QueueB {
  
//     static class Queue {
//         Deque<Integer> deque = new LinkedList<>();

//         public void add(int data) {
//             deque.addLast(data);
//         }

//         public int remove() {
//             return deque.removeFirst();
//         }

//         public int peek() {
//             return deque.getFirst();
//         }
//     } 

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         System.out.println("peek = " + q.peek());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//     }
// }

//======================================================================================================

//                                          Queue Questions 

// Q1 

// import java.util.LinkedList;
// import java.util.Queue;

// public class QueueB {
//     static void generatePrintBinary(int n) {
//         Queue<String> q = new LinkedList<String>();
//         q.add("1");
//         while(n --> 0) {
//             String s1 = q.peek();
//             q.remove();
//             System.out.println(s1);
//             String s2 = s1;
//             q.add(s1 + "0");
//             q.add(s2 + "1");
//         }
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         generatePrintBinary(n);
//     }
// }

// Time Complexity : O(n)
// Space Complexity : O(n)

// Q2 

// import java.util.*;

// class QueueB {
//     static int minCost(int arr[], int n) {
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

//         for(int i = 0; i< n; i++) {
//             pq.add(arr[i]);
//         }

//         int res = 0;
//         while(pq.size() > 1) {
//             int first = pq.poll();
//             int second = pq.poll();
//             res += first + second;
//             pq.add(first + second);
//         }
//         return res;
//     }

//     public static void main(String args[]) {
//         int len[] = {4,3,2,6};
//         int size = len.length;
//         System.out.println("Total cost for connecting" + "ropes is " + minCost(len, size));
//     }
// }

// Q3 

// import java.util.*;
// import java.util.Collections;
// import java.util.LinkedList;
// import java.util.ArrayList;

// class QueueB {
//     static class Job {
//         char job_id;
//         int deadline;
//         int profit;
//         Job(char job_id, int deadline, int profit) {
//             this.deadline = deadline;
//             this.job_id = job_id;
//             this.profit = profit;
//         }
//     }

//     static void printJobScheduling(ArrayList<Job>arr) {
//         int n = arr.size();
//         Collections.sort(arr, (a,b)-> {
//             return a.deadline - b.deadline;
//         });
//         ArrayList<Job> result = new ArrayList<>();
//         PriorityQueue<Job> maxHeap = new PriorityQueue<> (
//             (a,b)-> {return b.profit - a.profit;});
//         for(int i = n-1; i> -1; i--) {
//             int slot_available;
//             if (i == 0) {
//                 slot_available = arr.get(i).deadline;
//             }
//             else {
//                 slot_available = arr.get(i).deadline-arr.get(i-1).deadline;
//             }
//             maxHeap.add(arr.get(i));
//             while(slot_available > 0 && maxHeap.size() > 0) {
//                 Job job = maxHeap.remove();
//                 slot_available--;
//                 result.add(job);
//             } 
//         }

//         Collections.sort(result, (a,b)-> {
//             return a.deadline - b.deadline;
//         });

//         for(Job job: result) {
//             System.out.print(job.job_id + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args){
//         ArrayList<Job> arr = new ArrayList<Job>();

//         arr.add(new Job('a', 2, 100));
//         arr.add(new Job('b', 1, 19));
//         arr.add(new Job('c', 2, 27));
//         arr.add(new Job('d', 1, 25));
//         arr.add(new Job('e', 3, 15));

//         System.out.println("Following is maximum"+ "profit sequence of jobs");
//         printJobScheduling(arr);
//     }
// }

// Time Complexity : O(nlogn)
// Space Complexity : O(n)

// Q4 

// import java.io.*;
// import java.util.*;

// class QueueB {
//     static class cell {
//         int x, y;
//         int dis;
//         public cell(int x, int y, int dis) {
//         this.x = x;
//         this.y = y;
//         this.dis = dis;
//         }
//     }

//     static boolean isInside(int x, int y, int N) {
//     if(x >= 1 && x <= N && y >= 1 && y <= N)
//         return true;
//         return false;
// }
    
// static int minStepToReachTarget(
//     int knightPos[], int targetPos[], int N) {
//         int dx[] = {-2, -1, 1, 2,-2,-2, 1,2};
//         int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

//         Vector<cell> q = new Vector<>();
//         q.add(new cell(knightPos[0], knightPos[1], 0));
//         cell t;
//         int x, y;
//         boolean visit[][] = new boolean[N + 1][N + 1];
//         visit[knightPos[0]][knightPos[1]] = true;
//         while(!q.isEmpty()) {
//             t = q.firstElement();
//             q.remove(0);
//             if(t.x == targetPos[0] && t.y == targetPos[1])
//                     return t.dis;
//             for(int i = 0; i< 8; i++) {
//                 x = t.x + dx[i];
//                 y = t.y + dy[i];
//                 if(isInside(x,y,N) && !visit[x][y]) {
//                     visit[x][y] = true;
//                     q.add(new cell(x,y,t.dis + 1));
//                 }
//             }
//         }
//         return Integer.MAX_VALUE;
//     }

//     public static void main(String[] args) {
//         int N = 30;
//         int knightPos[] = {1, 1};
//         int targetPos[] = {30, 30};
//         System.out.println(minStepToReachTarget(knightPos, targetPos, N));
//     }
// }
// Time Complexity : O(n+k)
// Space Complexity : O(k)

// Q5 

// import java.util.Deque;
// import java.util.LinkedList;

// public class QueueB {
//     static void printMax(int arr[], int n, int k) {
//         Deque<Integer> Qi = new LinkedList<Integer>();
//         int i;
//         for(i =0; i<k; ++i) {
//             while(!Qi.isEmpty() && arr[i] >=
//                 arr[Qi.peekLast()])
//              Qi.removeLast();
//             Qi.addLast(i);
//         }
//         for(; i<n; ++i) {
//             System.out.print(arr[Qi.peek()] + " ");
//             while((Qi.isEmpty()) && Qi.peek() <= i - k)
//                 Qi.removeFirst();
//                 while((!Qi.isEmpty()) && arr[i] >=
//                         arr[Qi.peekLast()])
//                     Qi.removeLast();
//                     Qi.addLast(i);
//         }
//         System.out.print(arr[Qi.peek()]);
//     }
//     public static void main(String[] args) {
//         int arr[] = {12, 1, 78, 90, 57, 89, 56};
//         int k = 3;
//         printMax(arr, arr.length, k);
//     }
// }




