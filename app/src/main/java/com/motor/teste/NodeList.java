package com.motor.teste;

/**
 * 链表排序
 */

public class NodeList {

    public Node sort(Node head){

        if(head==null||head.next == null){
            return head;
        }
        Node cur = head;   //当前节点
        Node tail = null;  //尾节点
        boolean isChange; //元素发生交换标志位，用于优化排序

        while (cur.next!=tail){   //冒泡排序，只交换Node的值，Node的引用顺序保持不变
            isChange = false;
            while (cur.next!=tail){
                if(cur.value>cur.next.value){
                    int temp = cur.value;
                    cur.value = cur.next.value; //交换Node值
                    cur.next.value = temp;
                    isChange = true; //发生了交换，标志位变为true
                }
                cur = cur.next; //挨个遍历
            }
            if(!isChange) break; //如果经过一轮的比较没有发生交换，说明已经排好序，直接结束循环

            tail=cur; //遍历一轮结束后，cur在尾结点
            cur = head; //每次从头开始
        }

        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node();
        n1.value = 3;
        Node n2 = new Node();
        n2.value = 2;
        Node n3 = new Node();
        n3.value = 1;
        n1.next = n2;
        n2.next = n3;

        Node h = new NodeList().sort(n1);
        while (h!=null){
            System.out.println(h.value);
            h = h.next;
        }

    }

}

class Node{
    int value;
    Node next;
}

