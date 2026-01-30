// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;
//         public static Node buildTree(int nodes[]) { 
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }
//     }

//     public static void main(String args[]) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         System.out.println(root.data);

//     }
// }
// Time Complexity : O(n)

// 6 

// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;
//         public static Node buildTree(int nodes[]) { 
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }

//         public static void preorder(Node root) { //O(n)
//             if(root == null) {
//                 return;
//             }
//             System.out.print(root.data+" ");
//             preorder(root.left);
//             preorder(root.right);
//         }
//     }

//     public static void main(String args[]) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);

//         tree.preorder(root);
//     }
// }

// 7 

// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;
//         public static Node buildTree(int nodes[]) { 
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }

//         public static void inorder(Node root) {
//             if(root == null) {
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data+" ");
//             inorder(root.right);
//         }
//     }

//     public static void main(String args[]) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);

//         tree.inorder(root);
//     }
// }

// 8 

// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;
//         public static Node buildTree(int nodes[]) { 
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         } 

//         public static void postorder(Node root) {
//            if(root == null){
//                 return;
//            } 
//            postorder(root.left);
//            postorder(root.right);
//            System.out.print(root.data+" ");
//         }
//     }

//     public static void main(String args[]) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);

//         tree.postorder(root);
//     }
// }

// 9 

// import java.util.*;
// import java.util.LinkedList;

// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree {
//         static int idx = -1;
//          public static Node buildTree(int nodes[]) { 
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         } 

//         //Level Order Traversal
//         public static void levelOrder(Node root) {
//             if(root == null) {
//                 return;
//             }

//             Queue<Node> q = new LinkedList<>();
//             q.add(root);
//             q.add(null);

//             while(!q.isEmpty()) {
//                 Node currNode = q.remove();
//                 if(currNode == null) {
//                     System.out.println();
//                     if(q.isEmpty()) {
//                         break;
//                     } else {
//                         q.add(null);
//                     }
//                 } else {
//                     System.out.print(currNode.data+" ");
//                     if(currNode.left != null) {
//                         q.add(currNode.left);
//                     }
//                     if(currNode.right != null) {
//                         q.add(currNode.right);
//                     }
//                 }
//             }
//         }
//     }



//     public static void main(String args[]) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);

//         tree.levelOrder(root);
//     }
// }

// 10 

// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int height(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;
//     }

//     public static void main(String args[]) {
//         /*
//                     1
//                    / \
//                   2   3
//                  / \ / \
//                 4  5 6  7

//         */
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

//        System.out.println(height(root));
//     }
// }

// 11 


// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int count(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int leftCount = count(root.left);
//         int rightCount = count(root.right);
//         return leftCount + rightCount + 1;
//     }


//     public static void main(String args[]) {
//         /*
//                     1
//                    / \
//                   2   3
//                  / \ / \
//                 4  5 6  7

//         */
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

//        System.out.println(count(root));
//     }
// }

// 12 

// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int sum(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int leftSum = sum(root.left);
//         int rightSum = sum(root.right); 
//         return leftSum + rightSum + root.data;
//     }

//     public static void main(String args[]) {
//         /*
//                     1
//                    / \
//                   2   3
//                  / \ / \
//                 4  5 6  7

//         */
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

//        System.out.println(sum(root));
//     }
// }

// 13

// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int height(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;
//     }

//     public static int diameter(Node root) { //O(n^2)
//         if(root == null) {
//             return 0;
//         }

//         int leftDiam = diameter(root.left);
//         int leftHt = height(root.left);
//         int rightDiam = diameter(root.right);
//         int rightHt = height(root.right);

//         int selfDiam = leftHt + rightHt + 1;

//         return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
//     }

//     public static void main(String args[]) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(diameter(root));

//     }
// }

// 14 

// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class Info {
//         int diam;
//         int ht;

//         public Info(int diam, int ht) {
//             this.diam = diam;
//             this.ht = ht;
//         }
//     }
//     public static Info diameter(Node root) { //O(n)
//         if(root == null) {
//             return new Info(0, 0);
//         }
//         Info leftInfo = diameter(root.left);
//         Info rightInfo = diameter(root.right);

//         int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
//         int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

//         return new Info(diam, ht);
//     }

//     public static void main(String args[]) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(diameter(root).diam);

//     }
// }


//====================================================================================================
//                                           Bindary Tree (Part 2)
// 4 


// public class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static boolean isIdentical(Node node, Node subRoot) {
//         if(node == null && subRoot == null) {
//             return true;
//         } else if(node == null || subRoot == null || node.data != subRoot.data) {
//             return false;
//         }

//         if(!isIdentical(node.left, subRoot.left)) {
//             return false;
//         }
//         if(!isIdentical(node.right, subRoot.right)) {
//             return false;
//         }
//         return true;
//     }

//     public static boolean isSubtree(Node root, Node subRoot) {
//         if(root == null) {
//             return false;   
//         }

//         if(root.data == subRoot.data) {
//             if(isIdentical(root, subRoot)) {
//                 return true;
//             }
//         }

//         return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//     }

//     public static void main(String args[]) {
//           /*
//                        1
//                       / \
//                      2   3
//                     / \ / \
//                    4  5 6  7

//            */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//          /*           
//                      2  
//                     / \ 
//                    4   5  
//            */
//         Node subRoot = new Node(2);
//         subRoot.left = new Node(4);
//         subRoot.right = new Node(5);

//         System.out.println(isSubtree(root, subRoot));


//     }
// }



// 6
// 7

// import java.util.*;
// import java.util.LinkedList;

// public class BinaryTreesB { 
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class Info {
//         Node node;
//         int hd;

//         public Info(Node node, int hd) {
//             this.node = node;
//             this.hd = hd;
//         }
//     }

//     public static void topView(Node root) {
//         //Level Order
//         Queue<Info> q = new LinkedList<>();
//         HashMap<Integer, Node> map = new HashMap<>();

//         int min = 0, max = 0;
//         q.add(new Info(root, 0));
//         q.add(null);

//         while(!q.isEmpty()) {
//             Info curr = q.remove();
//                 if(curr == null) {
//                     if(q.isEmpty()) {
//                         break;
//                     } else {
//                         q.add(null);
//                     }
//                 } else {
//                     if(!map.containsKey(curr.hd)) { //first time my hd is occurring
//                     map.put(curr.hd, curr.node);
//                 }
//                 if(curr.node.left != null) {
//                     q.add(new Info(curr.node.left, curr.hd-1));
//                     min = Math.min(min, curr.hd-1);
//                 }
//                 if(curr.node.right != null) {
//                     q.add(new Info(curr.node.right, curr.hd+1));
//                     max = Math.max(max, curr.hd+1);
//                 }
//             }         
//         }

//         for(int i=min; i<=max; i++) {
//             System.out.print(map.get(i).data+" ");
//         }
//         System.out.println();
//     }


//     public static void main(String args[]) {
//           /*
//                        1
//                       / \
//                      2   3
//                     / \ / \
//                    4  5 6  7

//            */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         topView(root);
//     }
// }


//===================================================================================================
//                                                      31. Binary Trees (Part 3)

// 1 

// import java.util.*;

// public class BinaryTreesB { 
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static void KLevel(Node root, int level, int k) { //O(N)
//         if(root == null) {
//             return;
//         }

//         if(level == k) {
//             System.out.print(root.data+" ");
//             return;
//         }

//         KLevel(root.left, level+1, k);
//         KLevel(root.right, level+1, k);
//     }


//     public static void main(String args[]) {
//           /*
//                        1
//                       / \
//                      2   3
//                     / \ / \
//                    4  5 6  7

//            */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int k = 2;

//         KLevel(root, 1, k);
//     }
// }

// 2 

// import java.util.*;
// import java.util.ArrayList;

// public class BinaryTreesB { 
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }


//     public static boolean getPath(Node root, int n, ArrayList<Node> path) {
//         if(root == null) {
//             return false;
//         }

//         path.add(root);

//         if(root.data == n) {
//             return true;
//         }

//         boolean foundLeft = getPath(root.left, n, path);
//         boolean foundRight = getPath(root.right, n, path);

//         if(foundLeft || foundRight) {
//             return true;   
//         }

//         path.remove(path.size()-1);
//         return false;
//     }


//     public static Node lca(Node root, int n1, int n2) { //O(n)
//         ArrayList<Node> path1 = new ArrayList<>();
//         ArrayList<Node> path2 = new ArrayList<>();

//         getPath(root, n1, path1);
//         getPath(root, n2, path2);

//         //last common ancestor
//         int i = 0;
//         for(; i<path1.size() && i<path2.size(); i++) {
//             if(path1.get(i) != path2.get(i)) {
//                 break;
//             }
//         }

//         //last equal node -> i-1th
//         Node lca = path1.get(i-1);
//         return lca;
//     }

//     public static void main(String args[]) {
//           /*
//                        1
//                       / \
//                      2   3
//                     / \ / \
//                    4  5 6  7

//            */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4, n2 = 5;
//         System.out.println(lca(root, n1, n2).data);

//     }
// }

// 3 

// import java.util.*;
// import java.util.ArrayList;

// public class BinaryTreesB { 
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node lca2(Node root, int n1, int n2) {
//         if(root == null || root.data == n1 || root.data == n2) {
//             return root;
//         }

//         Node leftLca = lca2(root.left, n1, n2);
//         Node rightLca = lca2(root.right, n1, n2);

//         //leftLCA=val rightLca = null
//         if(rightLca == null) {
//             return leftLca;
//         }
//         if(leftLca == null) { 
//             return rightLca;
//         }

//         return root;
//     }

//     public static void main(String args[]) {
//           /*
//                        1
//                       / \
//                      2   3
//                     / \ / \
//                    4  5 6  7

//            */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4, n2 = 7;
//         System.out.println(lca2(root, n1, n2).data);

//     }
// }

// 4 


// import java.util.*;

// public class BinaryTreesB { 
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node lca2(Node root, int n1, int n2) {
//         if(root == null || root.data == n1 || root.data == n2) {
//             return root;
//         }

//         Node leftLca = lca2(root.left, n1, n2);
//         Node rightLca = lca2(root.right, n1, n2);

//         //leftLCA=val rightLca = null
//         if(rightLca == null) {
//             return leftLca;
//         }
//         if(leftLca == null) { 
//             return rightLca;
//         }

//         return root;
//     }

//     public static int lcaDist(Node root, int n) {
//         if(root == null) {
//             return -1;
//         }

//         if(root.data == n) {
//             return 0;
//         }

//         int leftDist = lcaDist(root.left, n);
//         int rightDist = lcaDist(root.right, n);

//         if(leftDist == -1 && rightDist == -1) {
//             return -1;
//         } else if(leftDist == -1) {
//             return rightDist+1;
//         } else {
//             return leftDist+1;
//         }
//     }

//     public static int minDist(Node root, int n1, int n2) {
//         Node lca = lca2(root, n1, n2);
//         int dist1 = lcaDist(lca, n1);
//         int dist2 = lcaDist(lca, n2);

//         return dist1 + dist2;
//     }

//     public static void main(String args[]) {
//           /*
//                        1
//                       / \
//                      2   3
//                     / \ / \
//                    4  5 6  7

//            */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4, n2 = 6;
//         System.out.println(minDist(root, n1, n2));

//     }
// }

// 5

// import java.util.*;

// public class BinaryTreesB { 
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int KAncestor(Node root, int n, int k) {
//         if(root == null) {
//             return -1;
//         }

//         if(root.data == n) {
//             return 0;
//         }

//         int leftDist = KAncestor(root.left, n, k);
//         int rightDist = KAncestor(root.right, n, k);

//         if(leftDist == -1 && rightDist == -1) {
//             return -1;
//         }

//         int max = Math.max(leftDist, rightDist);
//         if(max+1 == k) {
//             System.out.println(root.data);
//         }
//         return max+1;
//     }

//     public static void main(String args[]) {
//           /*
//                        1
//                       / \
//                      2   3
//                     / \ / \
//                    4  5 6  7

//            */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n = 5, k = 2;
//         KAncestor(root, n, k);

//     }
// }

// 6 

// public class BinaryTreesB { 
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int transform(Node root) {
//         if(root == null) {
//             return 0;
//         }
//         int leftChild = transform(root.left);
//         int rightChild = transform(root.right);

//         int data = root.data;

//         int newLeft = root.left == null ? 0 : root.left.data;
//         int newRight = root.right == null ? 0 : root.right.data;

//         root.data = newLeft + leftChild + newRight + rightChild;
//         return data;
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
        //   /*
        //                1
        //               / \
        //              2   3
        //             / \ / \
        //            4  5 6  7

        //            expected sum tree is :

        //                27
        //               /  \
        //              9    13
        //             / \  /  \
        //            0   0 0  0  
        //    */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         transform(root);
//         preorder(root); 

//     }
// }

//==============================================================================================

// Binary Tree Questions 

// Q1 

// import java.util.*;

// class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left;
//         Node right;
//     };

//     static Node newNode(int data) {
//         Node temp = new Node();
//         temp.data = data;
//         temp.left = temp.right = null;
//         return(temp);
//     }

//     static boolean isUnivalTree(Node root) {
//         if(root == null) {
//             return true;
//         }

//         if(root.left != null 
//             && root.data != root.left.data)
//             return false;

//         if(root.right != null
//             && root.data != root.right.data)
//             return false;

//         return isUnivalTree(root.left)
//             && isUnivalTree(root.right);
//     }

//     public static void main(String[] args) {
//         Node root = newNode(1);
//         root.left = newNode(1);
//         root.right = newNode(1);
//         root.left.left = newNode(1);
//         root.left.right = newNode(1);
//         root.right.right = newNode(1);

//         if(isUnivalTree(root)) {
//             System.out.print("YES");
//         }
//         else{
//             System.out.print("NO");
//         }
//     }
// }
// Time Complexity : O(h)
// Space Complexity : O(1)

// Q2 

//     import java.util.*;

//     class Node {
//             int data;
//             Node left,right;

//             public Node(int item)
//             {
//                 data = item;
//                 left = right = null;
//             }
//         }

// public class BinaryTreesB {
//     Node root;

//     void mirror() {
//         root = mirror(root);
//     }
//     Node mirror(Node node) {
//         if(node == null)
//             return node;
//         /* do the subtrees */
//         Node left = mirror(node.left);
//         Node right = mirror(node.right);

//         /* swap the left and right pointers */
//         node.left = right;
//         node.right = left;

//         return node;
//     }

//     void inOrder() {
//         inOrder(root);
//     }

//     void inOrder(Node node) {
//         if(node == null) 
//             return;

//         inOrder(node.left);
//         System.out.print(node.data+" ");

//         inOrder(node.right);
//     }

//     public static void main(String args[]) {
//         BinaryTreesB tree = new BinaryTreesB();
//         tree.root = new Node(1);
//         tree.root.left = new Node(2);
//         tree.root.right = new Node(3);
//         tree.root.left.left = new Node(4);
//         tree.root.left.right = new Node(5);

//         System.out.println("Inorder traversal of input tree is :");
//         tree.inOrder();
//         System.out.println("");
//         tree.mirror();
//         System.out.println("Inorder traversal of binary tree is: ");
//         tree.inOrder();
//     }
// }

// Time Complexity : O(n)
// Space Complexity : O(n)

// Q3 

// class BinaryTreesB {
//     static class Node {
//         int data;
//         Node left, right;
//     }

//     static Node newNode(int data) {
//         Node newNode = new Node();
//         newNode.data = data;
//         newNode.left = null;
//         newNode.right = null;
//         return (newNode);
//     }

//     static Node deleteLeaves(Node root, int x) {
//          if(root == null) 
//             return null;
//         root.left = deleteLeaves(root.left, x);
//         root.right = deleteLeaves(root.right, x);

//         if(root.data ==  x && root.left == null && root.right == null) {
//             return null;
//         }
//         return root;
//     }

//     static void inorder(Node root) {
//         if(root == null) 
//             return;
//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }

//     public static void main(String[] args) {
//         Node root = newNode(10);
//         root.left = newNode(3);
//         root.right = newNode(10);
//         root.left.left = newNode(3);
//         root.left.right = newNode(1);
//         root.right.right = newNode(3);
//         root.right.right.left = newNode(3);
//         root.right.right.right = newNode(3);
//         deleteLeaves(root, 3);
//         System.out.print("Inorder traversal after deletion: ");
//         inorder(root);
//     }
// }
// Time Complexity : O(n)
// Space Complexity : O(1)

// Q4 

// import java.util.HashMap;

// public class BinaryTreesB {
//     static HashMap<String, Integer> m;
//     static class Node {
//         int data;
//         Node left;
//         Node right;
//         Node(int data) {
//             this.data = data;
//             left = null;
//             right = null;
//         }
//     }

//     static String inorder(Node node) {
//         if(node == null) 
//             return "";
//         String str = "(";
//         str += inorder(node.left);
//         str += Integer.toString(node.data);
//         str += inorder(node.right);
//         str += ")";

//         if(m.get(str) != null && m.get(str)== 1)
//             System.out.print(node.data+ " ");
        
//         if(m.containsKey(str))
//             m.put(str, m.get(str) + 1);
//         else 
//             m.put(str, 1);

//         return str;
//     }

//     static void printAllDups(Node root) {
//         m = new HashMap<>();
//         inorder(root);
        
//     }

//     public static void main(String args[]) {
//         Node root = null;
//         root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.right.left = new Node(2);
//         root.right.left.left = new Node(4);
//         root.right.right = new Node(4);
//         printAllDups(root);
//     }
// }
// Time Complexity : O(n*n)
// Space Complexity : O(n*n)

// Q5 

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Res {
    public int val;
}

class BinaryTreesB {
    Node root;
    int findMaxUtil(Node node, Res res) {
        if (node == null)
            return 0;
        
        int l = findMaxUtil(node.left, res);
        int r = findMaxUtil(node.right, res);

        int max_single = Math.max(Math.max(l,r)+ node.data, node.data);
        int max_top = Math.max(max_single, l + r + node.data);

        res.val = Math.max(res.val, max_top);

        return max_single;
    }

    int findMaxSum() {
        return findMaxSum(root);
    }

    int findMaxSum(Node node) {
        
        Res res = new Res();
        res.val = Integer.MIN_VALUE;

        findMaxUtil(node, res);
        return res.val;
    }

    public static void main(String args[]) {
        BinaryTreesB tree = new BinaryTreesB();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);
        System.out.println("maximum path sum is : "+ tree.findMaxSum());
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)    