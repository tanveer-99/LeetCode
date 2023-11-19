import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair(root, 1));
        int result = 0;
        while(!queue.isEmpty()) {
            int l = queue.peek().getValue();
            int r = l;
            int size = queue.size();
            for(int i=0;i<size;i++) { 
                TreeNode currNode = queue.peek().getKey();
                r = queue.poll().getValue();
                if(currNode.left != null) {
                    queue.offer(new Pair(currNode.left, 2 * r));
                }
                if(currNode.right != null) {
                    queue.offer(new Pair(currNode.right, 2 * r + 1 ));
                }
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
//interestingly, you can't put queue.size() in a for loop, you have to store the size in a variable.
//because through every iteration, in the for loop, an element is dequeued, so the size of the queue decreases in every step in the loop.
