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
        // 노드가 아예 없거나 1개뿐인데 다음이 없는 경우 (사이클 불가)
        if (head == null || head.next == null) {
            return false;
        }

        // 거북이(slow)와 토끼(fast) 출발선 지정
        ListNode slow = head;
        ListNode fast = head;

        // 토끼가 결승선(null)에 도달하지 않는 한 계속 달림
        while (fast != null && fast.next != null) {
            slow = slow.next;         // 거북이는 1칸씩 이동
            fast = fast.next.next;    // 토끼는 2칸씩 이동

            // 둘이 같은 노드에서 만났다면 사이클(트랙)이 존재한다는 뜻
            if (slow == fast) {
                return true;
            }
        }

        // 토끼가 결승선(null)에 도달했다면 끝이 있다는 뜻이므로 사이클 없음
        return false;
    }
}