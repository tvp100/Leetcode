# No_2

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int temp = 0;
        int tick = 0;
        int val1 = 0;
        int val2 = 0;
        ListNode current = result;
        while(l1!=null || l2!=null){
            val1 = (l1!=null) ? l1.val : 0;
            val2 = (l2!=null) ? l2.val : 0;
            temp = val1 + val2 + tick;
            current.next = new ListNode(temp%10);
            tick = temp / 10;
            current = current.next;
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
            
        }
        if(tick==1)
            current.next = new ListNode(1);
        return result.next;
    }
}
```

