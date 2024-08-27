package linkedlist;

import java.util.*;

public class TraverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of elements");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int index = 0; index < n; index++) {
            arr[index] = sc.nextInt();
        }

        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;

        for (int i = 1; i < n; i++) {
            mover.next = new ListNode(arr[i]);
            mover = mover.next;
        }

        ListNode current = head;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(current.val);
            current = current.next;
        }

        sc.close();
    }

}

class ListNode {
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
