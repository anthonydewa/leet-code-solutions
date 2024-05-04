public class Main {
    public static void main(String[] args) {
        // add two number
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);

        ListNode currl1 = l1;
        ListNode currl2 = l2;
        for (int i = 0; i < 6; i++) {
            ListNode new_l1 = new ListNode((currl1.val) % 10);

            currl1.next = new_l1;

            currl1 = new_l1;
        }

        for (int i = 0; i < 3; i++) {
            ListNode new_l2 = new ListNode((currl2.val) % 10);

            currl2.next = new_l2;
            currl2 = new_l2;
        }
        ListNode sss = atn.addTwoNumbers(l1, l2);

        System.out.println(sss);
    }
}
