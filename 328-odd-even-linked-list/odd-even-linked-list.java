class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        // Step 1: Count the total number of nodes
        ListNode temp = head;
        int cnt = 0; 
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        // Step 2: Store odd-positioned node values
        int[] arr = new int[cnt];
        temp = head;
        int index = 0;
        while (temp != null) {
            arr[index++] = temp.val;
            temp = temp.next;
        }

        // Step 3: Write odd indices first, then even
        temp = head;
        int i = 0;
        // Write values at odd indices (0-based: index 0, 2, 4,...)
        for (int j = 0; j < cnt; j += 2) {
            temp.val = arr[j];
            temp = temp.next;
        }
        // Write values at even indices (0-based: index 1, 3, 5,...)
        for (int j = 1; j < cnt; j += 2) {
            temp.val = arr[j];
            temp = temp.next;
        }

        return head;
    }
}
