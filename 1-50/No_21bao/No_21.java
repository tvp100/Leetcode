package LeetCode.No_21bao;

/**
 * Created by tvp100 on 2019/7/20.
 */
public class No_21 {
    //待回做
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }else if (l2 == null){
            return l1;
        }else if (l1.val < l2.val){             //1,2,4               1,3,5
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(4);
        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(3);
        n2.next.next = new ListNode(6);
        ListNode rs = mergeTwoLists(n1,n2);
        while(rs !=null){
            System.out.println(rs.val);
            rs = rs.next;
        }
    }
}
