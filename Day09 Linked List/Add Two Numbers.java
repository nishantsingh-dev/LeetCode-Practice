Add Two Numbers

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode temp2 = null;
        int carry = 0;

        while(l1!= null && l2!= null){
            int sum = l1.val+l2.val+carry;
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1!=null || l2!= null){
            temp2 = (l1==null)? l2:l1;
        }

        while(temp2 != null){
            int sum = temp2.val+carry;
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp2= temp2.next;
            temp= temp.next;
        }

        if(carry>0){
            ListNode newNode = new ListNode(carry);
            temp.next= newNode;
        }
        return dummy.next;
    }
}