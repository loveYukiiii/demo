package com.example.demo.test;

/**
 * @program: demo
 * @description: 链表的使用
 * @author: dennis
 * @create: 2019-05-31 20:28
 **/
public class BuildListNode {
    static ListNode head=null;
    public static void main(String[] args) {
        int[] data={1,2,3,3,3,4,5,3,3};
        ListNode listNode = buildListNode(data);
        head=listNode;
        while (listNode != null){
            System.out.println("val"+listNode.val+"/listNode"+listNode.next.val);
            listNode=listNode.next;
        }
        head=removeElements(head,3);
        listNode=head;
        while (listNode != null){
            System.out.println("val"+listNode.val+"/listNode"+listNode.next);
            listNode=listNode.next;
        }

    }
    public static ListNode buildListNode(int[] input){
        ListNode fisrt=null,last=null,newNode;
        int num;
        if(input.length>0){
            for (int i = 0; i <input.length ; i++) {
                newNode=new ListNode(input[i]);
                newNode.next=null;
                if (fisrt == null) {
                    fisrt=newNode;
                    last=newNode;
                }else {
                    last.next=newNode;
                    last=newNode;
                }
            }
        }


        return fisrt;

    }
    private static ListNode removeElements(ListNode head,int val){
        if (head == null) {
            return null;
        }
        ListNode p=head,q=head.next;
        while (q!=null){
            if(q.val== val){
                p.next=q.next;
                q=q.next;
            }else {
                p=p.next;
                q=q.next;
            }
        }
        if (head.val ==val){
            return head.next;
        }
        return head;
    }

}
