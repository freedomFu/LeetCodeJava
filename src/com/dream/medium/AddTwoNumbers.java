package com.dream.medium;

import java.util.List;

public class AddTwoNumbers {

    // 测试大整数的时候不成立 ， 所以需要用到大整数加减
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (null != l1){
            sb1.append(l1.val);
            l1 = l1.next;
        }
        String s1 = String.valueOf(sb1.reverse());

        while (null != l2){
            sb2.append(l2.val);
            l2 = l2.next;
        }
        String s2 = String.valueOf(sb2.reverse());
        String sum = String.valueOf(Integer.parseInt(s1) + Integer.parseInt(s2));
        sum = String.valueOf(new StringBuilder(sum).reverse());
        char[] c = sum.toCharArray();

        int len = c.length;

        ListNode ln = new ListNode(0);
        ListNode cur = ln;

        for(int i=0;i<len;i++){
            int x = (int)c[i] - (int)('0');
            cur.next = new ListNode(x);
            cur = cur.next;
        }

        return ln.next;
    }

    public static ListNode ways(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy; //与dummy指向同一个对象，地址是一样的 , current用于每一次变化
        int carry = 0;

        while(l1!=null || l2!=null){
            int v1 = (l1==null) ? 0:l1.val;
            int v2 = (l2==null) ? 0:l2.val;
            int sum = v1+v2+carry;

            carry = sum/10; //获取进位
            current.next = new ListNode(sum%10); //获取这一位的值

            l1 = (l1==null) ? null:l1.next;
            l2 = (l2==null) ? null:l2.next;
            current = current.next;
        }
        // 如果最后一步 carry 还是大于 0 的话
        if(carry>0){
            current.next = new ListNode(carry);
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(5);

        ListNode l3 = ways(l1, l2);
        System.out.println(l3);

    }

}


class ListNode{
    int val;
    ListNode next;

    ListNode(int x){
        val = x;
    }
}