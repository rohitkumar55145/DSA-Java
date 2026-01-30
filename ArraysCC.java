// import java.util.*;

// public class ArraysCC {
//     public static void main(String args[]) {
//         int marks[] = new int[50];
//         System.out.println(marks);
//         int numbers[] = {1, 2, 3};
//         System.out.println(numbers);
//     }
// }

// 3. Arrays Input Output & Update 

// import java.util.*;

// public class ArraysCC {
//     public static void main(String args[]) {
//         int marks[] = new int[100];

//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt(); //phy
//         marks[1] = sc.nextInt(); //chem
//         marks[2] = sc.nextInt(); // math

//         System.out.println("phy : " + marks[0]);
//         System.out.println("chem : " + marks[1]);
//         System.out.println("math : " + marks[2]);

//         marks[2] = marks[2] + 2;
//         System.out.println("math : " + marks[2]);
//         System.out.println(marks.length);

//         int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("percentage : " + percentage + "%");
//     }
// }

// 4. Arrays as Function Arguments 

// import java.util.*;

// public class ArraysCC {
//     public static void update(int marks[]) {
//         for(int i=0; i<marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }

//     public static void main(String args[]) {
//         int marks[] = {97, 98, 99};
//         update(marks);

//         //print our marks
//         for(int i=0; i<marks.length; i++) {
//             System.out.print(marks[i]+ " ");
//         }
//         System.out.println();
//     }
// }

// 5. Liner Search 

// import java.util.*;
// //Linear Search
// public class ArraysCC {
//     public static int linearSearch(int numbers[], int key) {

//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i] == key) {
//                 return i;
//             }
//         }

//         return -1;
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 10;

//         int index = linearSearch(numbers, key);
//         if(index == -1) {
//             System.out.println("NOT found");
//         } else {
//             System.out.println("key is at index : " + index);
//         }
//     }
// }

// 6. Largest in Array 

// import java.util.*;
// //Largest Number in Array

// public class ArraysCC {
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE; // -infinity
//         int smallest = Integer.MAX_VALUE; // +infinity

//         for(int i=0; i<numbers.length; i++) {
//             if(largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if(smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }

//         }
//         System.out.println("smallest value is : " + smallest);

//         return largest;
//     }

//     public static void main(String args[]) {
//         int numbers[] = {1, 2, 6, 3, 5};
//         System.out.print("largest value is : " + getLargest(numbers));
//     }
// }

//                                         8. Binary Search - Code 

// import java.util.*;

// public class ArraysCC {
//     public static int binarySearch(int numbers[], int key) {
//         int start = 0,end = numbers.length-1;

//         while(start <= end) {
//             int mid = (start + end) / 2;

//             //comparisons
//             if(numbers[mid] == key) { //found
//                 return mid;
//             }
//             if(numbers[mid] < key) {
//                 start = mid + 1;
//             } else { //left
//                 end = mid-1;
//             }
//         }

//         return -1;
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 10;

//         System.out.println("index for key is : " + binarySearch(numbers, key));
//     }
// }

//                    9. Reverse in Array 

// import java.util.*;

// public class ArraysCC {
//     public static void reverse(int numbers[]) {
//         int first = 0, last = numbers.length-1;

//         while(first < last) {
//             //swap
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};

//         reverse(numbers);

//         //print
//         for(int i=0; i<numbers.length; i++) {
//             System.out.print(numbers[i]+ " ");
//         }
//         System.out.println();


//     }
// }

// 10. Pairs in Array 

// import java.util.*;
// //Pairs in an Array

// public class ArraysCC {
//     public static void printPairs(int numbers[]) {
//         int tp = 0;
//         for(int i=0; i<numbers.length; i++) {
//             int curr = numbers[i]; // 2, 4, 6, 8, 10 
//             for(int j=i+1; j<numbers.length; j++) {
//                 System.out.print("(" + curr + "," + numbers[j] + ") ");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs = " + tp);
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printPairs(numbers);
//     }
// }

// 11. Print Subarrays 

// import java.util.*;
// //Print Subarrays

// public class ArraysCC {
//     public static void printSubarrays(int numbers[]) {
//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
//                 for(int k=start; k<=end; k++) { //print
//                     System.out.print(numbers[k]+ " "); //subarray
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         printSubarrays(numbers);
//     }
// }

//                                  12. Max-Subarray Sum 

// import java.util.*;

// public class ArraysCC {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for(int k=start; k<=end; k++) { //print
//                     //subarray sum
//                     currSum += numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }

//         System.out.println("max sum = " + maxSum);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {1, -2, 6, -1, 3};
//         maxSubarraySum(numbers);
//     }

// }

//                       13. Max-Subarray Sum - II (Prifix Sum) 

// import java.util.*;
// //Print Subarrays

// public class ArraysCC {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[]= new int[numbers.length];

//         prefix[0] = numbers[0];
//         //calculate prefix array
//         for(int i=1; i<prefix.length; i++) {
//             prefix[i] = prefix[i-1] + numbers[i];
//         }

//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length;j++) {
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }

//         }

//         System.out.println("max sum = " + maxSum);

//     }

//     public static void main(String args[]) {
//         int numbers[] =  {1, -2, 6, -1, 3};
//         maxSubarraySum(numbers);
//     }
// }

//                           14. Max-Subarray Sum III ( Kadane's Algorithm)

// import java.util.*;

// public class ArraysCC {
//     public static void kadanes(int numbers[]) {
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<numbers.length; i++) {
//             cs = cs + numbers[i];
//             if(cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }

//         System.out.println("our max subarray sum is : " + ms);
//     }

//     public static void main(String args[]) {
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadanes(numbers);
//     }
// }

//                          15. Trapping Rainwater Theory
//                          16. Trapping Rainwater Code

// import java.util.*;

// public class ArraysCC {
//     public static int trappedRainwater(int height[]) {
//         int n = height.length;
//         //calculate left max boundary - array
//         int leftMax[] = new int [n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }
//         //calculate right max boundary - array 
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         int trappedWater = 0;
//         //loop 
//         for(int i=0; i<n; i++) {
//         //waterLevel = min(leftmax bound, rightmax bound)
//         int waterLevel = Math.min(leftMax[i], rightMax[i]);

//         //trapped water = waterLevel - height[i]
//         trappedWater += waterLevel - height[i];    
//         }

//         return trappedWater; 
//     }


//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.print(trappedRainwater(height)); 

//     }
// }

//                                      17. Best Time to Buy & Sell Stocks

// import java.util.*;

// public class ArraysCC {

//     public static int buyAndSellStocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++) {
//             if(buyPrice < prices[i]) { //profit
//                 int profit = prices[i] - buyPrice; // today's profit
//                 maxProfit = Math.max(maxProfit, profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }

//         return maxProfit;
//     }

//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         System.out.println(buyAndSellStocks(prices));
//     }
// }

//                                       Arrays Assignment

// Q 1.
// Given an interger array nums, return true if any value appears at least twice in the array and return false if every element is distinct.

// import java.util.*;

// public class ArraysCC {

//     public static boolean containDuplicate(int[] nums) {
//         for(int i=0; i<nums.length-1; i++) {
//             for(int j=i+1; j<nums.length; j++) {
//                 if(nums[i] == nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }


//     public static void main(String args[]) {
//         int nums[] = {1, 2, 3, 1};
//         System.out.print(containDuplicate(nums));
//     }
// }

//                                  II 

// import java.util.*;

// public class ArraysCC {
//     public static boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<nums.length; i++) {
//             if(set.contains(nums[i])) {
//                 return true;
//             } else {
//                 set.add(nums[i]);
//             }
//         }

//         return true;
//     }

//     public static void main(String args[]) {
//         int nums[] = {1, 2, 3, 1};
//         System.out.print(containsDuplicate(nums));
//     }
// }

// Q 2

// import java.util.*;

// public class ArraysCC {
//     public static int search(int[] nums, int target) { 
//         //min will have index of minimum element of nums
//         int min = minSearch(nums);
//         //find in sorted left
//         if(nums[min] <= target && target <= nums[nums.length - 1]) {
//             return search(nums,min,nums.length-1, target);
//         } 
//         //find in sorted right      
//         else {
//             return search(nums,0,min,target);
//         } 
//     }

//     // binary search to find target in left to right bondary
//     public int search(int[] nums, int left, int right,int target) {
//         int l = left;
//         int r = right;
//         // System.our.println(left+ " " + right);
//         while(l <= r) {
//             int mid = l + (r - l)/2;
//             if(nums[mid] == target) {
//                 return mid;
//             }
//             else if(nums[mid] > target) {
//                 r = mid-1;
//             }
//             else{
//                 l = mid+1;
//             }
//         }
//         return -1;
//     }
//     // smallest element index
//     public int minSearch(int[] nums) {
//         int left = 0;
//         int right = nums.length-1;
//         while(left < right) {
//             int mid = left + (right - left)/2;
//             if(mid > 0 && nums[mid-1] > nums[mid]) {
//                 return mid;
//             }
//             else if(nums[left] <= nums[mid] && nums[mid] > nums[right]) {
//                 left = mid+1;
//             }
//             else {
//                 right = mid-1;
//             }
//         }

//         return left;
//     }

//     public static void main(String args[]) {
//         int nums[] = {4, 5, 6, 7, 0, 1, 2};
//         System.out.print(search(nums));
//     }
// }

//                          Q 3. 

import java.util.*;

public class ArraysCC {
    public int maxProfit(int[] prices) {
        int buy = prices[];
        int profit = 0;

        for (int i=1; i<prices.length; i++) {
            if(buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            }
            else {
                buy = prices[i];
            }
        }

        return profit;
    }
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.print(maxProfit(prices));
    }
}
