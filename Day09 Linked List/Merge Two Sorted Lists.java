Merge Two Sorted Lists

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

// Recursive Solution
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1== null){
            return l2;
        }
        if(l2== null){
            return l1;
        }

        if(l1.val<l2.val){
           l1.next = mergeTwoLists(l1.next, l2);
           return l1;
        }else{
           l2.next = mergeTwoLists(l1, l2.next);
           return l2;
        }
        
    }
}

// iterative


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
         if(list2==null){
            return list1;
            
        }
        ListNode head=null,tail=null;
        if(list1.val<= list2.val){
            head=tail=list1;
            list1=list1.next;
        }
        else{
            head=tail=list2;
            list2=list2.next;
        }

        while(list1!=null && list2!=null){
            if(list1.val<= list2.val){
                tail.next=list1;
                tail=list1;
                list1=list1.next;
            }
            else{
                tail.next=list2;
                tail=list2;
                list2=list2.next;
            }
        }

        if(list1==null){
            tail.next=list2;
        }
        else{
            tail.next=list1;
        }

        return head;
    }
}