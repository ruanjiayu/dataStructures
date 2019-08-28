package com.xian.linked.list;

import java.util.Stack;

/**
 * @Description 单向链表的插入操作
 * @Author: fan
 * @DateTime: 2019-08-20 23:27
 * @Version: 0.0.1-SNAPSHOT
 */
public class SingleLinkedList {

    /**
     * 头节点
     */
    private HeroNode head = new HeroNode(0, "", "");

    /**
     * 直接在单向链表的后面插入
     *
     * @param heroNode 节点
     */
    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    /**
     * 排序插入
     *
     * @param heroNode 节点
     */
    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            // 说明已经在链表的结尾类
            if (temp.next == null) {
                break;
            }
            // 位置就在temp的后面
            if (temp.next.no > heroNode.no) {
                break;
            } else if (temp.next.no == heroNode.no) {
                // 说明出现重复序号
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            heroNode.next = temp.next;
            temp.next = heroNode;
        } else {
            System.out.printf("【不能插入，%d号出现重复】\n", heroNode.no);
        }
    }

    /**
     * 修改链表内的数据
     *
     * @param newHeroNode 需要修改的节点数据
     */
    public void update(HeroNode newHeroNode) {
        if (head.next == null) {
            System.out.println("【链表为空】");
        }
        // 找到需要修改的节点，根据no编号
        HeroNode temp = head.next;
        // 判断是否找到该节点
        boolean flag = false;
        while (true) {
            if (temp == null) {
                // 表示找不到
                break;
            }
            if (temp.no == newHeroNode.no) {
                // 找到
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newHeroNode.name;
            temp.nickName = newHeroNode.nickName;
        } else {
            System.out.printf("【不能插入，没有找到%d编号】\n", newHeroNode.no);
        }
    }

    /**
     * 删除节点，使用内存的回收机制
     *
     * @param deleteNo
     */
    public void delete(int deleteNo) {
        if (head.next == null) {
            System.out.println("【链表为空】");
        }
        HeroNode temp = head;
        // 判断是否找到需要删除的节点
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                // 已经到最后了
                break;
            }
            if (temp.next.no == deleteNo) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("【要删除的节点不存在】");
        }
    }

    /**
     * 将单链表进行反转
     *
     * @param head
     */
    public static void reverseList(HeroNode head) {
        // 如果当前链表为空或者只有一个节点，无需反转，直接进行返回
        if (head.next == null || head.next.next == null) {
            return;
        }
        // 定义一个辅助指针，来帮助我们便利原来的链表
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0, "", "");
        //便利原来的链表，每便利一个节点，就将其取出，并放在新的链表reverseHead顶端
        while (cur != null) {
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }

    /**
     * 将链表从倒序打印出来
     * @param head
     */
    public static void reservePrint(HeroNode head) {
        if (head.next == null) {
            return;
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.next;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

    /**
     * 展示单向链表
     */
    public void show() {
        if (head.next == null) {
            System.out.println("【链表为空】");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public HeroNode getHead() {
        return head;
    }
}
