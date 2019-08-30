package com.xian.stack.bo;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/8/30  13:12
 * @Version: 0.0.1-SHAPSHOT
 */
public class LinkedListNode<T> {

    private T value;

    private LinkedListNode<T> next;

    public LinkedListNode() {
        // 调用构造器
        this(null);
    }

    public LinkedListNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("【栈内的元素为%s】", value);
    }
}
