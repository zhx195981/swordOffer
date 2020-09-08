package ListNode.Implement;

//https://www.cnblogs.com/ELAIRS/p/12131659.html
class ListNodes<T> {
    T val;
    ListNodes next = null;

    ListNodes(T val) {
        this.val = val;
    }
}

public class StackImplement<T> {

    ListNodes head = null;
    int N = 0;

    public void push(T data) {
        N++;
        if (head == null) {
            head = new ListNodes(data);
            return;
        } else {
            ListNodes tmp = new ListNodes(data);
            tmp.next = head;
            head = tmp;
        }
    }

    public T peek() {
        if(head!=null)
            return (T) head.val;
        return null;
    }

    public T pop() {
        if (head == null) {
            return null;
        } else {
            N--;
            T res = (T) head.val;
            head = head.next;
            return res;
        }
    }

    public boolean isEmpty(){
        return (N == 0);
    }
    public int size(){
        return N;
    }


    public static void main(String[] args) {
        StackImplement<Integer> stack = new StackImplement();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
