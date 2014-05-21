package leetcode;

public class DeleteDuplicatesFromSortedList {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		ListNode node3 = new ListNode(2);
		node2.next = node3;
		ListNode node4 = new ListNode(3);
		node3.next = node4;
		ListNode node = deleteDuplicates(node1);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
        	return null;
        }
		if (head.next == null) {
        	return head;
        }
		ListNode p = head;
		ListNode q = head.next;
		while (q != null) {
			if (p.val == q.val) {
				p.next = q.next;
				q = q.next;
			} else {
				p = p.next;
				q = q.next;
			}
		}
		return head;
    }
}
