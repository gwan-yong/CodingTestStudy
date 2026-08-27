/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();

        ListNode curr = head;
        int i = 0;
        if(curr != null)
        while(curr.next != null){
            System.out.print("test");
            list.add(curr);
            curr = curr.next;
             if(list.contains(curr)){
                return true;
             }
        }
        return false;
    }
}