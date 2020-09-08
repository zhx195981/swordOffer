package logic;

import java.util.HashMap;

class DoubleNode{
    DoubleNode next = null;
    DoubleNode front = null;
    int key;
    int val;
    DoubleNode(int key, int val){
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    int capacity;
    DoubleNode head = new DoubleNode(0,0);
    DoubleNode tail = new DoubleNode(0,0);
    HashMap<Integer,DoubleNode> map = new HashMap<>();


    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.front = head;
    }

    public int get(int key) {
        if(capacity == 0 || !map.containsKey(key)){
            return -1;
        }else{
            DoubleNode tmpNode = map.get(key);
            moveToFirst(tmpNode);
            return tmpNode.val;
        }

    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            DoubleNode tmpNode =  map.get(key);
            tmpNode.val = value;
            moveToFirst(tmpNode);
        }else{
            if(map.size() == capacity){
                deleteLastNode();
            }
            DoubleNode newNode = new DoubleNode(key,value);
            map.put(key,newNode);
            DoubleNode tmpNode = head.next;
            tmpNode.front = newNode;
            newNode.next = tmpNode;
            head.next = newNode;
            newNode.front = head;
        }

    }

    public void moveToFirst(DoubleNode tmpNode){
        tmpNode.front.next = tmpNode.next;
        tmpNode.next.front = tmpNode.front;
        DoubleNode tmp = head.next;
        head.next = tmpNode;
        tmpNode.front = head;
        tmpNode.next = tmp;
        tmp.front = tmpNode;
    }

    public void deleteLastNode(){
        DoubleNode tmpNode = tail.front;
        tmpNode.front.next = tail;
        tail.front = tmpNode.front;
        map.remove(tmpNode.key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */