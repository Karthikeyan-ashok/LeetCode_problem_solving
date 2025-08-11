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

    static String data; 
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        String ans=root.val+" ";
        while(!queue.isEmpty()){

            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                //data+=node.val+" ";
               
                if(node.left!=null){
                 queue.offer(node.left);
                 ans+=node.left.val+" ";
                 }else{
                    ans+="null ";
                 }

                if(node.right!=null){
                    queue.offer(node.right);
                    ans+=node.right.val+" ";
                }else{
                    ans+="null ";
                 }
                 
            }
        }
        return ans;
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(""))
        return null;
       Queue<TreeNode> q=new LinkedList<>();

        String[] arr=data.split(" ");
        TreeNode node=new TreeNode(Integer.parseInt(arr[0]));
        q.add(node);
        int i=1;
        while(i<arr.length){
            TreeNode root=q.poll();
            if(!arr[i].equals("null") && i<arr.length){
                root.left=new TreeNode(Integer.parseInt(arr[i]));
                q.add(root.left);
            }
            i++;
            if(!arr[i].equals("null") && i<arr.length){
                root.right=new TreeNode(Integer.parseInt(arr[i]));
                q.add(root.right);
            }
            i++;
        }
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
/*while(!q.isEmpty()){
            int len=q.size();
            for(int j=0;j<len;j++){
            Node cur=q.poll();
            System.out.print(cur.val+" ");
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
            }
            System.out.println();
            
        }*/