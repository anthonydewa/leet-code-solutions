class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lres = new ListNode();

        int carry_over = -1;
        ListNode curr_l1 = l1;
        ListNode curr_l2 = l2;
        ListNode curr_res = lres;

        while (true) {
            // set first array current value
            int curr_l1_val = 0;
            if (curr_l1 != null) {
                curr_l1_val = curr_l1.val;
                curr_l1 = curr_l1.next;
            }

            // set second array current value
            int curr_l2_val = 0;
            if (curr_l2 != null) {
                curr_l2_val = curr_l2.val;
                curr_l2 = curr_l2.next;
            }

            int res_val = curr_l1_val + curr_l2_val;
            if (carry_over > 0) {
                res_val += carry_over;
            }

            if (res_val > 9) {
                carry_over = res_val / 10;
                res_val = res_val % 10;
            } else {
                carry_over = -1;
            }
            curr_res.val = res_val;

            if (curr_l1 != null || curr_l2 != null) {
                curr_res.next = new ListNode();
                curr_res = curr_res.next;   
            } else {
                break;
            }
        }

        if (carry_over > 0) {
            curr_res.next = new ListNode(carry_over);
        }

        return lres;
    }
}
