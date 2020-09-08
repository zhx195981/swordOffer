package ListNode.Implement;


public class QueueImplement<T> {
    private ListNodes<T> head = null;
    private ListNodes<T> pre = null;
    int N = 0;

    public T dequeue(){
        if(N == 0)
            return null;
        else{
            N--;
            ListNodes tmp  = pre;
            pre = pre.next;
            return (T)tmp.val;
        }
    }

    public void enqueue(T data){
        N++;
        if(head == null) {
            ListNodes tmp = new ListNodes(data);
            head = tmp;
            pre = tmp;
        }else {
            ListNodes tmp = new ListNodes(data);
            head.next = tmp;
            head = head.next;
        }
    }

    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }

    public T peek(){
        if(N == 0)
            return null;
        else
         return pre.val;
    }

    public static void main(String[] args) {
        QueueImplement<Integer> queue = new QueueImplement();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        queue.enqueue(3);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
