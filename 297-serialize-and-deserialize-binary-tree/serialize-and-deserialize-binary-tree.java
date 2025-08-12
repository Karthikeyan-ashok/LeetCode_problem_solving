/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
        {
            return "";
        }

        String ans = "";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        ans += root.val+" ";
        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            if(node.left!=null)
            {
                ans += node.left.val+" ";
                queue.offer(node.left);
            }
            else
            {
                ans += "null ";
            }

            if(node.right!=null)
            {
                ans += node.right.val+" ";
                queue.offer(node.right);
            }
            else
            {
                ans += "null ";
            }
        }
        return ans;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty())
        {
            return null;
        }

        String[] arr = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;

        while(!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            if(!arr[i].equals("null") && i<arr.length)
            {
                node.left = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(node.left);
            }
            i++;
            if(!arr[i].equals("null") && i<arr.length)
            {
                node.right = new TreeNode(Integer.parseInt(arr[i]));
                queue.offer(node.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));