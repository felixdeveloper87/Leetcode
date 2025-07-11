package LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        // Criando list1 = [1, 2, 4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Criando list2 = [1, 3, 5, 8]
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);
        list2.next.next.next = new ListNode(8);

        // Mesclando as listas
        MergeTwoSortedLists sol = new MergeTwoSortedLists();
        ListNode merged = sol.mergeTwoLists(list1, list2);

        // Imprimindo a lista resultante
        printList(merged);
    }

    public static void printList(ListNode head) {
        System.out.print("[");
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(", ");
            }
            head = head.next;
        }
        System.out.println("]");
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); // nó auxiliar
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            System.out.println("--------------------");
            System.out.println("comparando " + list1.val + " com " + list2.val);

            if (list1.val < list2.val) {
                current.next = list1; // reaproveita o nó
                list1 = list1.next;
                System.out.print("aponta para a lista 1 ");
                printList(current.next);
            } else {
                current.next = list2; // reaproveita o nó
                list2 = list2.next;
                System.out.print("aponta para a lista 2 ");
                printList(current.next);
            }
            current = current.next;
        }

        // Se ainda restar algum nó em uma das listas
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
            System.out.print("sobrou ");
            printList(current.next);
        }

        return dummy.next;
    }
}
