package heap;

public class Merge_K_Sorted_Lists {
    /*
     * LC-23
     * You are given an array of k linked-lists lists, each linked-list is sorted in
     * ascending order.
     * 
     * Merge all the linked-lists into one sorted linked-list and return it.
     * Example 1:
     * 
     * Input: lists = [[1,4,5],[1,3,4],[2,6]]
     * Output: [1,1,2,3,4,4,5,6]
     * Explanation: The linked-lists are:
     * [
     * 1->4->5,
     * 1->3->4,
     * 2->6
     * ]
     * merging them into one sorted linked list:
     * 1->1->2->3->4->4->5->6
     */
    public class ListNode {
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

    public ListNode mergeKLists(ListNode[] lists) {
        // create a min priority queue and add the head of all the lists in it.
        // use dummy node to capture answer list
        // then remove the top of heap and make it next of dummy node.
        // and add next min element from all the available lists and repeat the process
        ListNode dummy = new ListNode(0, null);
        
        return dummy.next;
    }
}
