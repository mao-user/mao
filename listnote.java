public class listnote {
public static void main(String[] args) {
    ListNode head = new ListNode();
    ListNode answer = new ListNode();
    head.val=1;
    head.next.val=2;
    head.next.next.val=3;
    head.next.next.next.val=4;
    head.next.next.next.next.val=5;
    System.out.println("hello world");
    answer.next = removeElements(head,3);
}
static ListNode removeElements(ListNode head, int val) {
    ListNode end = new ListNode(0);
    end.next = head;
    while(end.next!=null){
        if(end.next.val==val){
            end.next = end.next.next;
        }
            end = end.next;
    }
    return head;
}

}