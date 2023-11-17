package leson_19_10_23;


public class FastAndSlowFrogs {

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    //1 -> 2 -> 3 -> 4 -> 5 -> null
    public static void main(String[] args) {
        // Создание списка без петли
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        boolean hasCycle1 = hasCycle(list1);
        System.out.println("List 1 has cycle: " + hasCycle1);  // Ожидается false

        // Создание списка с петлей
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);
        list2.next.next.next.next = list2.next;  // Формируем петлю

        boolean hasCycle2 = hasCycle(list2);
        System.out.println("List 2 has cycle: " + hasCycle2);  // Ожидается true
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
