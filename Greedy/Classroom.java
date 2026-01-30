// 3 
// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};

//         //end time basis sorted
//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         //1st activity
//         maxAct = 1;
//         ans.add(0);
//         int lastEnd = end[0];
//         for(int i=1; i<end.length; i++) {
//             if(start[i] >= lastEnd) {
//                 //activity select
//                 maxAct++;
//                 ans.add(i);
//                 lastEnd = end[i];
//             }
//         }

//         System.out.println("max activities = " + maxAct);
//         for(int i=0; i<ans.size(); i++) {
//             System.out.print("A"+ans.get(i)+" ");
//         }
//         System.out.println();
//     }
// }


// Method 2 


// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};

//         //sorting
//         int activities[][] = new int [start.length][3];
//         for(int i=0; i<start.length; i++) {
//             activities[i][0] = i;
//             activities[i][1] = start[i];
//             activities[i][2] = end[i];
//         }

//         //lambda function -> sortform
//         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));



//         //end time basis sorted
//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         //1st activity
//         maxAct = 1;
//         ans.add(activities[0][0]);
//         int lastEnd = activities[0][2];
//         for(int i=1; i<end.length; i++) {
//             if(activities[i][1] >= lastEnd) {
//                 //activity select
//                 maxAct++;
//                 ans.add(activities[i][0]);
//                 lastEnd = activities[i][2];
//             }
//         }

//         System.out.println("max activities = " + maxAct);
//         for(int i=0; i<ans.size(); i++) {
//             System.out.print("A"+ans.get(i)+" ");
//         }
//         System.out.println();
//     }
// }

// 5
// 6

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int val[] = {60, 100, 120};
//         int weight[] = {10, 20, 30};
//         int W = 50;

//         double ratio[][] = new double[val.length][2];
//         // 0th col => idx; 1st col => ratio

//         for(int i=0; i<val.length; i++) {
//             ratio[i][0] = i;
//             ratio[i][1] = val[i]/(double)weight[i];
//         }

//         //ascending order
//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//         int capacity = W;
//         int finalVal = 0;
//         for(int i=ratio.length-1; i>=0; i--) {
//             int idx = (int)ratio[i][0];
//             if(capacity >= weight[idx]) { //include full item
//                 finalVal += val[idx];
//                 capacity -= weight[idx];
//             } else {
//                 //include fractional item
//                 finalVal += (ratio[i][1] * capacity);
//                 capacity = 0;
//                 break;
//             }
//         }

//         System.out.println("final value = " + finalVal);

//     }
// }

// 7 

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int A[] = {1, 2, 3};
//         int B[] = {2, 1, 3};

//         Arrays.sort(A);
//         Arrays.sort(B);

//         int minDiff = 0;

//         for(int i=0; i<A.length; i++) {
//             minDiff += Math.abs(A[i]-B[i]);
//         }

//         System.out.println("min absolute diff of pairs = " + minDiff);
//     }
// }

// 8 

// import java.util.*;

// public class Classroom {
//     public static void main(String args[]) { //O(nlogn)
//         int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

//         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

//         int chainLen = 1;
//         int chainEnd = pairs[0][1]; //Last selected pair end //chain end 

//         for(int i=1; i<pairs.length; i++) {
//             if(pairs[i][0] > chainEnd) {
//                 chainLen++;
//                 chainEnd = pairs[i][1];
//             }
//         }

//         System.out.println("max length of chain = " + chainLen);
    

//     }
// }

// 9 

// import java.util.*;

// public class Classroom {
//     public static void main(String args[]) {
//         Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

//         Arrays.sort(coins, Comparator.reverseOrder());

//         int countOfCoins = 0;
//         int amount = 590;
//         ArrayList<Integer> ans = new ArrayList<>();

//         for(int i=0; i<coins.length; i++) {
//             if(coins[i] <= amount) {
//                 while(coins[i] <= amount) {
//                     countOfCoins++;
//                     ans.add(coins[i]);
//                     amount -= coins[i];
//                 }
//             }
//         }

//         System.out.println("total (min) coins used = " + countOfCoins);

//         for(int i=0; i<ans.size(); i++) {
//             System.out.print(ans.get(i)+ " ");
//         }
//         System.out.println();
//     }
// }

// 10 

// import java.util.*;

// public class Classroom {
//     static class Job {
//         int deadline;
//         int profit;
//         int id;

//         public Job(int i, int d, int p) {
//             id = i;
//             deadline = d;
//             profit = p;
//         }
//     }

//     public static void main(String args[]) {
//         int jobsInfo[][] = {{4,20}, {1,10}, {1,40},{1,30}};

//         ArrayList<Job> jobs = new ArrayList<>();

//         for(int i=0; i<jobsInfo.length; i++) {
//             jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
//         }

//         Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit);
//         //descending order of profit

//         ArrayList<Integer> seq = new ArrayList<>();
//         int time = 0;
//         for(int i=0; i<jobs.size(); i++) {
//             Job curr = jobs.get(i);
//             if(curr.deadline > time) {
//                 seq.add(curr.id);
//                 time++;
//             }
//         }

//         //print seq
//         System.out.println("max jobs = " + seq.size());
//         for(int i=0; i<seq.size(); i++) {
//             System.out.print(seq.get(i)+" ");
//         }
//         System.out.println();
//     }
// }

// 11
// 12

// import java.util.*;

// public class Classroom {

//     public static void main(String args[]) {
//         int n = 4, m = 6;
//         Integer costVer[] = {2, 1, 3, 1, 4}; //m-1
//         Integer costHor[] = {4, 1, 2}; //n-1

//         Arrays.sort(costVer, Collections.reverseOrder());
//         Arrays.sort(costHor, Collections.reverseOrder());

//         int h = 0, v = 0;
//         int hp = 1, vp = 1;
//         int cost = 0;

//         while(h < costHor.length && v < costVer.length) {
//             if(costVer[v] <= costHor[h]) {
//                 cost += (costHor[h] * vp);
//                 hp++;
//                 h++;
//             } else { //vertical cut
//                 cost += (costVer[v] * hp);
//                 vp++;
//                 v++;
//             }
//         }

//         while(h < costHor.length) {
//             cost += (costHor[h] * vp);
//             hp++;
//             h++;
//         }

//         while(v < costVer.length) {
//             cost += (costVer[v] * hp);
//             vp++;
//             v++;
//         }

//         System.out.println("min cost of cuts = " + cost);
//     }
// }

//                                                         Comparators in Java 

// import java.util.ArrayList;
// import java.util.Collections;

// public class Classroom {
//     public static void main(String[] args) {
//         ArrayList<Person> list = new ArrayList<Person>();
//         list.add (new Person("Aman", 34));
//         list.add (new Person("Akbar", 42));
//         list.add (new Person("Anthony", 28));

//         Collections.sort (list);
//         System.out.println(list);
//     }
// }

// class Person implements Comparable<Person>{
//     String name;
//     int age;

//     Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     /**
//      * This function compares 2 objects
//      * A person object is passed as an argument
//      * and returns negative integer, zero, or a positive integer
//      * as this object is less than, equal to, or greater than the specified object.
//      */

//     @Override
//     public int compareTo(Person person) {
//         if(this.age == person.age)
//             return 0;
//         else 
//             return (this.age < person.age) ? -1 : 1;
//     }

//     @Override
//     public String toString() {
//         return this.name + ":" + this.age;
//     }
// }

//                                                  Geeedy Questions

// Q1 

// import java.util.*;

// class Classroom {
//     static int BalancedPartition(String str, int n){
//         if(n == 0)
//             return 0;

//         int r = 0, l = 0;
//         int ans = 0;
//         for(int i= 0; i< n; i++) {
//             if(str.charAt(i) == 'R'){
//                 r++;
//             }
//             else if(str.charAt(i) == 'L'){
//                 l++;
//             } 

//             if(r == l){
//                     ans++;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         String str = "LLRRRLLRRL";
//         int n = str.length();

//         System.out.print(BalancedPartition(str,n)+"\n");
//     }
// }

// Time Complexity : O(n)
// Space Complexity : O(1)

// Q2 

// class Classroom {
//     public static int kthOdd(int[] range,  int K) {
//         if(K <= 0) 
//             return 0;

//             int L = range[0];
//             int R = range[1];

//             if((R & 1) > 0) {
//                 int Count = (int) Math.ceil((R - L + 1) / 2);
//                 if(K > Count)
//                     return 0;
//                 else 
//                     return(R - 2 * K + 2);
//             } else {
//                 int Count = (R - L + 1)/2;
//                 if(K > Count)
//                     return 0;
//                 else 
//                     return (R - 2 * K + 1);
//             }
//     }

//     public static void main(String args[]) {
//         int[] p = {-10, 10};
//         int k = 8;
//         System.out.println(kthOdd(p,k));
//     }
// }
// Time Complexity : O(1)
// Space Complexity : O(1)

// Q3 

// import java.util.Arrays;

// public class Classroom {

//     public static char[] lexo_small(int n, int k) {
//         char arr[] = new char[n];
//         Arrays.fill(arr, 'a');
//         for(int i = n-1; i >= 0; i--) {
//             k -= i;
//             if(k >= 0) {
//                 if (k >= 26) {
//                     arr[i] = 'z';
//                     k -= 26;
//                 }
//                 else {
//                     arr[i] = (char)(k + 97 -1);
//                     k -= arr[i] - 'a' + 1;
//                 }
//             }
//             else 
//                 break;
//             k += i;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int n = 5, k = 42;
//         char arr[] = lexo_small(n,k);

//         System.out.print(new String(arr));
//     }
// }

// Time Complexity : O(n)
// Space Complexity : O(n)

// Q4 

// public class Classroom {
//     static int maxProfit(int prices[], int n) {
//         int buy = prices[0], max_profit = 0;
//         for(int i = 1; i< n; i++) {
//             if(buy > prices[i]) 
//                 buy = prices[i];
//             else if(prices[i] - buy > max_profit)
//                     max_profit = prices[i] - buy;
//         }
//         return max_profit;
//     }

//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 6, 4};
//         int n = prices.length;
//         int max_profit = maxProfit(prices, n);
//         System.out.println(max_profit);
//     }
// }

// Time Complexity : O(n)
// Space Complexity : O(1)

// Q5 

// class Classroom {
//     public static int ans = 10000000;
//     public static void solve(int a[], int n, int k, int index, int sum, int maxsum){
//         if(k == 1){
//             maxsum = Math.max(maxsum, sum);
//             sum = 0;
//             for(int i = index; i< n; i++) {
//                 sum += a[i];
//             }
//             maxsum = Math.max(maxsum, sum);
//             ans = Math.min(ans, maxsum);
//             return;
//         }
//         sum = 0;
//         for(int i=index; i<n; i++) {
//             sum += a[i];
//             maxsum = Math.max(maxsum, sum);
//             solve(a,n, k-1, i+1, sum, maxsum);

//         }
//     }
//     public static void main(String[] args) {
//         int  arr[] = {1,2,3,4};
//         int k = 3; //K divisions
//         int n = 4; //Size of Array
//         solve(arr, n,k,0,0,0);
//         System.out.println(ans+"\n");
//     }
// }
