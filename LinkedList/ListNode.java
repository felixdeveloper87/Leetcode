package LinkedList;

public class ListNode {
    int val; // valor armazenado no nó
    ListNode next; // referência para o próximo nó da lista

    ListNode() {
    } // construtor vazio

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
