package com.xian.linked.list;

/**
 * @Description
 * @Author: fan
 * @DateTime: 2019-08-28 22:09
 * @Version: 0.0.1-SNAPSHOT
 */
public class DoubleLinkedList {

    private HeroDoubleNode head = new HeroDoubleNode(0, "", "");

    /**
     * 在双向链表内插入数据
     *
     * @param heroDoubleNode 节点
     */
    public void add(HeroDoubleNode heroDoubleNode) {
        HeroDoubleNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroDoubleNode;
        heroDoubleNode.pre = temp;
    }

    /**
     * 双向链表内插入数据，得到一个有序的链表,不能插入同一个对象值，因为对象是地址传递，
     * 也就是对象保存的实际是真实值的在内存中的地址，这样就会导致插入同一个对象，会不停的引用自身，导致死循环
     * 解决的办法就是不让不能插入相同排序号NO的对象值
     *
     * @param heroDoubleNode
     */
    public void addByOrder(HeroDoubleNode heroDoubleNode) {
        HeroDoubleNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no >= heroDoubleNode.no) {
                break;
            }
            temp = temp.next;
        }
        heroDoubleNode.pre = temp;
        heroDoubleNode.next = temp.next;
        if (temp.next != null) {
            temp.next.pre = heroDoubleNode;
        }
        temp.next = heroDoubleNode;
    }

    /**
     * 修改链表内的数据
     *
     * @param newHeroDoubleNode 需要修改的节点数据
     */
    public void update(HeroDoubleNode newHeroDoubleNode) {
        if (head.next == null) {
            System.out.println("【链表为空】");
        }
        // 找到需要修改的节点，根据no编号
        HeroDoubleNode temp = head.next;
        // 判断是否找到该节点
        boolean flag = false;
        while (true) {
            if (temp == null) {
                // 表示找不到
                break;
            }
            if (temp.no == newHeroDoubleNode.no) {
                // 找到
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newHeroDoubleNode.name;
            temp.nickName = newHeroDoubleNode.nickName;
        } else {
            System.out.printf("【不能插入，没有找到%d编号】\n", newHeroDoubleNode.no);
        }
    }

    /**
     * 删除节点，使用内存的回收机制
     *
     * @param deleteNo
     */
    public void delete(int deleteNo) {
        HeroDoubleNode temp = head.next;
        if (temp == null) {
            System.out.println("【链表为空】");
        }
        // 判断是否找到需要删除的节点
        boolean flag = false;
        while (true) {
            if (temp == null) {
                // 已经到最后了
                break;
            }
            if (temp.no == deleteNo) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.println("【要删除的节点不存在】");
        }
    }


    /**
     * 展示双向链表
     */
    public void show() {
        if (head.next == null) {
            System.out.println("【双向链表为空】");
            return;
        }
        HeroDoubleNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
