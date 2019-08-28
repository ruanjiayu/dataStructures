package com.xian.linked.list;

/**
 * @Description
 * @Author: fan
 * @DateTime: 2019-08-28 22:07
 * @Version: 0.0.1-SNAPSHOT
 */
public class HeroDoubleNode {
    public int no;

    public String name;

    public String nickName;

    public HeroDoubleNode next;

    public HeroDoubleNode pre;

    public HeroDoubleNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroDoubleNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
