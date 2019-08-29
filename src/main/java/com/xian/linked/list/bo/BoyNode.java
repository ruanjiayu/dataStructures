package com.xian.linked.list.bo;

/**
 * @Description:
 * @Author: fan
 * @DateTime: 2019-08-29 19:53
 * @Version: 0.0.1-SNAPSHOT
 */
public class BoyNode {

    private int no;

    private BoyNode next;

    public BoyNode(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public BoyNode getNext() {
        return next;
    }

    public void setNext(BoyNode next) {
        this.next = next;
    }
}
