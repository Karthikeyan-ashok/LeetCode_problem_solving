/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode tem = head;
        int n = 0;
        while(head!=null)
        {
            n++;
            head = head.next;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = tem.val;
            tem = tem.next;
        }
        
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]<arr[i])
            {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            ans[st.pop()] = 0;
        }
        return ans;
    }
}