package com.motor.teste;

/**
 * Created by 15dcc on 2018/5/31.
 */

public class fff {
    //冒泡排序
    public static ListNode bubbleSort(ListNode head){
        if(head == null || head.next == null)  //链表为空或者仅有单个结点
            return head;

        ListNode cur = null; //当前节点
        ListNode tail = null; //尾节点

        cur = head; //将头结点赋值给当前节点

        while(cur.next != tail){ //当前节点的下一个节点不是尾节点时循环历遍
            while(cur.next != tail){ //当前节点的下一个节点不是尾节点时循环历遍
                if(cur.val > cur.next.val){
                    int tmp = cur.val;
                    cur.val = cur.next.val;
                    cur.next.val = tmp; //如果当前节点的值大于下一个节点的值，那么将交换值
                }
                cur = cur.next; //将下一个节点赋给当前节点
            }
            tail = cur;  //下一次遍历的尾结点是当前结点(仔细琢磨一下里面的道道)
            cur = head;     //遍历起始结点重置为头结点
        }

        ListNode n = head;
        while (n!=null){
            System.out.println(n.val);
            n = n.next;
        }

        return head;

    }



    public static void main(String[] args) {
        ListNode n1 = new ListNode();
        n1.val = 3;
        ListNode n2 = new ListNode();
        n2.val = 2;
        ListNode n3 = new ListNode();
        n3.val = 1;
        n1.next = n2;
        n2.next = n3;

        bubbleSort(n1);

    }

}

class ListNode{
    int val;
    ListNode next;
}

