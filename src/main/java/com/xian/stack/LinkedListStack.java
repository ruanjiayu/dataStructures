package com.xian.stack;

import com.xian.stack.bo.LinkedListNode;

import javax.swing.text.html.parser.Entity;

/**
 * @Description: 使用链表来模拟栈
 * @Author: fan
 * @DateTime: 2019-08-30 00:53
 * @Version: 0.0.1-SNAPSHOT
 */
public class LinkedListStack<T> {
    /**
     * 头结点
     */
    private LinkedListNode<T> head;
    /**
     * 设置栈的大小
     */
    private int size;

    public LinkedListStack() {
        this.head = new LinkedListNode<>();
    }

    /**
     * 出栈
     */
    public void pop() {
        if (head.getNext() != null) {
            System.out.println("【出栈数据为" + head.getNext());
            // 会被GC算法回收出栈的内容,因为没有被引用了
            head.setNext(head.getNext().getNext());
            size--;
        } else {
            System.out.println("【栈里面已经没有数据了~~】");
        }
    }

    /**
     * 入栈
     *
     * @param value 入栈的值
     */
    public void push(T value) {
        LinkedListNode<T> node = new LinkedListNode<>(value);
        if (head.getNext() != null) {
            node.setNext(head.getNext());
        }
        head.setNext(node);
        size++;
    }


    /**
     * 展示
     */
    public void show() {
        if (head.getNext() == null) {
            System.out.println("【栈里面没有数据】");
            return;
        }
        LinkedListNode temp = head.getNext();
        while (true) {
            if (temp == null) {
                System.out.println("【栈里面已经没有数据了~~】");
                break;
            }
            System.out.println(temp);
            temp = temp.getNext();
        }
        System.out.println("【栈展示完成~~】");
    }
}
