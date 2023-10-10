//Beats 100.00% of users with java for speed. O(N)

class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode tail = result;
        int carryOver = 0;
        while(l1 != null || l2 != null){
            int val1 = (l1 == null) ? 0 :l1.val;
            int val2 = (l2 == null) ? 0 :l2.val;
            int sum = val1 + val2 + carryOver;
            if(sum >= 10){
                sum -= 10;
                carryOver = 1;
            }else{
                carryOver = 0;
            }
            tail.val = sum;
            
            l1 = (l1 == null) ? null :l1.next;
            l2 = (l2 == null) ? null :l2.next;
            tail.next = (l1 == null && l2 == null && carryOver == 0) ? null :new ListNode(carryOver);
            tail = tail.next;
        }
        return result;
    }
}