package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ListSolution {
    ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null)return res;
        if (listNode.next != null) {
            printListFromTailToHead(listNode.next);
        }
        res.add(listNode.val);
        return res;
    }

    public void printListNode(ListNode listNode){
        ListNode tmp = listNode;
        while(tmp != null){
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
        System.out.println(" ");
    }
}
