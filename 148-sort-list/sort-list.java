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
    public ListNode sortList(ListNode head) {
        int n =0;
        ListNode temp = head;
        while(temp != null)
        {
            n=n+1;
            temp = temp.next;
        }
        int[] arr = new int[n];
        temp = head;
        int i =0;
        while(temp != null)
        {
            arr[i] = temp.val;
            temp = temp.next;
            i++;
        }
        Arrays.sort(arr);
        int j = 0;
        temp = head;
        while(temp != null)
        {
            temp.val = arr[j];
            j++;
            temp = temp.next;
        }
        return head;
    }
}