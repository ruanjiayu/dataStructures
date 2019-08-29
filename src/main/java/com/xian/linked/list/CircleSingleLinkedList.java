package com.xian.linked.list;

import com.xian.linked.list.bo.BoyNode;

/**
 * @Description: 单向环形链表--解决约瑟夫问题
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

    /**
     * joseph(约瑟夫)出圈问题的解决
     *
     * @param startNo  从第几个小孩开始数整数
     * @param countNum 表示数几下出圈
     * @param nums     表示一开始的人数
     */
    public void joseph(int startNo, int countNum, int nums) {
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("【输入的参数有误,请重新输入】");
            return;
        }
        // 创建一个辅助节点，帮助小孩子出圈
        BoyNode helper = first;
        // 将辅助节点指向最后一个小孩的节点
        while (true) {
            if (helper.getNext() == first) {
                break;
            }
            helper = helper.getNext();
        }
        // 小孩子报数前，先确定是第几个小孩子最先报数的
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        // 当小孩子报数时候，让first和helper指针同时移动(m - 1)次，然后出圈
        while (true) {
            // 说明圈中就一人了
            if (helper == first) {
                break;
            }
            for (int i = 0; i < countNum - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println(String.format("【出圈男孩为第%s号男孩】", first.getNo()));
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.println(String.format("【最后留在圈内的小孩是第%s】", first.getNo()));
    }

}
