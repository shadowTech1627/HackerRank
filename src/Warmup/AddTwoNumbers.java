package Warmup;

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode list1node3 = new ListNode(3);
        ListNode list1node2 = new ListNode(4, list1node3);
        ListNode list1node1 = new ListNode(2, list1node2);

        ListNode list2node3 = new ListNode(4);
        ListNode list2node2 = new ListNode(6, list2node3);
        ListNode list2node1 = new ListNode(5, list2node2);
        addTwoNumbers(list1node1, list2node1);

        System.out.println("List 1: " + list1node1.val + "->" + list1node1.next.val + "->" + list1node1.next.next.val);
        System.out.println("List 2: " + list2node1.val + "->" + list2node1.next.val + "->" + list2node1.next.next.val);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1 = -1, val2 = -1, val3 = -1;
        ListNode num1 = l1;
        ListNode num2 = l2;
        int counter = 0;
        do {
            if (num1 != null) {
                System.out.println("Num1: " + num1.val);
                if (val1 == -1) {
                    val1 = num1.val;
                } else {
                    val1 = val1 + num1.val*counter*10;
                }
                num1 = num1.next;
                System.out.println("Number 1: " + val1);
            }

            if (num2 != null) {
                System.out.println("Num2: " + num2.val);
                if (val2 == -1) {
                    val2 = num2.val;
                } else {
                    val2 = val2 * 10 + num2.val;
                }
                num2 = num2.next;
                System.out.println("Number 2: " + val2);
            }
            counter++;

        } while (num1 != null || num2 != null);
        return l1;
    }
}
