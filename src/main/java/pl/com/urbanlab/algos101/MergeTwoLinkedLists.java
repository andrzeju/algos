package pl.com.urbanlab.algos101;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class MergeTwoLinkedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currentNode1 = list1;
        ListNode currentNode2 = list2;
        ListNode currentNodeNew = new ListNode();
        ListNode resultList = currentNodeNew;

        if (list1 == null && list2 == null) {
            return null;
        }

        while (currentNode1 != null || currentNode2 != null) {
            var val1 = 200;
            var val2 = 200;
            if (currentNode1 != null) {
                val1 = currentNode1.val;
            }
            if (currentNode2 != null) {
                val2 = currentNode2.val;
            }

            if (val1 <= val2) {
                currentNodeNew.val = val1;
                if (currentNode1 != null) {
                    currentNode1 = currentNode1.next;
                }
            } else {
                currentNodeNew.val = val2;
                if (currentNode2 != null) {
                    currentNode2 = currentNode2.next;
                }
            }

            if (currentNode1 != null || currentNode2 != null) {
                currentNodeNew.next = new ListNode();
                currentNodeNew = currentNodeNew.next;
            }

        }
        return resultList;
    }

}
