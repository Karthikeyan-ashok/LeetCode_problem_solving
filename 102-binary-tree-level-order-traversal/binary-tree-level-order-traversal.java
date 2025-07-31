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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        order(ans,root);
        return ans;
    }
    public void order(List<List<Integer>>ans,TreeNode root)
    {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=0;i<n;i++)
            {
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }

                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
            }
            ans.add(list);
        }
    }
}