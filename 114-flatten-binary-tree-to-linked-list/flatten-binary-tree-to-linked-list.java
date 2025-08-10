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
    public void flatten(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rec(root,list);
        if(root!=null)
        {
            list.remove(0);
            root.left = null;
        }
        for(int i : list)
        {
            root.right = new TreeNode(i);
            root = root.right;
        }
    }

    public void rec(TreeNode root, List<Integer> list)
    {
        if(root==null) 
        {
            return;
        }
        list.add(root.val);
        rec(root.left,list);
        rec(root.right,list);
    }
}