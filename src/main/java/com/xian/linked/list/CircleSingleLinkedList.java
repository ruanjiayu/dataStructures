package com.xian.linked.list;

import com.xian.linked.list.bo.BoyNode;

/**
 * @Description: 单向环形链表--约瑟夫问题
 * @Author: fan
 * @DateTime: 2019-08-29 19:48
 * @Version: 0.0.1-SNAPSHOT
 */
public class CircleSingleLinkedList {

    private BoyNode first = null;

    /**
     * 向单向环形链表内添加数据
     *
     * @param nums
     */
    public void add(int nums) {
        if (nums < 1) {
            System.out.println("【nums的值不对】");
            return;
        }
        // 辅助指针，帮助构建环形链表
        BoyNode curBoy = null;
        for (int i = 1; i <= nums; i++) {
            BoyNode boyNode = new BoyNode(i);
            if (i == 1) {
                first = boyNode;
                first.setNext(first);
                curBoy = first;
            } else {
                curBoy.setNext(boyNode);
                boyNode.setNext(first);
                curBoy = boyNode;
            }
        }
    }

    /**
     * 对单向环形链表进行展示
     */
    public void show() {
        if (first == null) {
            System.out.println("【没有任何节点～～】");
            return;
        }
        // 因为first节点不能移动，所以我们需要一个辅助节点来完成遍历
        BoyNode curBoy = first;
        while (true) {
            System.out.println(String.format("【小孩的编号为:%s】", curBoy.getNo()));
            if (curBoy.getNext() == first) {
                break;
            }
            curBoy = curBoy.getNext();
        }
    }

}
